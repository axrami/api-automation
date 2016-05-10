package lpApiAutomation.networking;

import com.google.common.net.MediaType;
import com.mastfrog.acteur.headers.Headers;
import com.mastfrog.netty.http.client.HttpClient;
import com.mastfrog.netty.http.client.ResponseHandler;
import com.mastfrog.netty.http.client.State;
import com.mastfrog.netty.http.client.StateType;
import com.mastfrog.util.thread.Receiver;
import io.netty.handler.codec.http.HttpHeaders;
import io.netty.handler.codec.http.HttpResponseStatus;
import lpApiAutomation.models.LpHttpResponse;
import org.joda.time.Instant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.IOException;
import java.util.function.Function;

/**
 * Created by andrew on 4/9/16.
 */
public class ConnectionHandler {
    private Logger logger = LoggerFactory.getLogger("ConnectionHandler");

    // netty setup
    private int availableProcessors = Runtime.getRuntime().availableProcessors();
    private HttpClient client = HttpClient.builder().threadCount(availableProcessors * 2).build();

    public ConnectionHandler() {
    }

    public void sendPostRequest(String url, String postBody, LpHttpResponse lpHttpResponse, final Function postReqCallback) {
        try {
            client.post()
                    .setURL(url)
                    .addHeader(Headers.stringHeader("Content-type"), "application/json")
                    .addHeader(Headers.stringHeader("X-LivepersonMobile-Capabilities"), "account-skills")
                    .setBody(postBody, MediaType.JSON_UTF_8)
                    .onEvent(new Receiver<State<?>>() {
                        Instant start;
                        Instant stop;

                        @Override
                        public void receive(State<?> state) {
                            if (state.stateType() == StateType.Connected) {
                                start = new Instant();
                            }
                            if (state.stateType() == StateType.FullContentReceived) {
                                stop = new Instant();
                                lpHttpResponse.setLatency(stop.getMillis() - start.getMillis());
                            }
                        }
                    }).execute(new ResponseHandler<String>(String.class) {
                @Override
                protected void receive(HttpResponseStatus status, HttpHeaders headers, String response) {
                    logger.debug("post status: " + status.code() + " url: " + url);
                    lpHttpResponse.setResponseCode(status.code());
                    lpHttpResponse.setHttpResposne(response);
                    lpHttpResponse.setSuccuess(true);
                    postReqCallback.apply(lpHttpResponse);
                }

                @Override
                protected void onErrorResponse(HttpResponseStatus status, HttpHeaders headers, String response) {
                    logger.debug("*********** ERROR ***********");
                    logger.debug("*** " + url + " ***");
                    logger.debug("*** " + status.code() + "***");
                    logger.debug("*********** ERROR ***********");
                    lpHttpResponse.setResponseCode(status.code());
                    lpHttpResponse.setHttpResposne(response);
                    lpHttpResponse.setSuccuess(false);
                    postReqCallback.apply(lpHttpResponse);
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package lpApiAutomation.networking;

import lpApiAutomation.builders.RequestBuilder;
import lpApiAutomation.configuration.RequestType;
import lpApiAutomation.models.LpHttpResponse;

/**
 * Created by andrew on 4/9/16.
 */
public class Request {
    private RequestType requestType;
    private LpHttpResponse lpHttpResponse = new LpHttpResponse();
    private ConnectionHandler connectionHandler = new ConnectionHandler();
    private String url;
    private String postBody;

    public Request(RequestBuilder requestBuilder) {
        this.requestType = requestBuilder.getType();
        this.url = requestBuilder.getUrl();
        this.postBody = requestBuilder.getPostBody();
    }

    private void requestCallback(LpHttpResponse result) {
        this.lpHttpResponse = result;
    }

    public void execute() {
        connectionHandler.sendPostRequest(url, postBody, lpHttpResponse, this::requestCallback );
    }

    private Object requestCallback(Object o) {

        return requestType;
    }

    public RequestType getType() {
        return requestType;
    }

}

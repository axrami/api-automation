package lpApiAutomation.builders;

import lpApiAutomation.configuration.RequestType;
import lpApiAutomation.models.LpHttpResponse;

/**
 * Created by andrew on 4/20/16.
 */
public class LpHttpResponseBuilder {
    private boolean expectedFailure = false;
    private RequestType requesttype;
    private int responseCode;
    private String visit_id;
    private String httpResposne;
    private String url;
    private String continue_url;
    private String postBody;
    private int latency;
    private String app_id;

    public LpHttpResponseBuilder() {}

    public LpHttpResponse build() {
        return new LpHttpResponse(this);
    }

    public String getApp_id() {
        return app_id;
    }

    public LpHttpResponseBuilder setApp_id(String app_id) {
        this.app_id = app_id;
        return this;
    }

    public String getContinue_url() {
        return continue_url;
    }

    public LpHttpResponseBuilder setContinue_url(String continue_url) {
        this.continue_url = continue_url;
        return this;
    }

    public boolean isExpectedFailure() {
        return expectedFailure;
    }

    public LpHttpResponseBuilder setExpectedFailure(boolean expectedFailure) {
        this.expectedFailure = expectedFailure;
        return this;
    }

    public String getHttpResposne() {
        return httpResposne;
    }

    public LpHttpResponseBuilder setHttpResposne(String httpResposne) {
        this.httpResposne = httpResposne;
        return this;
    }

    public int getLatency() {
        return latency;
    }

    public LpHttpResponseBuilder setLatency(int latency) {
        this.latency = latency;
        return this;
    }

    public String getPostBody() {
        return postBody;
    }

    public LpHttpResponseBuilder setPostBody(String postBody) {
        this.postBody = postBody;
        return this;
    }

    public RequestType getRequesttype() {
        return requesttype;
    }

    public LpHttpResponseBuilder setRequesttype(RequestType requesttype) {
        this.requesttype = requesttype;
        return this;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public LpHttpResponseBuilder setResponseCode(int responseCode) {
        this.responseCode = responseCode;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public LpHttpResponseBuilder setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getVisit_id() {
        return visit_id;
    }

    public LpHttpResponseBuilder setVisit_id(String visit_id) {
        this.visit_id = visit_id;
        return this;
    }
}

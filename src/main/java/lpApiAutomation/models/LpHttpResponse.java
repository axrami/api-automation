package lpApiAutomation.models;

import lpApiAutomation.builders.LpHttpResponseBuilder;
import lpApiAutomation.configuration.RequestType;

/**
 * Created by andrew on 4/20/16.
 */
public class LpHttpResponse {
    private boolean expectedFailure = false;
    private RequestType requesttype;
    private int responseCode;
    private String visit_id;
    private String httpResposne;
    private String url;
    private String continue_url;
    private String postBody;
    private long latency;
    private String app_id;
    private boolean succuess;

    public LpHttpResponse() {}
    public LpHttpResponse(LpHttpResponseBuilder builder) {
        this.expectedFailure = builder.isExpectedFailure();
        this.requesttype = builder.getRequesttype();
        this.responseCode = builder.getResponseCode();
        this.visit_id = builder.getVisit_id();
        this.httpResposne = builder.getHttpResposne();
        this.url = builder.getUrl();
        this.continue_url = builder.getContinue_url();
        this.postBody = builder.getPostBody();
        this.latency = builder.getLatency();
        this.app_id = builder.getApp_id();
    }

    public String getApp_id() {
        return app_id;
    }

    public void setApp_id(String app_id) {
        this.app_id = app_id;
    }

    public String getContinue_url() {
        return continue_url;
    }

    public void setContinue_url(String continue_url) {
        this.continue_url = continue_url;
    }

    public boolean isExpectedFailure() {
        return expectedFailure;
    }

    public void setExpectedFailure(boolean expectedFailure) {
        this.expectedFailure = expectedFailure;
    }

    public String getHttpResposne() {
        return httpResposne;
    }

    public void setHttpResposne(String httpResposne) {
        this.httpResposne = httpResposne;
    }

    public long getLatency() {
        return latency;
    }

    public void setLatency(long latency) {
        this.latency = latency;
    }

    public String getPostBody() {
        return postBody;
    }

    public void setPostBody(String postBody) {
        this.postBody = postBody;
    }

    public RequestType getRequesttype() {
        return requesttype;
    }

    public void setRequesttype(RequestType requesttype) {
        this.requesttype = requesttype;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getVisit_id() {
        return visit_id;
    }

    public void setVisit_id(String visit_id) {
        this.visit_id = visit_id;
    }

    public boolean isSuccuess() {
        return succuess;
    }

    public void setSuccuess(boolean succuess) {
        this.succuess = succuess;
    }

}

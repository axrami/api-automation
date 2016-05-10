package lpApiAutomation.builders;

import lpApiAutomation.configuration.RequestType;
import lpApiAutomation.networking.Request;

/**
 * Created by andrew on 4/9/16.
 */
public class RequestBuilder {
    private RequestType type;
    private String url;
    private String postBody;

    public Request build() {
        return new Request(this);
    }

    public RequestBuilder setReqeustType(RequestType type) {
        this.type = type;
        return this;
    }


    public RequestType getType() {
        return type;
    }

    public String getPostBody() {
        return postBody;
    }

    public void setPostBody(String postBody) {
        this.postBody = postBody;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

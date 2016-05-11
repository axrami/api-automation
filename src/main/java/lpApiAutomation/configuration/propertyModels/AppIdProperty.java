package lpApiAutomation.configuration.propertyModels;

/**
 * Created by andrew on 5/10/16.
 */
public class AppIdProperty extends PropertyOption {
    private String appId = "";

    public void setOverride(String appid) {
        this.isOverride = true;
        this.appId = appid;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        if(!isOverride)
            this.appId = appId;
    }
}

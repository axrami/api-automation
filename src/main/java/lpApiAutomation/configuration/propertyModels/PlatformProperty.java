package lpApiAutomation.configuration.propertyModels;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andrew on 5/10/16.
 */
public class PlatformProperty extends PropertyOption {
    private String platform = "";
    private List<String> platforms = new ArrayList<>();

    public void setOverride(String platformOverride) {
        this.isOverride = true;
        this.platform = platformOverride;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        if(!isOverride)
            this.platform = platform;
    }
}

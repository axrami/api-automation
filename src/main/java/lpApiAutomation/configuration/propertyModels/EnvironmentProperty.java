package lpApiAutomation.configuration.propertyModels;

/**
 * Created by andrew on 5/10/16.
 */
public class EnvironmentProperty extends PropertyOption{
    private String environment;

    public void setOverride(String environmentOverrdie) {
        this.isOverride = true;
        this.environment = environmentOverrdie;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        if(!isOverride)
            this.environment = environment;
    }

}

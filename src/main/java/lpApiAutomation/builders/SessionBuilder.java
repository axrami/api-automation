package lpApiAutomation.builders;

import lpApiAutomation.configuration.Platforms;
import lpApiAutomation.models.AppSettings;
import lpApiAutomation.models.LpVisitor;
import lpApiAutomation.models.Session;

import java.util.Properties;

/**
 * Created by andrew on 4/9/16.
 */
public class SessionBuilder {
    private LpVisitor visitor = new LpVisitor();
    private AppSettings appSettings = new AppSettingsBuilder(Platforms.IOS, "P36511428").build();
    private Properties properties = new Properties();

    public Session build() {
        return new Session(this);
    }

    public SessionBuilder setLpVisitor(LpVisitor visitor) {
        this.visitor = visitor;
        return this;
    }

    public SessionBuilder setAppSettings(AppSettings appSettings) {
        this.appSettings = appSettings;
        return this;
    }

    public SessionBuilder sessionBuilder(Properties properties) {
        this.properties = properties;
        return this;
    }

    public AppSettings getAppSettings() {
        return appSettings;
    }

    public Properties getProperties() {
        return properties;
    }

    public LpVisitor getVisitor() {
        return visitor;
    }
}

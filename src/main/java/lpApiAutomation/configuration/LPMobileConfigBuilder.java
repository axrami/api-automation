package lpApiAutomation.configuration;

import lpApiAutomation.configuration.propertyModels.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by andrew on 4/15/16.
 */
public class LPMobileConfigBuilder {
    private static Logger logger = LoggerFactory.getLogger("LPMobileConfig");

    // properties
    private String propertiesFilePath;

    // Generator settings
    private VisitsProperty visitsProperty = new VisitsProperty().setNumberOfVisits(0);
    private ChatsProperty chatsProperty = new ChatsProperty().setNumberOfChats(0);
    private RunTimeProperty runTimeProperty = new RunTimeProperty().setRunTime(0);
    private ReportProperty reportProperty = new ReportProperty().setReportType("html");
    private PlatformProperty platformProperty = new PlatformProperty();
    private EnvironmentProperty environmentProperty = new EnvironmentProperty();
    private AppIdProperty appIdProperty = new AppIdProperty();
    private boolean isLoadTest = false;


    public LPMobileConfigBuilder() {

    }

    public LPMobileConfig build() {
        return new LPMobileConfig(this);
    }

    // Override property vales
    public LPMobileConfigBuilder setOverrideVisits(int numberOfVisits) {
        this.visitsProperty.setOverride(numberOfVisits);
        return this;
    }

    public LPMobileConfigBuilder setOverrideChats(int numberOfChats) {
        this.chatsProperty.setOverride(numberOfChats);
        return this;
    }

    public LPMobileConfigBuilder setOverrideRunTime(int runTime) {
        this.runTimeProperty.setOverride(runTime);
        return this;
    }

    public LPMobileConfigBuilder setOverrideEnvironment(String environment) {
        this.environmentProperty.setOverride(environment);
        return this;
    }

    public LPMobileConfigBuilder setOverridePlatform(String platform) {
        this.platformProperty.setOverride(platform);
        return this;
    }

    public LPMobileConfigBuilder setOverrideReport(String report) {
        this.reportProperty.setOverride(report);
        return this;
    }

    public LPMobileConfigBuilder setOverrideAppId(String appId){
        this.appIdProperty.setOverride(appId);
        return this;
    }

    // getter & setter

    public String getPropertiesFilePath() {
        return propertiesFilePath;
    }

    public void setPropertiesFilePath(String propertiesFilePath) {
        this.propertiesFilePath = propertiesFilePath;
    }

    public boolean isLoadTest() {
        return isLoadTest;
    }

    public LPMobileConfigBuilder setIsLoadTest(boolean isLoadTest) {
        this.isLoadTest = isLoadTest;
        return this;
    }

    public ChatsProperty getChatsProperty() {
        return chatsProperty;
    }

    public EnvironmentProperty getEnvironmentProperty() {
        return environmentProperty;
    }

    public PlatformProperty getPlatformProperty() {
        return platformProperty;
    }

    public ReportProperty getReportProperty() {
        return reportProperty;
    }

    public RunTimeProperty getRunTimeProperty() {
        return runTimeProperty;
    }

    public VisitsProperty getVisitsProperty() {
        return visitsProperty;
    }

    public AppIdProperty getAppIdProperty() {
        return appIdProperty;
    }
}

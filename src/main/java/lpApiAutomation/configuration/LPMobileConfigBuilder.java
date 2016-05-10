package lpApiAutomation.configuration;

import com.mastfrog.netty.http.client.HttpClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * Created by andrew on 4/15/16.
 */
public class LPMobileConfigBuilder {
    private static Logger logger = LoggerFactory.getLogger("LPMobileConfig");

    // properties
    private String propertiesFilePath;

    // Generator settings
    private int visits = 0;
    private int chats = 0;
    private int time = 0;
    private int runTime = 0;
    private String report = "html";
    private boolean isLoadTest = false;

    // general settings
    private String environment = "staging";
    private String appid = "P36511428";
    private String platform = "Web";
    private String getPropertiesFilePath;

    public LPMobileConfigBuilder() {

    }

    public LPMobileConfig build() {
        return new LPMobileConfig(this);
    }

    public String getAppid() {
        return appid;
    }

    public LPMobileConfigBuilder setAppid(String appid) {
        this.appid = appid;
        return this;
    }

    public int getChats() {
        return chats;
    }

    public LPMobileConfigBuilder setChats(int chats) {
        this.chats = chats;
        return this;
    }

    public String getEnvironment() {
        return environment;
    }

    public LPMobileConfigBuilder setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }

    public String getGetPropertiesFilePath() {
        return getPropertiesFilePath;
    }

    public LPMobileConfigBuilder setGetPropertiesFilePath(String getPropertiesFilePath) {
        this.getPropertiesFilePath = getPropertiesFilePath;
        return this;
    }

    public boolean isLoadTest() {
        return isLoadTest;
    }

    public LPMobileConfigBuilder setIsLoadTest(boolean isLoadTest) {
        this.isLoadTest = isLoadTest;
        return this;
    }

    public String getPlatform() {
        return platform;
    }

    public LPMobileConfigBuilder setPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    public String getPropertiesFilePath() {
        return propertiesFilePath;
    }

    public LPMobileConfigBuilder setPropertiesFilePath(String propertiesFilePath) {
        this.propertiesFilePath = propertiesFilePath;
        return this;
    }

    public String getReport() {
        return report;
    }

    public LPMobileConfigBuilder setReport(String report) {
        this.report = report;
        return this;
    }

    public int getTime() {
        return time;
    }

    public LPMobileConfigBuilder setTime(int time) {
        this.time = time;
        return this;
    }

    public int getVisits() {
        return visits;
    }

    public LPMobileConfigBuilder setVisits(int visits) {
        this.visits = visits;
        return this;
    }

    public int getRunTime() {
        return runTime;
    }

    public LPMobileConfigBuilder setRunTime(int runTime) {
        this.runTime = runTime;
        return this;
    }
}

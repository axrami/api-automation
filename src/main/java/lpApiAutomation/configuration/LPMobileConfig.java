package lpApiAutomation.configuration;

import com.mastfrog.netty.http.client.HttpClient;
import lpApiAutomation.configuration.propertyModels.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Singleton;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * Created by andrew on 4/9/16.
 */

@Singleton
public class LPMobileConfig {
    private static Logger logger = LoggerFactory.getLogger("LPMobileConfig");
    // properties
    private Map<String, String> systemVars = System.getenv();
    private String propertiesPath;
    private Properties properties;

    // Generator settings
    private Visits visits = new Visits();
    private Chats chats = new Chats();
    private RunTime runTime = new RunTime();
    private Report report = new Report();
    private boolean isLoadTest = false;

    // property file values
    private String dispatchUrlOverride;
    private String[] propertyFileOptions = {
            "dispatchUrlOverride",
            "environment",
            "visits",
            "chats",
            "runTime",
            "report",
            "loadTest"
    };

    // environment
    private String environment;

    // app settings
    private static final String DOMAIN_PRODUCTION = "dispatch.look.io";
    private static final String DOMAIN_PRODUCTION_VPC = "va.lpm.liveperson.net";
    private static final String DOMAIN_STAGING = "dispatch.staging.look.io";
    private static final String DOMAIN_STAGING_VPC = "va-a.lpm.liveperson.net";
    private static final String DOMAIN_QA = "dispatch.qa.liveperson.io";
    private static final String DOMAIN_DEVELOPMENT = "dispatch.dev.liveperson.io";
    private static final String DOMAIN_LOCAL = "dispatch.local.liveperson.io";
    private static final String DOMAIN_STAGING_VA = "va-a.lpm.liveperson.net";
    private static final String DOMAIN_STAGING_VA_TAG = "tag-va-a.lpm.liveperson.net";
    private static final String DOMAIN_STAGING_TAG = "tag.staging.look.io";
    private static final String DOMAIN_PRE_PRODUCTION = "dispatch-prod-test.look.io";

    public LPMobileConfig(LPMobileConfigBuilder builder) {
        this.visits = builder.getVisits();
        this.chats = builder.getChats();
        this.time = builder.getTime();
        this.report = builder.getReport();
        this.isLoadTest = builder.isLoadTest();
    }

    private void getPropertiesFile() {
        if(propertiesPath != null) {
            try {
                this.properties = new Properties();
                InputStream propertiesInput = new FileInputStream(propertiesPath);
                this.properties.load(propertiesInput);
                parsePropertiesFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void parsePropertiesFile() throws IOException {
        for(String prop : propertyFileOptions) {
            if(this.properties.containsKey(prop)) {
                switch (prop) {
                    case "dispatchUrlOverride":
                        break;
                    case "environment":
                        break;
                    case "visits":
                        if(!isOverride(this.visits)) {
                            this.visits.setNumberOfVisits(getPropertyIntValue(prop));
                        }
                        break;
                    case "chats":
                        if(!isOverride(this.chats)) {
                            this.chats.setNumberOfChats(getPropertyIntValue(prop));
                        }
                        break;
                    case "runTime":
                        if(!isOverride(this.runTime)) {
                            this.runTime.setRunTime(getPropertyIntValue(prop));
                        }
                        break;
                    case "report":
                        if(!isOverride(this.report)) {
                            this.report.setReportType(getPropertyStingValue(prop));
                        }
                        break;
                    case "loadTest":
                        this.isLoadTest = Boolean.getBoolean(properties.getProperty(prop));
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid property value: " + prop);
                }
            }
        }
    }

    private String getPropertyStingValue(String option) {
        return properties.getProperty(option);
    }

    private int getPropertyIntValue(String option) {
        return Integer.parseInt(properties.getProperty(option));
    }

    private boolean isOverride(PropertyOption option) {
        return option.isOverride();
    }

}

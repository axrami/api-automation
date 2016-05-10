package lpApiAutomation.models;

import lpApiAutomation.builders.AppSettingsBuilder;
import lpApiAutomation.builders.RequestBuilder;
import lpApiAutomation.builders.SessionBuilder;
import lpApiAutomation.configuration.Platforms;
import lpApiAutomation.configuration.RequestType;
import lpApiAutomation.networking.Request;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;

/**
 * Created by andrew on 4/9/16.
 */
public class Session {
    private Logger logger = LoggerFactory.getLogger("lpApiAutomation.builders.Session");
    private LpVisitor visitor;
    private AppSettings appSettings;
    private Properties properties;

    public Session(SessionBuilder sessionBuilder) {

    }

    public void beginVisit() {
        RequestBuilder vb = new RequestBuilder();
        vb.setReqeustType(RequestType.VISIT);
    }

    public void beginChat() {

    }
}

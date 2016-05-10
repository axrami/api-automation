package lpApiAutomation.json;

import com.sun.tools.internal.xjc.runtime.JAXBContextFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import org.eclipse.persistence.jaxb.UnmarshallerProperties;
import org.eclipse.persistence.jaxb.MarshallerProperties;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * Created by andrew on 4/22/16.
 */
public class JsonMarshaller {
    private static Logger logger = LoggerFactory.getLogger("JsonMarshaller");

    public Object unmarshalJson(String string, Class clazz) {
        try {
            StreamSource responseJson = new StreamSource(new StringReader("{\"response\":" + string + "}"));
            JAXBContext jaxbContext = JAXBContextFactory.createContext(new Class[]{clazz}, null);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            unmarshaller.setProperty(UnmarshallerProperties.MEDIA_TYPE, "application/json");
            unmarshaller.setProperty(UnmarshallerProperties.JSON_INCLUDE_ROOT, true);
            return unmarshaller.unmarshal(responseJson, clazz).getValue();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String marshalObj(Object obj, Class clazz) {
        try {
            JAXBContext jaxbContext = JAXBContextFactory.createContext(new Class[]{clazz}, null);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(MarshallerProperties.MEDIA_TYPE, "application/json");
            marshaller.setProperty(UnmarshallerProperties.JSON_INCLUDE_ROOT, false);
            StringWriter sw = new StringWriter();
            marshaller.marshal(obj, sw);
            return sw.toString();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }
}

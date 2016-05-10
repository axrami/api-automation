package lpApiAutomation.json.requestModels;

import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Map;

/**
 * Created by andrew on 4/22/16.
 */
@XmlRootElement
public class CustomVariable {
    Map<String, String> var;

    public CustomVariable() {
    }

    public CustomVariable(Map<String, String> var) {
        this.var = var;
    }


    @XmlElementWrapper(name="andrew")
    public Map<String, String> getVar() {
        return this.var;
    }

    public void setVar(Map<String, String> var) {
        this.var = var;
    }
}
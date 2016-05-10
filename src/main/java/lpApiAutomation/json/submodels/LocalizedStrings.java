package lpApiAutomation.json.submodels;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by andrew on 4/22/16.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="localized_strings")
public class LocalizedStrings {
    private String language;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}

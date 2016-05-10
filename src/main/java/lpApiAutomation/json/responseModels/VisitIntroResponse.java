package lpApiAutomation.json.responseModels;

import lpApiAutomation.json.submodels.LocalizedStrings;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by andrew on 4/22/16.
 */
@XmlRootElement
public class VisitIntroResponse {
    private String visit_id;
    private String button_text;
    private String button_text_color;
    private String button_tint;
    private Object button;
    private int button_visibility;
    private Object default_availability;
    private int enabled;
    private int voice_enabled;
    private String welcome_text;
    private String default_language;
    private List<String> supported_languages;
    private boolean surveys_enabled;
    private boolean hide_email_chat;
    private int next_interval;
    private String continue_url;
    private int show_exit_survey_condition;
    private String mask_cc;
    private String visit_url;
    private Object branding;
    private String branding_md5;
    private boolean request_visitor_id;
    private LocalizedStrings localized_strings;

    public Object getBranding() {
        return branding;
    }

    public void setBranding(Object branding) {
        this.branding = branding;
    }

    public String getBranding_md5() {
        return branding_md5;
    }

    public void setBranding_md5(String branding_md5) {
        this.branding_md5 = branding_md5;
    }

    public Object getButton() {
        return button;
    }

    public void setButton(Object button) {
        this.button = button;
    }

    public String getButton_text() {
        return button_text;
    }

    public void setButton_text(String button_text) {
        this.button_text = button_text;
    }

    public String getButton_text_color() {
        return button_text_color;
    }

    public void setButton_text_color(String button_text_color) {
        this.button_text_color = button_text_color;
    }

    public String getButton_tint() {
        return button_tint;
    }

    public void setButton_tint(String button_tint) {
        this.button_tint = button_tint;
    }

    public int getButton_visibility() {
        return button_visibility;
    }

    public void setButton_visibility(int button_visibility) {
        this.button_visibility = button_visibility;
    }

    public String getContinue_url() {
        return continue_url;
    }

    public void setContinue_url(String continue_url) {
        this.continue_url = continue_url;
    }

    public Object getDefault_availability() {
        return default_availability;
    }

    public void setDefault_availability(Object default_availability) {
        this.default_availability = default_availability;
    }

    public String getDefault_language() {
        return default_language;
    }

    public void setDefault_language(String default_language) {
        this.default_language = default_language;
    }

    public int getEnabled() {
        return enabled;
    }

    public void setEnabled(int enabled) {
        this.enabled = enabled;
    }

    public boolean isHide_email_chat() {
        return hide_email_chat;
    }

    public void setHide_email_chat(boolean hide_email_chat) {
        this.hide_email_chat = hide_email_chat;
    }

    public LocalizedStrings getLocalized_strings() {
        return localized_strings;
    }

    public void setLocalized_strings(LocalizedStrings localized_strings) {
        this.localized_strings = localized_strings;
    }

    public String getMask_cc() {
        return mask_cc;
    }

    public void setMask_cc(String mask_cc) {
        this.mask_cc = mask_cc;
    }

    public int getNext_interval() {
        return next_interval;
    }

    public void setNext_interval(int next_interval) {
        this.next_interval = next_interval;
    }

    public boolean isRequest_visitor_id() {
        return request_visitor_id;
    }

    public void setRequest_visitor_id(boolean request_visitor_id) {
        this.request_visitor_id = request_visitor_id;
    }

    public int getShow_exit_survey_condition() {
        return show_exit_survey_condition;
    }

    public void setShow_exit_survey_condition(int show_exit_survey_condition) {
        this.show_exit_survey_condition = show_exit_survey_condition;
    }

    public List<String> getSupported_languages() {
        return supported_languages;
    }

    public void setSupported_languages(List<String> supported_languages) {
        this.supported_languages = supported_languages;
    }

    public boolean isSurveys_enabled() {
        return surveys_enabled;
    }

    public void setSurveys_enabled(boolean surveys_enabled) {
        this.surveys_enabled = surveys_enabled;
    }

    public String getVisit_id() {
        return visit_id;
    }

    public void setVisit_id(String visit_id) {
        this.visit_id = visit_id;
    }

    public String getVisit_url() {
        return visit_url;
    }

    public void setVisit_url(String visit_url) {
        this.visit_url = visit_url;
    }

    public int getVoice_enabled() {
        return voice_enabled;
    }

    public void setVoice_enabled(int voice_enabled) {
        this.voice_enabled = voice_enabled;
    }

    public String getWelcome_text() {
        return welcome_text;
    }

    public void setWelcome_text(String welcome_text) {
        this.welcome_text = welcome_text;
    }
}

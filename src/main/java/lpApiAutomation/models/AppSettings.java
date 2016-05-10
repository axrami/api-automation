package lpApiAutomation.models;

import lpApiAutomation.builders.AppSettingsBuilder;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by andrew on 4/9/16.
 */
@XmlRootElement
public class AppSettings {
    private String version;
    private String type;
    private String ip_address;
    private String app_id;
    private String platform;
    private String sdk_version;
    private String platform_version;
    private String device_id;
    private String alternate_device_id;
    private String limit_ad_tracking;
    private String device_type;
    private String locale;
    private String language;
    private String strings_hash;
    private String view_name;
    private String skill;
    private String site_id;
    private String property_id;
    private String branding_md5;
    private boolean request_visitor_id;
    private String visitor_id;
    private String host;
    private String visit_id;
    private boolean app_foregrounded;
    private String connection_type;
    private String platform_release;
    private String current_skill;

    public AppSettings(AppSettingsBuilder appSettingsBuilder) {
        this.version = appSettingsBuilder.getVersion();
        this.type = appSettingsBuilder.getType();
        this.ip_address = appSettingsBuilder.getIp_address();
        this.app_id = appSettingsBuilder.getApp_id();
        this.platform = appSettingsBuilder.getPlatform();
        this.sdk_version = appSettingsBuilder.getSdk_version();
        this.platform_version = appSettingsBuilder.getPlatform_version();
        this.device_id = appSettingsBuilder.getDevice_id();
        this.alternate_device_id = appSettingsBuilder.getAlternate_device_id();
        this.limit_ad_tracking = appSettingsBuilder.getLimit_ad_tracking();
        this.device_type = appSettingsBuilder.getDevice_type();
        this.locale = appSettingsBuilder.getLocale();
        this.language = appSettingsBuilder.getLanguage();
        this.strings_hash = appSettingsBuilder.getStrings_hash();
        this.view_name = appSettingsBuilder.getView_name();
        this.skill = appSettingsBuilder.getSkill();
        this.site_id = appSettingsBuilder.getSite_id();
        this.property_id = appSettingsBuilder.getProperty_id();
        this.branding_md5 = appSettingsBuilder.getBranding_md5();
        this.request_visitor_id = appSettingsBuilder.isRequest_visitor_id();
        this.visitor_id = appSettingsBuilder.getVisitor_id();
        this.host = appSettingsBuilder.getHost();
        this.visit_id = appSettingsBuilder.getVisit_id();
        this.app_foregrounded = appSettingsBuilder.isApp_foregrounded();
        this.connection_type = appSettingsBuilder.getConnection_type();
        this.platform_release = appSettingsBuilder.getPlatform_release();
        this.current_skill = appSettingsBuilder.getCurrent_skill();
    }

    public String getAlternate_device_id() {
        return alternate_device_id;
    }

    public void setAlternate_device_id(String alternate_device_id) {
        this.alternate_device_id = alternate_device_id;
    }

    public boolean isApp_foregrounded() {
        return app_foregrounded;
    }

    public void setApp_foregrounded(boolean app_foregrounded) {
        this.app_foregrounded = app_foregrounded;
    }

    public String getApp_id() {
        return app_id;
    }

    public void setApp_id(String app_id) {
        this.app_id = app_id;
    }

    public String getBranding_md5() {
        return branding_md5;
    }

    public void setBranding_md5(String branding_md5) {
        this.branding_md5 = branding_md5;
    }

    public String getConnection_type() {
        return connection_type;
    }

    public void setConnection_type(String connection_type) {
        this.connection_type = connection_type;
    }

    public String getCurrent_skill() {
        return current_skill;
    }

    public void setCurrent_skill(String current_skill) {
        this.current_skill = current_skill;
    }

    public String getDevice_id() {
        return device_id;
    }

    public void setDevice_id(String device_id) {
        this.device_id = device_id;
    }

    public String getDevice_type() {
        return device_type;
    }

    public void setDevice_type(String device_type) {
        this.device_type = device_type;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getIp_address() {
        return ip_address;
    }

    public void setIp_address(String ip_address) {
        this.ip_address = ip_address;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLimit_ad_tracking() {
        return limit_ad_tracking;
    }

    public void setLimit_ad_tracking(String limit_ad_tracking) {
        this.limit_ad_tracking = limit_ad_tracking;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getPlatform_release() {
        return platform_release;
    }

    public void setPlatform_release(String platform_release) {
        this.platform_release = platform_release;
    }

    public String getPlatform_version() {
        return platform_version;
    }

    public void setPlatform_version(String platform_version) {
        this.platform_version = platform_version;
    }

    public String getProperty_id() {
        return property_id;
    }

    public void setProperty_id(String property_id) {
        this.property_id = property_id;
    }

    public boolean isRequest_visitor_id() {
        return request_visitor_id;
    }

    public void setRequest_visitor_id(boolean request_visitor_id) {
        this.request_visitor_id = request_visitor_id;
    }

    public String getSdk_version() {
        return sdk_version;
    }

    public void setSdk_version(String sdk_version) {
        this.sdk_version = sdk_version;
    }

    public String getSite_id() {
        return site_id;
    }

    public void setSite_id(String site_id) {
        this.site_id = site_id;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getStrings_hash() {
        return strings_hash;
    }

    public void setStrings_hash(String strings_hash) {
        this.strings_hash = strings_hash;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getView_name() {
        return view_name;
    }

    public void setView_name(String view_name) {
        this.view_name = view_name;
    }

    public String getVisit_id() {
        return visit_id;
    }

    public void setVisit_id(String visit_id) {
        this.visit_id = visit_id;
    }

    public String getVisitor_id() {
        return visitor_id;
    }

    public void setVisitor_id(String visitor_id) {
        this.visitor_id = visitor_id;
    }
}

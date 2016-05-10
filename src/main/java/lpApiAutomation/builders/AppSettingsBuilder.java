package lpApiAutomation.builders;

import lpApiAutomation.models.AppSettings;
import lpApiAutomation.configuration.Platforms;

/**
 * Created by andrew on 4/9/16.
 */
public class AppSettingsBuilder {
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

    public AppSettingsBuilder(Platforms platform, String appId) {
        this.app_id = appId;
        this.skill = "mobile";
        this.language = "en";
        // set defaults for each platform
        switch(platform) {
            case WEB:
                this.platform = "Web";
                this.branding_md5 = "35657b29c2f7f373d561d4cb5788c385";
                this.device_id = "447654d3-d77f-2d1f-2c96-a4e214975ea3";
                this.device_type = "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/46.0.2490.76 Mobile Safari/537.36";
                break;
            case IOS:
                this.platform = "Apple iOS";
                this.locale = "en_US";
                this.platform_version = "9.2";
                this.device_type = "x86_64";
                this.app_foregrounded = false;
                this.strings_hash = "cc2abf7bc9259694cd39c64e72ad6361";
                this.device_id = "110AD564-B703-4E14-AAE5-6134D41CCD10";
                this.branding_md5 = "db09d2fc9019a47cdf1fe52de855e724";
                break;
            case ANDROID:
                this.platform = "Android";
                this.branding_md5 = "e3fa6750a0c2e557342831924e6d39d4";
                break;
            default:
                throw new IllegalArgumentException("Platform required");
        }
    }

    public AppSettings build() {
        return new AppSettings(this);
    }

    public AppSettingsBuilder setSdk_version(String sdk_version) {
        this.sdk_version = sdk_version;
        return this;
    }

    public AppSettingsBuilder setAlternate_device_id(String alternate_device_id) {
        this.alternate_device_id = alternate_device_id;
        return this;
    }

    public AppSettingsBuilder setApp_foregrounded(boolean app_foregrounded) {
        this.app_foregrounded = app_foregrounded;
        return this;
    }

    public AppSettingsBuilder setBranding_md5(String branding_md5) {
        this.branding_md5 = branding_md5;
        return this;
    }

    public AppSettingsBuilder setConnection_type(String connection_type) {
        this.connection_type = connection_type;
        return this;
    }

    public AppSettingsBuilder setCurrent_skill(String current_skill) {
        this.current_skill = current_skill;
        return this;
    }

    public AppSettingsBuilder setDevice_id(String device_id) {
        this.device_id = device_id;
        return this;
    }

    public AppSettingsBuilder setDevice_type(String device_type) {
        this.device_type = device_type;
        return this;
    }

    public AppSettingsBuilder setHost(String host) {
        this.host = host;
        return this;
    }

    public AppSettingsBuilder setIp_address(String ip_address) {
        this.ip_address = ip_address;
        return this;
    }

    public AppSettingsBuilder setLanguage(String language) {
        this.language = language;
        return this;
    }

    public AppSettingsBuilder setLimit_ad_tracking(String limit_ad_tracking) {
        this.limit_ad_tracking = limit_ad_tracking;
        return this;
    }

    public AppSettingsBuilder setLocale(String locale) {
        this.locale = locale;
        return this;
    }

    public AppSettingsBuilder setPlatform_release(String platform_release) {
        this.platform_release = platform_release;
        return this;
    }

    public AppSettingsBuilder setPlatform_version(String platform_version) {
        this.platform_version = platform_version;
        return this;
    }

    public AppSettingsBuilder setProperty_id(String property_id) {
        this.property_id = property_id;
        return this;
    }

    public AppSettingsBuilder setRequest_visitor_id(boolean request_visitor_id) {
        this.request_visitor_id = request_visitor_id;
        return this;
    }

    public AppSettingsBuilder setSite_id(String site_id) {
        this.site_id = site_id;
        return this;
    }

    public AppSettingsBuilder setSkill(String skill) {
        this.skill = skill;
        return this;
    }

    public AppSettingsBuilder setStrings_hash(String strings_hash) {
        this.strings_hash = strings_hash;
        return this;
    }

    public AppSettingsBuilder setType(String type) {
        this.type = type;
        return this;
    }

    public AppSettingsBuilder setVersion(String version) {
        this.version = version;
        return this;
    }

    public AppSettingsBuilder setView_name(String view_name) {
        this.view_name = view_name;
        return this;
    }

    public AppSettingsBuilder setVisit_id(String visit_id) {
        this.visit_id = visit_id;
        return this;
    }

    public AppSettingsBuilder setVisitor_id(String visitor_id) {
        this.visitor_id = visitor_id;
        return this;
    }

    public String getAlternate_device_id() {
        return alternate_device_id;
    }

    public boolean isApp_foregrounded() {
        return app_foregrounded;
    }

    public String getApp_id() {
        return app_id;
    }

    public String getBranding_md5() {
        return branding_md5;
    }

    public String getConnection_type() {
        return connection_type;
    }

    public String getCurrent_skill() {
        return current_skill;
    }

    public String getDevice_id() {
        return device_id;
    }

    public String getDevice_type() {
        return device_type;
    }

    public String getHost() {
        return host;
    }

    public String getIp_address() {
        return ip_address;
    }

    public String getLanguage() {
        return language;
    }

    public String getLimit_ad_tracking() {
        return limit_ad_tracking;
    }

    public String getLocale() {
        return locale;
    }

    public String getPlatform() {
        return platform;
    }

    public String getPlatform_release() {
        return platform_release;
    }

    public String getPlatform_version() {
        return platform_version;
    }

    public String getProperty_id() {
        return property_id;
    }

    public boolean isRequest_visitor_id() {
        return request_visitor_id;
    }

    public String getSdk_version() {
        return sdk_version;
    }

    public String getSite_id() {
        return site_id;
    }

    public String getSkill() {
        return skill;
    }

    public String getStrings_hash() {
        return strings_hash;
    }

    public String getType() {
        return type;
    }

    public String getVersion() {
        return version;
    }

    public String getView_name() {
        return view_name;
    }

    public String getVisit_id() {
        return visit_id;
    }

    public String getVisitor_id() {
        return visitor_id;
    }
}

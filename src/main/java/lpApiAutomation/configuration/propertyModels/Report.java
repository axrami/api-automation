package lpApiAutomation.configuration.propertyModels;

/**
 * Created by andrew on 5/8/16.
 */
public class Report extends PropertyOption{
    private String reportType = "";

    public void setOverride(String overrideValue){
        this.isOverride = true;
        this.reportType = overrideValue;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }
}

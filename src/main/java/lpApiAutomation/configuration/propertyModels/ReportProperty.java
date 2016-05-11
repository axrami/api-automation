package lpApiAutomation.configuration.propertyModels;

/**
 * Created by andrew on 5/8/16.
 */
public class ReportProperty extends PropertyOption{
    private String reportType = "";

    public void setOverride(String overrideValue){
        this.isOverride = true;
        this.reportType = overrideValue;
    }

    public String getReportType() {
        return reportType;
    }

    public ReportProperty setReportType(String reportType) {
        if(!isOverride)
            this.reportType = reportType;
        return this;
    }
}

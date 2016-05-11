package lpApiAutomation.configuration.propertyModels;

/**
 * Created by andrew on 5/8/16.
 */
public class VisitsProperty extends PropertyOption {
    private int numberOfVisits = 0;

    public void setOverride(int overrideValue) {
        this.isOverride = true;
        this.numberOfVisits = overrideValue;
    }

    public int getNumberOfVisits() {
        return numberOfVisits;
    }

    public VisitsProperty setNumberOfVisits(int numberOfVisits) {
        if(!isOverride)
            this.numberOfVisits = numberOfVisits;
        return this;
    }
}

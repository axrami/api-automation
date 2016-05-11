package lpApiAutomation.configuration.propertyModels;

/**
 * Created by andrew on 5/8/16.
 */
public class RunTimeProperty extends PropertyOption {
    private int runTime = 0;

    public void setOverride(int overrideValue) {
        this.isOverride = true;
        this.runTime = overrideValue;
    }

    public int getRunTime() {
        return runTime;
    }

    public RunTimeProperty setRunTime(int runTime) {
        if(!isOverride)
            this.runTime = runTime;
        return this;
    }
}

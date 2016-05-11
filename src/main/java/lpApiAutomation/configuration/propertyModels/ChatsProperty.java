package lpApiAutomation.configuration.propertyModels;

/**
 * Created by andrew on 5/8/16.
 */
public class ChatsProperty extends PropertyOption{
    private int numberOfChats;

    public void setOverride(int overrideValue) {
        this.isOverride = true;
        this.numberOfChats = overrideValue;
    }

    public int getNumberOfChats() {
        return numberOfChats;
    }

    public ChatsProperty setNumberOfChats(int numberOfChats) {
        if(!isOverride)
            this.numberOfChats = numberOfChats;
        return this;
    }
}

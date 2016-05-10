package lpApiAutomation.configuration.propertyModels;

/**
 * Created by andrew on 5/8/16.
 */
public class Chats extends PropertyOption{
    private int numberOfChats;

    public void setOverride(int overrideValue) {
        this.isOverride = true;
        this.numberOfChats = overrideValue;
    }

    public int getNumberOfChats() {
        return numberOfChats;
    }

    public void setNumberOfChats(int numberOfChats) {
        this.numberOfChats = numberOfChats;
    }
}

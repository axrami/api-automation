import lpApiAutomation.models.AppSettings;
import lpApiAutomation.builders.AppSettingsBuilder;
import lpApiAutomation.configuration.Platforms;
import org.junit.Test;

/**
 * Created by andrew on 4/9/16.
 */
public class AppSettingsTest {
    @Test
    public void createAppSettings() {
        AppSettings appSettings = new AppSettingsBuilder(Platforms.ANDROID, "P36511428").build();
    }
}

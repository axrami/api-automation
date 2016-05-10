package lpApiAutomation.configuration;

import dagger.Provides;

import javax.inject.Singleton;

/**
 * Created by andrew on 4/9/16.
 */
@dagger.Module
public class Module {

    @Provides @Singleton
    LPMobileConfig provideConfig() {
        return new LPMobileConfig();
    }
}

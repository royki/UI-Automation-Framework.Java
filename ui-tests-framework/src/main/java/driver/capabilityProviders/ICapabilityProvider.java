package driver.capabilityProviders;

import config.driver.AdditionalCapability;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by ravit on 05/12/2016.
 */
public interface ICapabilityProvider {

    void SetAdditionalCapability(AdditionalCapability additionalCapability);

    DesiredCapabilities FinalizeCapabilities();
}

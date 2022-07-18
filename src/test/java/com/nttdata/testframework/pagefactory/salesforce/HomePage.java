/*
 * Added by Archana for Mobile Automation Testing
 */

/*
 * Added by Archana for Mobile Automation Testing
 */

package com.nttdata.testframework.pagefactory.salesforce;

import com.nttdata.testframework.drivers.CustomWebDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.awt.*;

@Component
public class HomePage extends LayoutPage {
    static Logger logger = LogManager.getLogger(HomePage.class);

    @Autowired
    public HomePage(CustomWebDriver customWebDriver) throws AWTException {
        super(customWebDriver);
    }

    public void selectHomePage(){
        logger.debug(getPageTitle());
    }

}

//Page Accessed from Account -> Bills
package com.nttdata.testframework.pagefactory.salesforce;

import com.nttdata.testframework.drivers.CustomWebDriver;
import com.nttdata.testframework.utils.Configuration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.awt.*;


@Component
public class LayoutPage extends PageObject {

    static Logger logger = LogManager.getLogger(LayoutPage.class);

    // Page elements


    @Autowired
    private CustomWebDriver customWebDriver;
    @Autowired
    private Configuration configuration;

//constructor
    @Autowired
    public LayoutPage(CustomWebDriver customWebDriver) throws AWTException {
        super(customWebDriver);
    }


//Page Interaction

    public void previousPage() throws Throwable {
        logger.info("navigating back using top left arrow...");

    }
    public void closePage() throws Throwable {
        logger.info("closing the page...");

    }

    public void reloadPage() throws Throwable {
        logger.info("reloading page ...");

    }
    public String getPageTitle(){
        logger.debug("reading Page Title...");
        return "PageTitle";
    }
}

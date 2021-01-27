package com.cybertek.tests.day8_testbase_properties_driver;

import com.cybertek.tests.base.TestBase;
import org.testng.annotations.Test;
import utilities.BrowserUtils;
import utilities.WebOrderUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class WebTablePractices extends TestBase {

    @Test
    public void verify_order_test() throws IOException {
        //1.Create properties class Object
        Properties properties = new Properties();

        //2.Open the file in JVM memory and pass the path of the file
        String path = "configuration.properties";

        FileInputStream file = new FileInputStream(path);

        //3.Load the opened file into the Properties object
        properties.load(file);

        String url = properties.getProperty("webOrderUrl");
        driver.get(url);

        WebOrderUtils.loginToSmartBear(driver);
        BrowserUtils.sleep(2);

        //Verify if 'Mark Smith' is in the list

        WebOrderUtils.verifyOrder(driver, "Mark Smith");
    }

}

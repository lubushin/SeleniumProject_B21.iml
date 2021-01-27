package com.cybertek.tests.HW_01_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class MethodVerifyOrder {

    public static void verifyOrderSBC(WebDriver driver, String name) {
        List<WebElement> allNames = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr//td[2]"));
        for(WebElement each : allNames) {
           if(each.getText().equals(name)) {
               Assert.assertTrue(each.getText().equals(name));
               System.out.println(name + " is in the list");
           }
           else{
              System.out.println(name + " is not in the list");
           }
           }

    }
}
/*
PRACTICE #4: Method: verifyOrder•Create a method named verifyOrderin
SmartBearUtils class.
•Methodtakes WebDriver object and String(name).
•Methodshould verify if given name exists in orders.
•This method should simply accepts a name(String),
and assert whether given name is in the list or not.
•Create a new TestNG test to test if the method is working as expected
 */
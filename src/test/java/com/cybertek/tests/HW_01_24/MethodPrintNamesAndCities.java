package com.cybertek.tests.HW_01_24;

import com.cybertek.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.WebOrderUtils;

import java.util.List;
/*
Practice #5: Method: printNamesAndCities
•Create a method named printNamesAndCitiesin SmartBearUtils class.
•Method takes WebDriver object.
•This method should simply print all the names in the List of All Orders.
•Create a new TestNG test to test if the method is working as expected.
•Output should be like:•Name1: name, City1: city
•Name2: name, City2: city
 */

public  class MethodPrintNamesAndCities extends TestBase {
    @Test
    public void names_cities() {
        WebOrderUtils.loginToSmartBear(driver);

        List<WebElement> allNames = driver.findElements(By.xpath("//tbody//tbody//tr//td[2]"));

        List<WebElement> listCities = driver.findElements(By.xpath("//tbody//tbody//tr//td[7]"));

        for(int i = 0; i < allNames.size(); i++){
        System.out.println("Name "+ (i+1)+": " +allNames.get(i).getText()+", City "+(i+1)+": "+listCities.get(i).getText());

        }
            }

        }

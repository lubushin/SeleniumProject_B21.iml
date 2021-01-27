package com.cybertek.tests.HW_01_24;

import com.cybertek.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.WebOrderUtils;

import java.util.List;

public  class MethodPrintNamesAndCities extends TestBase {

    @Test
    public void names_cities() {
        WebOrderUtils.loginToSmartBear(driver);

        List<WebElement> allNames = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr//td[2]"));
        String result = "";
        for(WebElement each: allNames){
        if(each.equals(allNames)){
            result+=each;
        }
}
        System.out.println(result);
    }
}
/*
    int count = 2;
    //Delete Name
    for (WebElement each : listOfName){
        if (each.getText().equals(name)){
            driver.findElement(By.xpath("//table[@class='SampleTable']//tr["+count+"]//td[2]/../td[1]/input")).click();
            deleteButton.click();

            break;
        }
        count++;
    }
 */

/*
Practice #5: Method: printNamesAndCities
•Create a method named printNamesAndCitiesin SmartBearUtils class.
•Method takes WebDriver object.
•This method should simply print all the names in the List of All Orders.
•Create a new TestNG test to test if the method is working as expected.
•Output should be like:•Name1: name, City1: city
•Name2: name, City2: city
 */
package com.cybertek.tests.HW_01_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RemoveNameMethod {
    //        TC #11: Create a method called removeName()




    public static void removeName (WebDriver driver, String name)throws InterruptedException{
    WebElement deleteButton = driver.findElement(By.id("ctl00_MainContent_btnDelete"));
    //List of Names
    List<WebElement> listOfName = driver.findElements(By.xpath("//table[@class='SampleTable']//tr/td[2]"));
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
    Thread.sleep(5);
   // System.out.println("");

}
    //        1.Accepts two parameters: WebDriver, String name
    //        2.Method will remove the given name from the list of Smartbear
    //        3.Create a new TestNG test, and call your method.
    //        4.Assert that your method removed the given name
}

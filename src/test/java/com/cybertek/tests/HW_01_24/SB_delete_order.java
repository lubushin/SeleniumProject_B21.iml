package com.cybertek.tests.HW_01_24;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SB_delete_order {

    WebDriver driver;

    //TC #9: SmartBear delete order

//1.Open browser and login to SmartBear
@BeforeMethod
public void setup(){
driver = WebDriverFactory.getDriver("chrome");
driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
    driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
    driver.findElement(By.name("ctl00$MainContent$login_button")).click();
}
//2.Delete “Mark Smith” from the list
@Test
    public void delete(){
WebElement checkButton = driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl03_OrderSelector"));
checkButton.click();

sleep(3);

WebElement deleteButton = driver.findElement(By.id("ctl00_MainContent_btnDelete"));
deleteButton.click();
sleep(3);
    Alert alert = driver.switchTo().alert();
    alert.accept();

    List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr/td[2]"));
    List<String> names = new ArrayList<String>();
    for (WebElement webElement : list) {
        names.add(webElement.getText());
    }
    System.out.println(names);
    Assert.assertTrue(!names.contains("Mark Smith"));

}
//3.Assert it is deleted from the list

    @AfterMethod
    public void teardownMethod()  {
        sleep(2);
        driver.close();
    }

public static void sleep(int seconds){
    try{
       Thread.sleep(seconds*1000);
    }catch(InterruptedException e){
        e.printStackTrace();
    }
}

}



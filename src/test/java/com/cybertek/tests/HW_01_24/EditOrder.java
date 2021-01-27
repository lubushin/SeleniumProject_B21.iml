package com.cybertek.tests.HW_01_24;

import com.cybertek.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EditOrder extends TestBase {

   @Test
  public void editButton() {
       driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
       driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
       driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
       driver.findElement(By.name("ctl00$MainContent$login_button")).click();

       //        2.Click to edit button from the right for “Steve Johns”

     WebElement editButton = driver.findElement(By.xpath("//table/tbody/tr[4]/td[13]"));
      editButton.click();

     //        3.Change name to “Michael Jordan”
     WebElement changeName = driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtName"));
     changeName.clear();
     changeName.sendKeys("Michael Jordan");
     sleep(2);
     //        4.Click Update
     WebElement updateButton = driver.findElement(By.xpath("//a[@class='btn_light']"));
     updateButton.click();
     sleep(2);
     //        5.Assert “Michael Jordan” is in the list
     WebElement resultText = driver.findElement(By.xpath("//table/tbody/tr[4]/td[.='Michael Jordan']"));

     String actualText = resultText.getText();
     String expectedText = "Michael Jordan";

    Assert.assertTrue(resultText.isDisplayed());
     Assert.assertEquals(actualText, expectedText);


   }

}




package com.cybertek.tests.HW_01_24;

import com.cybertek.tests.base.TestBase;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.format.DateTimeFormatter;


public class Registration extends TestBase {

    @Test
    public void registration(){
//TC#6: Cybertek registration form confirmationNote: Use JavaFaker when possible.
//1.Open browser
//2.Go to website: http://practice.cybertekschool.com/registration_form
        driver.get("http://practice.cybertekschool.com/registration_form");

        Faker faker = new Faker();
// 3.Enter first name
WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys(faker.name().firstName());
// 4.Enter last name
WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys(faker.name().lastName());
        //5.Enter username
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("student");
        // 6.Enter email address
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("student@gmail.com");
        //6.Enter password
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("student1");
        //8.Enter phone number
        WebElement phoneNumber = driver.findElement(By.name("phone"));
        phoneNumber.sendKeys("234-300-4535");
        //9.Select a gender from radio buttons
        //WebElement gender = driver.findElement(By.xpath("//label[@.='Gender']"));
WebElement checkbox = driver.findElement(By.xpath("//input[@value='female']"));
checkbox.click();
        //10.Enter date of birth
        WebElement DOB = driver.findElement(By.name("birthday"));
        DOB.sendKeys("12/16/1989");
       // DateTimeFormatter df =
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MM/DD/YYYY");

        //11.Select Department/Office
        Select departmentOffice = new Select(driver.findElement(By.name("department")));
        departmentOffice.selectByVisibleText("MCR");
        //12.Select Job Title
        Select jobTitle = new Select(driver.findElement(By.name("job_title")));
        jobTitle.selectByVisibleText("SDET");
        //13.Select programming language from checkboxes

        WebElement prLanguage = driver.findElement(By.id("inlineCheckbox2"));
        prLanguage.click();
        sleep(2);


        //14.Clickto sign up button

        WebElement signUpButton = driver.findElement(By.id("wooden_spoon"));
        signUpButton.click();

    //15.Verify success message “You’ve successfully completed registration.”is displayed
    WebElement successMessage = driver.findElement(By.xpath("//p"));
    Assert.assertTrue(successMessage.isDisplayed());
    String actualResult = successMessage.getText();
    String expectedResult = "You've successfully completed registration!";
        Assert.assertEquals(actualResult,expectedResult);
}
}




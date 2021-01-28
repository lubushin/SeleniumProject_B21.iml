package com.cybertek.tests.HW_01_24;

import com.cybertek.tests.base.TestBase;
import org.testng.annotations.Test;
import utilities.WebOrderUtils;

public class VerifyOrder extends TestBase {

    @Test
    public void TestA() throws InterruptedException {

WebOrderUtils.loginToSmartBear(driver);

MethodVerifyOrder.verifyOrderSBC(driver, "Mark Red");
sleep(2);

RemoveNameMethod.removeName(driver,"Mark Smith");

    }
}

package com.n11.training.samle.test.scenario;

import com.n11.training.samle.test.base.BaseTest;
import com.n11.training.samle.test.page.*;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;


public class SampleTest2 extends BaseTest {

    @Test
    public void sampleTest() {
        //HomePage homePage = new HomePage(driver);
        //homePage.search("Samsung");
        //homePage.search("iphone");

        new HomePage(driver)
                .search("Samsung")
                .search("iphone")
                .callLoginPage()
                .login("abc@n11.com", "123qwe")
                .logout();
    }

    @Test
    public void loginTest() {

        new HomePage(driver)
                .callLoginPage()
                .login("abc@n11.com", "123qwe")
                .logout();
    }

    @Test
    public void registerTest() {
        new HomePage(driver).callRegisterPage();
        new RegisterPage(driver)
                .register("ısmaıl", "koprulu", RandomStringUtils.randomAlphabetic(5).toLowerCase() + "4@pismail.com", "123qwe", "123qwe", "N11");


    }

    @Test
    public void paymentTest() {
        new HomePage(driver)
                .callLoginPage()
                .login("abc@n11.com", "123qwe");
        new HomePage(driver).goToProductDetail();
        new ProductDetailPage(driver).goToCheckOut();
        new CheckOutPage(driver).goToPayment("Adana", "Ceyhan", "Adapınar", "47638294340");
        new PaymentPage(driver).makePayment("4022", "7740", "2277", "4027", "isco kop", "123");

    }
}
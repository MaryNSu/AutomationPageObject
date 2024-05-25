package tests;


import org.testng.annotations.Test;
import pages.AuthPage;


public class TestStore extends BaseTest {

    @Test
    public void addToCart(){

        AuthPage authPage = new AuthPage();
        authPage
                .waitPageIsLoaded()
                .enterUsername("standard_user")
                .enterPassword("secret_sauce")
                .clickToLogin()
                .waitPageIsLoaded()
                .addBagToCart()
                .navigateToCart()
                .isBagIsPresent();

    }
}
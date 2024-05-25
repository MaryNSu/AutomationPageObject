package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AuthPage{

    private final SelenideElement usernameFld = $(By.id("user-name"));
    private final SelenideElement passwordFld = $(By.id("password"));
    private final SelenideElement loginBtn = $(By.id("login-button"));


    public AuthPage waitPageIsLoaded(){
        usernameFld.should(Condition.appear);
        return this;
    }

    public AuthPage enterUsername(String username){
        usernameFld.clear();
        usernameFld.sendKeys(username);
        return this;
    }

    public AuthPage enterPassword(String password){
        passwordFld.clear();
        passwordFld.sendKeys(password);
        return this;
    }

    public InventoryPage clickToLogin(){
        loginBtn.should(Condition.clickable).click();
        return new InventoryPage();
    }
}
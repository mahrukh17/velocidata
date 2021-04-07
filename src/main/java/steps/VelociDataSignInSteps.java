package steps;

import org.openqa.selenium.WebDriver;

public class VelociDataSignInSteps {
    private WebDriver driver;

    public VelociDataSignInSteps(WebDriver driver){
        this.driver = driver;
    }

    public void enterCredentials(String email,String password)  {


        driver.findElement(locators.SignIn.emailField).clear();
        driver.findElement(locators.SignIn.emailField).sendKeys(email);
        driver.findElement(locators.SignIn.passwordField).clear();
        driver.findElement(locators.SignIn.passwordField).sendKeys(password);}

    public  void clickLogin()
    {
        driver.findElement(locators.SignIn.loginButton).click();
    }
    public void openLogin()
    {
        driver.findElement(locators.SignIn.loginPage).click();
    }
}
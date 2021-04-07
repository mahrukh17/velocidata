package steps;

import locators.CreateNewUser;
import locators.UsersPage;
import org.openqa.selenium.WebDriver;

public class VelociDataAddUserSteps {

    private WebDriver driver;

    public VelociDataAddUserSteps(WebDriver driver){
        this.driver = driver;
    }

    public void clickUser()
    {
        driver.findElement(locators.UsersPage.userButton).click();

    }

    public void clickAddUser(){
        driver.findElement(UsersPage.adduserButton).click();
    }
    public void createNewUser (String userName, String email, String firstName, String lastName){

        driver.findElement(locators.CreateNewUser.usernameField).clear();
        driver.findElement(locators.CreateNewUser.usernameField).sendKeys(userName);

        driver.findElement(locators.CreateNewUser.emailField).clear();
        driver.findElement(locators.CreateNewUser.emailField).sendKeys(email);

        driver.findElement(locators.CreateNewUser.firstnameField).clear();
        driver.findElement(locators.CreateNewUser.firstnameField).sendKeys(firstName);

        driver.findElement(locators.CreateNewUser.lastnameField).clear();
        driver.findElement(locators.CreateNewUser.lastnameField).sendKeys(lastName);

    }
public void saveUser(){
       driver.findElement(CreateNewUser.saveButton).click();
}
}

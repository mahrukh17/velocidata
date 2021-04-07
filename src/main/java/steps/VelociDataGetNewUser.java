package steps;

import locators.GetCreatedUser;
import org.openqa.selenium.WebDriver;

public class VelociDataGetNewUser {
    private WebDriver driver;

    public VelociDataGetNewUser(WebDriver driver){
        this.driver = driver;
    }
    public void usersButton(){
        driver.findElement(GetCreatedUser.usersButton).click();

    }
    public void viewAllButton(){
        driver.findElement(GetCreatedUser.viewButton).click();

    }
}

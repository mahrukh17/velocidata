package steps;

import locators.GetCreatedUser;
import locators.SignOut;
import org.openqa.selenium.WebDriver;

public class VelociDataSignOut {
    private WebDriver driver;

    public VelociDataSignOut(WebDriver driver){
        this.driver = driver;
    }
    public void signOut(){
        driver.findElement(SignOut.profileButton).click();
        driver.findElement(SignOut.signoutButton).click();
    }

}

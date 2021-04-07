package locators;
import org.openqa.selenium.By;

public class SignIn {
    public static By loginPage= By.xpath("//a[contains(text(),'Administration Console')]");
    public static By passwordField= By.id("password-input");
    public static By emailField= By.id("email-or-username-field");
    public static By loginButton= By.id("kc-login");

}
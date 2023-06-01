package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ConfigReader;

public class LoginPage extends BasePage{
    @FindBy (xpath = "//input[@id='username']")
    WebElement emailInput;

    @FindBy (xpath = "//input[@id='password']")
    WebElement passwordInput;

    @FindBy (xpath = "//*[@id=\"login-fieldset\"]/div[4]/button")
    WebElement signInBtn;

    public void enterValidLoginInfo (){
        emailInput.sendKeys("sva5615@psu.edu");
        passwordInput.sendKeys("PasswordPassword123!");

    }

    public void enterValidLoginInfo (String username, String password){
        emailInput.sendKeys(ConfigReader.getConfigProperty(username));
        passwordInput.sendKeys(ConfigReader.getConfigProperty(password));

    }

    public void clickSignInBtn (){
        signInBtn.click();
    }

}
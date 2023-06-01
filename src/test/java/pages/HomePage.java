package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy (xpath = "//*[@id=\"maincontent\"]/div[2]/div[1]/div[1]/div/div[1]/div/div/div/p/span")
    WebElement welcomeMessage;

    public void verifyPage(){
        Assert.assertTrue("Welcome message not visible", welcomeMessage.isDisplayed());
    }


}

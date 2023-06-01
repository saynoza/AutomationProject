package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ConfigReader;

public class WallcoveringListPage extends BasePage {


    @FindBy (xpath = "//input[@id='username']")
    public static WebElement emailInput;

    @FindBy (xpath = "//input[@id='password']")
    public static WebElement passwordInput;

    @FindBy (xpath = "//*[@id=\"login-fieldset\"]/div[4]/button")
    public static WebElement signInBtn;
    @FindBy (xpath = "//*[@id=\"mainMenu\"]/div[4]/a")
    WebElement workspaceBtn;

    @FindBy (xpath = "//p[contains(text(),'your Bookmarks')]")
    WebElement bookmarksPage;

    @FindBy (xpath = "//*[@id=\"workspaceContent\"]/div/div[3]/div/div/div/div/div/div/div/a[4]")
    WebElement wallcoverBtn;

    @FindBy (xpath = "//p[contains(text(),'All Wallcovering')]")
    WebElement wallcoversPage;

    @FindBy (id = "card-100120671")
    WebElement FirstItemBtn;

    @FindBy (xpath = "//*[@id=\"QuickViewModal\"]/div[3]/div/div/div/div/div[1]/div/div[1]/button")
    WebElement addToCartBtn;

    @FindBy (xpath = "//*[@id=\"mb_modal\"]/div/div/div[1]/div[1]/h3")
    WebElement newProjectText;



    public void enterValidLoginInfo (String username, String password){
        emailInput.sendKeys(ConfigReader.getConfigProperty(username));
        passwordInput.sendKeys(ConfigReader.getConfigProperty(password));

    }

    public void clickSignInBtn (){
        signInBtn.click();
    }
    public void clickWorkspaceBtn () {
        workspaceBtn.click();

    }

    public void bookmarksPage () throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue("User is navigated to bookmarks page", bookmarksPage.isDisplayed());
    }

    public void clickWallcoverBtn () {
        wallcoverBtn.click();
    }

    public void wallcoversPage () {
        Assert.assertTrue("Wallcovers page is not displayed", wallcoversPage.isDisplayed());
    }




}

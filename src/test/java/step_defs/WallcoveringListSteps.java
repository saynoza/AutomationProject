package step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import pages.WallcoveringListPage;

public class WallcoveringListSteps {

    LoginPage loginPage = new LoginPage();

    HomePage homePage = new HomePage();
    WallcoveringListPage newProjPage = new WallcoveringListPage();



    @Given("user is logged in")
    public void user_is_logged_in() {
        loginPage.enterValidLoginInfo();
        loginPage.clickSignInBtn();
    }

    @When("user is on homepage")
    public void user_is_on_homepage() {
        homePage.verifyPage();

    }
    @When("user clicks on Workspace button")
    public void user_clicks_on_workspace_button() {
        newProjPage.clickWorkspaceBtn();

    }
    @Then("user is navigated to Bookmarks page")
    public void user_is_navigated_to_bookmarks_page() throws InterruptedException {
        newProjPage.bookmarksPage();
    }

    @When("user clicks Wallcovering button")
    public void user_clicks_wallcovering_button() {
        newProjPage.clickWallcoverBtn();

    }
    @Then("user is navigated to the page with wallcovers")
    public void user_is_navigated_to_the_page_with_wallcovers() {
        newProjPage.wallcoversPage();
    }
}

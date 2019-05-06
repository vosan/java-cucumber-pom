package javacucumberpom.stepDefinitions;

import cucumber.api.java.en.Given;

import static javacucumberpom.cucumber.CucumberHooks.getDriver;
import javacucumberpom.pageObjects.common.Header;

public class HomePageSteps {
    private Header header = new Header(getDriver());

    @Given("User opens the Home page")
    public void getToTheHomePage() {

    }

    @Given("User is on Home page")
    public void userIsOnDashboard() throws InterruptedException {
        header.setSearchDepartmentAs("Baby");
        Thread.sleep(5000);
    }
}

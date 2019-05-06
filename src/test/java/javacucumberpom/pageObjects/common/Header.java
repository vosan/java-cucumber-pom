package javacucumberpom.pageObjects.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Header {
    public String setParametrizedLocator(String locator) {
        return String.format(locator, "");
    }

    @FindBy(id = "vh-home-link")
    private WebElement logo;

    @FindBy(xpath = "//button[@aria-label=\"Menu\"]")
    private WebElement menubButton;

    @FindBy(id = "global-search-dropdown-toggle")
    private WebElement searchInButton;


    //todo Implement passing parameters to locators
//    private By searchInOptions = By.xpath(setParametrizedLocator(var));

    public Header(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickLogoIcon() {
        logo.click();
    }

    public void openSideMenu() {
        menubButton.click();
    }

    public void setSearchDepartmentAs(String departmentName) {
        searchInButton.click();
//        System.out.println(String.format(searchInOptions.toString(), departmentName));
    }
}

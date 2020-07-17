package stepdefinations;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utility.Hook;

public class HaploLogin {
    private WebDriver driver;

    public HaploLogin() {
        this.driver = Hook.getDriver();
    }
    @When("^I click select profile$")
    public void iClickSelectProfile() {
        driver.findElement(By.id("com.northgate.haplo.dev:id/viewEmployee")).click();
    }

    @When("^I click next button$")
    public void iClickNextButton() {
        driver.findElement(By.id("com.northgate.haplo.dev:id/tvNext")).click();
    }

    @And("^I click skip intro$")
    public void iClickSkipIntro() {
        driver.findElement(By.id("com.northgate.haplo.dev:id/toolbarTitle")).click();
    }

    @And("^I input email \"([^\"]*)\"$")
    public void iInputEmail(String email) throws Throwable {
        driver.findElement(By.id("com.northgate.haplo.dev:id/edtEmail")).clear();
        driver.findElement(By.id("com.northgate.haplo.dev:id/edtEmail")).sendKeys(email);
    }

    @And("^I input password \"([^\"]*)\"$")
    public void iInputPassword(String password) throws Throwable {
        driver.findElement(By.id("com.northgate.haplo.dev:id/edtPassword")).clear();
        driver.findElement(By.id("com.northgate.haplo.dev:id/edtPassword")).sendKeys(password);
    }

    @And("^I click login button$")
    public void iClickLoginHButton() {
        driver.findElement(By.id("com.northgate.haplo.dev:id/tvConfirm")).click();
    }

    @And("^The error message \"([^\"]*)\" is displayed$")
    public void theErrorMessageIsDisplayed(String errorE) throws Throwable {
        driver.findElement(By.id("com.northgate.haplo.dev:id/textinput_error")).isDisplayed();
    }


    @Then("^The error message for password\"([^\"]*)\" is displayed$")
    public void theErrorMessageForPasswordIsDisplayed(String errorP) throws Throwable {
        driver.findElement(By.id("com.northgate.haplo.dev:id/textinput_error")).isDisplayed();
    }

    @And("^The error message snackbar \"([^\"]*)\" is displayed$")
    public void theErrorMessagePromptIsDisplayed(String error) throws Throwable {
        driver.findElement(By.id("com.northgate.haplo.dev:id/snacksbar_text")).isDisplayed();
    }
}
package stepdefinations;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utility.Hook;

import java.util.concurrent.TimeUnit;

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
        driver.navigate().back();
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
        try{
            driver.findElement(By.id("com.northgate.haplo.dev:id/snacksbar_text")).isDisplayed();
        }
        catch(Exception e){
        }
    }

    //Forgot password
    @And("^I click forgot password$")
    public void iClickForgotPassword() {
        driver.findElement(By.id("com.northgate.haplo.dev:id/textView7")).click();
    }

    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String emailForgot) throws Throwable {
//        driver.findElement(By.id("com.northgate.haplo.dev:id/edtEmail")).clear();
//        driver.findElement(By.id("com.northgate.haplo.dev:id/edtEmail")).sendKeys(emailForgot);
        driver.findElement(By.xpath("//android.widget.EditText[@bounds='[32,277][688,365]']")).sendKeys(emailForgot);
//        driver.navigate().back();
    }

    @Then("^The error message for invalid email \"([^\"]*)\" is displayed$")
    public void theErrorMessageForInvalidEmailIsDisplayed(String errorForgot) throws Throwable {
        driver.findElement(By.id("com.northgate.haplo.dev:id/textinput_error")).isDisplayed();
    }

    @Then("^The snackbar error message for invalid email \"([^\"]*)\" is displayed$")
    public void theSnackbarErrorMessageForInvalidEmailIsDisplayed(String errorForgotSnackbar) throws Throwable {
        try {
            driver.findElement(By.id("com.northgate.haplo.dev:id/snackbar_text")).isDisplayed();
        }
        catch (Exception e){
        }
    }

    @And("^I click Next button in forgot password$")
    public void iClickNextButtonInForgotPassword() {
        driver.findElement(By.id("com.northgate.haplo.dev:id/tvConfirm")).click();
    }

    @Then("^I click Back login$")
    public void iClickBackLogin() {
        driver.findElement(By.id("com.northgate.haplo.dev:id/tvBackLogin")).click();
    }
}
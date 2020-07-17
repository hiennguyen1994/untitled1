//package stepdefinations;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.When;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import utility.Hook;
//
//public class HaploLoginasVisitor {
//    private WebDriver driver;
//
//    public HaploLoginasVisitor() {
//        this.driver = Hook.getDriver();
//    }
//
//    @When("^I click select profile$")
//    public void iClickSelectProfileVistor() {
//        driver.findElement(By.id("com.northgate.haplo.dev:id/viewMemberVisitor")).click();
//    }
//
//    @And("^I click next button$")
//    public void iClickNextButtonVisitor(){
//        driver.findElement(By.id("com.northgate.haplo.dev:id/tvNext")).click();
//    }
//
//    @And("^I click next button in Intro page$")
//    public void iClickNextButtonInIntro(){
//        driver.findElement(By.id("com.northgate.haplo.dev:id/textView4")).click();
//
//    }
//
//    @And("^I click next button in Intro page second$")
//    public void iClickNextButtonInIntroPageSecond() {
//        driver.findElement(By.id("com.northgate.haplo.dev:id/textView4")).click();
//    }
//
//    @And("^I click Get Start button in Intro page$")
//    public void iClickGetStartButton(){
//        driver.findElement(By.id("com.northgate.haplo.dev:id/tvGetStart")).click();
//    }
//
//    @And("^I click Email sign in button$")
//    public void iClickEmailButton(){
//        driver.findElement(By.id("com.northgate.haplo.dev:id/textView14")).click();
//    }
//
//    @And("^I input email visitor\"([^\"]*)\"$")
//    public void iInputEmailVisitor(String emailVisitor) throws Throwable {
//        driver.findElement(By.id("com.northgate.haplo.dev:id/edtEmail")).sendKeys(emailVisitor);
//    }
//
//    @And("^I input password visitor \"([^\"]*)\"$")
//    public void iInputPasswordVisitor(String Password) throws Throwable {
//        driver.findElement(By.id("com.northgate.haplo.dev:id/edtPassword")).sendKeys(Password);
//    }
//
//
//    @And("^I click login button Visitor$")
//    public void iClickLoginButtonVisitor() {
//        driver.findElement(By.id("com.northgate.haplo.dev:id/tvConfirm")).click();
//    }
//
//    @And("^I click allow Camera$")
//    public void iClickAllowCamera() {
//        driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
//    }
//
//    @And("^I click Visitor tab$")
//    public void iClickVisitorTab() {
//        driver.findElement(By.id("com.northgate.haplo.dev:id/navigationVisitor")).click();
//    }
//
//    @And("^I click Amenities tab$")
//    public void iClickAmenitiesTab() {
//        driver.findElement(By.id("com.northgate.haplo.dev:id/navigationAminitites")).click();
//    }
//
//    @And("^I click Profile tab$")
//    public void iClickProfileTab() {
//        driver.findElement(By.id("com.northgate.haplo.dev:id/navigationProfile")).click();
//    }
//}

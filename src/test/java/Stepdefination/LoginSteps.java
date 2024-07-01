package Stepdefination;

import io.cucumber.java.en.*;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.WebDriver;
import pageobject.loginpageaction;

public class LoginSteps {
    WebDriver driver;
    loginpageaction lpaction;
    public LoginSteps (@NotNull CommenSteps cs, loginpageaction lpaction) {
        this.driver = cs.getDriver();
        this.lpaction = lpaction;
    }
    @Given("open url in browser {string}")
    public void open_url_in_browser(String url) {
        driver.get(url);
}

    @When("Enter mail id {string}")
    public void enter_mail_id(String mail) throws InterruptedException {
        lpaction.EnterEmail(mail);
        Thread.sleep(2000);

    }

    @When("Enter password {string}")
    public void enter_password(String pwd) throws InterruptedException {
        lpaction.EnterPassword(pwd);
        Thread.sleep(2000);
    }
    @When("chek the option {string}")
    public void chek_the_option(String string) throws InterruptedException {
     lpaction.clickonremember();
     Thread.sleep(2000);
    }

    @When("Click on Login button")
    public void click_on_login_button() throws InterruptedException {
        lpaction.ClickonLoginbtn();
        Thread.sleep(2000);

    }

    @Then("User should be login")
    public void user_should_be_login() {

        System.out.println("user is login successfully");

    }
}

package Stepdefination;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pageobject.registerpageaction;

public class RegisterSteps {
    WebDriver driver;
    registerpageaction rpa;
    // make constructor
    public RegisterSteps(CommenSteps cs, registerpageaction rpa) {
        this.driver = cs.getDriver();
        this.rpa = rpa;
    }

    @Given("Open url in browser {string}")
    public void open_url_in_browser(String url) {
     driver.get(url);
    }

    @When("user enter full name as a {string}")
    public void user_enter_full_name_as_a(String name) throws InterruptedException {
     rpa.addname(name);
    }

    @When("user enter valid email as a {string}")
    public void user_enter_valid_email_as_a(String id) throws InterruptedException {
    rpa.enteremailid(id);
    }

    @When("user enter valid password {string}")
    public void user_enter_valid_password(String pwd) throws InterruptedException {
    rpa.enterpassword(pwd);
    }

    @When("user Again enter confirm password {string}")
    public void user_again_enter_confirm_password(String pwdc)   {
     rpa.enterconfirmpassword(pwdc);
    }

    @When("clik on chekbox  SUBSCRIBE TO THE NEWSLETTER")
    public void clik_on_chekbox_subscribe_to_the_newsletter() {
        rpa.Newsletter();
    }

    @When("click on chekbox  I AGREE WITH THE TERMS")
    public void click_on_chekbox_i_agree_with_the_terms() {
     rpa.terms();
    }

    @When("click on register button")
    public void click_on_register_button() {
     rpa.Register();
    }

    @Then("user should be successfully register")
    public void user_should_be_successfully_register() {
        System.out.println(" user is register and navigating to marketplace page");
    }
}

package Stepdefination;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pageobject.manuafatureraddaction;

public class manufatureraddSteps {
    WebDriver driver;
    manuafatureraddaction ma;
    public manufatureraddSteps(CommenSteps cs, manuafatureraddaction ma) {
        this.driver = cs.getDriver();
        this.ma = ma;
    }

    @When("user click on manufaturer menu")
    public void user_click_on_manufaturer_menu() throws InterruptedException {
        ma.clickonmanufacture();
        Thread.sleep(5000);
    }
    @When("User click on Add manufaturer")
    public void user_click_on_add_manufaturer() throws InterruptedException {
     ma.clickonaddmanufacture();
     Thread.sleep(5000);
    }
    @When("User fill up all details of manufaturer in form")
    public void user_fill_up_all_details_of_manufaturer_in_form() throws InterruptedException {
     ma.entername();
     Thread.sleep(5000);
     ma.slug();
        Thread.sleep(5000);
      ma.statusdropdown();
        Thread.sleep(5000);
      ma.enterurl();
        Thread.sleep(5000);
      ma.countrydropdown();
        Thread.sleep(5000);
      ma.clicksavebtn();
        Thread.sleep(5000);

    }
    @Then("User should be add manufaturer successfully")
    public void user_should_be_add_manufaturer_successfully() {
        System.out.println("user successfuly Add manufaturer Details");

    }


}

package Stepdefination;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pageobject.Addcustomeraction;

public class AddcustomerSteps {
    WebDriver driver;
    Addcustomeraction addcs;

    public AddcustomerSteps(CommenSteps cs, Addcustomeraction addcs) {
        this.driver = cs.getDriver();
        this.addcs = addcs;
    }

    @Given("user is on Dashboard page open url {string}")
    public void user_is_on_dashboard_page_open_url(String url) {
        driver.get(url);
    }
    @Then("user is navigating to dashborad page")
    public void user_is_navigating_to_dashborad_page() throws InterruptedException {
        System.out.println("user is on dashboard page");
        Thread.sleep(2000);

    }
    @When("user click on customers Menu details icon")
    public void user_click_on_customers_menu_details_icon() throws InterruptedException {
     addcs.Customersmenu();
        Thread.sleep(2000);
    }
    @Then("customers page should be open")
    public void customers_page_should_be_open() throws InterruptedException {

        System.out.println("customers page is open");
        Thread.sleep(2000);
    }
    @When("user click on Add customer button")
    public void user_click_on_add_customer_button() throws InterruptedException {
        addcs.addcustomerbutton();
        Thread.sleep(2000);
    }
    @When("add all details in form")
    public void add_all_details_in_form() throws InterruptedException
    {  // yaha pe ham jis sequence me methods call karenge usi sequence se step automate hoti hai..
        // isliye beech me kuch step run nhi hogi to aage nahi jata step..note that point
        System.out.println("form page is open");
        Thread.sleep(2000);
        addcs.entername();
        Thread.sleep(2000);
        addcs.enternickname();
        Thread.sleep(2000);
        addcs.enteremail();
        Thread.sleep(2000);
        addcs.password();
        Thread.sleep(2000);
        addcs.Confirmpassword();
        Thread.sleep(2000);
        addcs.address1();
        Thread.sleep(2000);
        addcs.dob();
        Thread.sleep(2000);
        addcs.city();
        Thread.sleep(2000);
        addcs.setMobileno();
        Thread.sleep(2000);
        addcs.zipcodeaddress();
        Thread.sleep(2000);

        addcs.Countrydropdown();
        Thread.sleep(2000);
        addcs.Statedropdown();
        Thread.sleep(2000);
        addcs.Genderdropdown();
        Thread.sleep(2000);
        addcs.Statusdropdown();
        Thread.sleep(2000);
        addcs.clickonsavebutton();
        Thread.sleep(2000);

    }
    @Then("user should be successfully add customer")
    public void user_should_be_successfully_add_customer() {

        System.out.println("user added all details successfully in add customer ");
    }
}

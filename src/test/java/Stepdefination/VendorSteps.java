package Stepdefination;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pageobject.Vendorpageaction;

public class VendorSteps {//here starting steps is same in another feature file so thay r not implementing here.
    WebDriver driver;
    Vendorpageaction vp;
    public VendorSteps(CommenSteps cs, Vendorpageaction vp) {
        this.driver = cs.getDriver();
        this.vp = vp;
    }

    @When("user click on merchants menu icon")
    public void user_click_on_merchants_menu_icon() throws InterruptedException {
        vp.clickonmerchants();
        Thread.sleep(2000);

    }

    @Then("merchants page should be open")
    public void merchants_page_should_be_open() {
        System.out.println("merchant page is open");

    }

    @When("user click on Add new vendor button")
    public void user_click_on_add_new_vendor_button() throws InterruptedException {
     vp.clickonvendorbtn();
        Thread.sleep(5000);
    }

    @When("Enter all details in form")
    public void enter_all_details_in_form() throws InterruptedException {
     vp.merchantname();
     Thread.sleep(5000);
     vp.statusdropdown();
        Thread.sleep(5000);
     vp.emailadd();
        Thread.sleep(5000);
     vp.temppwd();
        Thread.sleep(5000);
     vp.shopname();
        Thread.sleep(5000);
     vp.legalshopname();
        Thread.sleep(5000);
     vp.slugname();
        Thread.sleep(5000);
     vp.externalurl();
        Thread.sleep(5000);
     vp.desc();
        Thread.sleep(5000);
     /*vp.chooseavtar();
        Thread.sleep(5000);
     vp.uploadbtn();
        Thread.sleep(5000);*/
     vp.clicksavebtn();
        Thread.sleep(5000);
    }

    @Then("user should be successfully add new vendor")
    public void user_should_be_successfully_add_new_vendor() {
        System.out.println("successful adding new vendor");
    }

}

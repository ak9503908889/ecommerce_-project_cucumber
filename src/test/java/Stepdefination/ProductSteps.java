package Stepdefination;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pageobject.Productaction;

public class ProductSteps
{ WebDriver driver;
    Productaction pa;
    public ProductSteps(CommenSteps cs, Productaction pa) {
        this.driver = cs.getDriver();
        this.pa = pa;
    }

    @When("user click on Products")
    public void user_click_on_products() throws InterruptedException {
        pa.clickProducts();
        Thread.sleep(2000);
    }

    @When("user click on Add Products")
    public void user_click_on_add_products() throws InterruptedException {

        pa.clickAddPro();
        Thread.sleep(2000);
    }

    @When("user Fill all details in From")
    public void user_fill_all_details_in_from() throws InterruptedException {
        pa.Entername();
        Thread.sleep(2000);
        pa.selectstatus();
        Thread.sleep(2000);
        pa.EnterDescription();
        Thread.sleep(2000);
        pa.selectcatagory();
        Thread.sleep(2000);
        pa.selectcountry();
        Thread.sleep(2000);
        pa.Enterslug();
        Thread.sleep(2000);
        pa.clicksavebtn();
        Thread.sleep(2000);


    }

    @Then("user successfuly Add Products Detils")
    public void user_successfuly_add_products_detils() {
        System.out.println("user successfuly Add Products Details");

    }


}

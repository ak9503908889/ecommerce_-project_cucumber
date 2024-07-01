package Stepdefination;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pageobject.AttributeAction;

public class AtributeSteps
{ WebDriver driver;
    AttributeAction aa;
    public AtributeSteps(CommenSteps cs, AttributeAction aa) {
        this.driver = cs.getDriver();
        this.aa = aa;
    }
    @When("user click on Attributes")
    public void user_click_on_attributes() throws InterruptedException {
        aa.clickAttributes();
        Thread.sleep(2000);
    }
    @When("user click on Add Attributes button")
    public void user_click_on_add_attributes_button() throws InterruptedException {
        aa.clickAttbtn();
        Thread.sleep(2000);
    }
    @When("user Fill all details on Attributes form")
    public void user_fill_all_details_on_attributes_form() throws InterruptedException {
        aa.EnterAttType();
        Thread.sleep(2000);
        aa.EnterAttName();
        Thread.sleep(2000);
        aa.Enterorder();
        Thread.sleep(2000);
        aa.selectcatagories();
        Thread.sleep(2000);
        aa.clicksavebtn();
        Thread.sleep(2000);

    }
    @Then("user successfuly Add Attributes Detils")
    public void user_successfuly_add_attributes_detils() {
        System.out.println("user Successfully Add Attributes");
    }



}

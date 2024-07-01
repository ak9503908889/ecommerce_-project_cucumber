package Stepdefination;

import io.cucumber.java.en.*;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.WebDriver;
import pageobject.DeleteCustomeraction;

public class DeleteCustomerSteps {
    WebDriver driver;
    DeleteCustomeraction dca;
    public DeleteCustomerSteps( CommenSteps cs, DeleteCustomeraction dca) {
        this.driver = cs.getDriver();
        this.dca = dca;
    }

    @When("click on search option")
    public void click_on_search_option()  throws InterruptedException {
     dca.clicksearch();
     Thread.sleep(5000);

    }

    @When("I select the customer from the search results")
    public void i_select_the_customer_from_the_search_results() throws InterruptedException {
     dca.chekboxselect();
        Thread.sleep(5000);
    }

    @When("I confirm the deletion")
    public void i_confirm_the_deletion() throws InterruptedException {
        dca.clickondelete();
        Thread.sleep(5000);
        dca.clickonproceed();
        Thread.sleep(5000);

    }

    @Then("the customer {string} should be deleted successfully")
    public void the_customer_should_be_deleted_successfully(String string) {

        System.out.println("customer is delete successfully");

    }
}

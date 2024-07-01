package Stepdefination;

import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import pageobject.categoryaction;

import java.io.File;
import java.io.IOException;

public class categorySteps {
    WebDriver driver;
    categoryaction ca;

    public categorySteps(CommenSteps cs, categoryaction ca) {
        this.driver = cs.getDriver();
        this.ca = ca;
    }

    //@category1
    @When("user click on Catalog")
    public void user_click_on_catalog() throws InterruptedException {
        ca.clickoncatalog();
        Thread.sleep(2000);
    }

    @When("user click on Categories")
    public void user_click_on_categories() throws InterruptedException {
        ca.clickoncategories();
        Thread.sleep(2000);
    }

    @When("User click on Group")
    public void user_click_on_group() throws InterruptedException {
        ca.clickonGroup();
        Thread.sleep(2000);
    }

    @When("User click on Add Catagories Group")
    public void user_click_on_add_catagories_group() throws InterruptedException {
        ca.clickAddgpbtn();
        Thread.sleep(3000);
    }

    @When("User fill up categories form")
    public void user_fill_up_categories_form() throws InterruptedException {
        ca.entername();
        Thread.sleep(2000);
        ca.enterorder();
        Thread.sleep(2000);
        ca.enterslug();
        Thread.sleep(2000);

        ca.icon();
        Thread.sleep(2000);
        ca.filterdropdown();
        Thread.sleep(2000);

        ca.status();
        Thread.sleep(2000);
        ca.enterdescription();
        Thread.sleep(2000);
        //ca.backgrounimg();
        //Thread.sleep(2000);
        ca.backgroundimg();
        Thread.sleep(2000);

        ca.coverimage();
        Thread.sleep(2000);


        ca.iconimage();
        Thread.sleep(2000);
        ca.entermetatitle();
        Thread.sleep(2000);
        ca.entermetade();
        Thread.sleep(2000);
        ca.clickonsavebtn();
        Thread.sleep(2000);
    }

    @Then("User should be add successfully Add Catagories Group")
    public void user_should_be_add_successfully_add_catagories_group() throws IOException, InterruptedException {
        System.out.println("user successfully Add catagories Group");
        Thread.sleep(2000);
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File src = screenshot.getScreenshotAs(OutputType.FILE);
        File dest = new File("C:\\Users\\hp\\OneDrive\\Desktop\\automation screenshot.png");
        //FileHandler.copy(src, dest);
        try {
            FileHandler.copy(src, dest);
            System.out.println("Screenshot saved successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //@category2
    @When("User fill up only unrequired filds in categories form")
    public void user_fill_up_only_unrequired_filds_in_categories_form() throws InterruptedException {

        ca.enterorder();
        Thread.sleep(2000);


        ca.enterdescription();
        Thread.sleep(2000);

        ca.backgroundimg();
        Thread.sleep(2000);

        ca.coverimage();
        Thread.sleep(2000);

        ca.iconimage();
        Thread.sleep(2000);

        ca.entermetatitle();
        Thread.sleep(2000);

        ca.entermetade();
        Thread.sleep(2000);

        ca.clickonsavebtn();
        Thread.sleep(2000);

    }

    @Then("User should not be add successfully Add Catagories Group")
    public void user_should_not_be_add_successfully_add_catagories_group() throws IOException, InterruptedException {
        System.out.println("user not add details succesfully");

        Thread.sleep(2000);
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File src = screenshot.getScreenshotAs(OutputType.FILE);
        File dest = new File("C:\\Users\\hp\\OneDrive\\Desktop\\automation screenshot.png");
        //FileHandler.copy(src, dest);
        try {
            FileHandler.copy(src, dest);
            System.out.println("Screenshot saved successfully.");
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
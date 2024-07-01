package pageobject;

import Stepdefination.CommenSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DeleteCustomeraction {
    private WebDriver driver;
    public DeleteCustomeraction(CommenSteps cs) {
        this.driver = cs.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="(//input[@type='search'])[1]")
    WebElement search;

    @FindBy(xpath="//ins[@class='iCheck-helper']")
    WebElement chekbox;

    @FindBy(xpath="(//i[@class='fa fa-trash-o'])[1]")
    WebElement delete;

    @FindBy(xpath="//button[@class='btn btn-red']")  //   (//button[@type='button'])[10]
    WebElement proceedbtn;


    public void clicksearch() throws InterruptedException {

      search.sendKeys("Amit kale");
      Thread.sleep(2000);

    }
    public void chekboxselect(){
        chekbox.click();
    }
    public void clickondelete(){
        delete.click();
    }
    public void clickonproceed(){
        proceedbtn.click();
    }


}

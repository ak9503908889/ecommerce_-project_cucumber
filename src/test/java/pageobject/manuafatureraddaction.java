package pageobject;

import Stepdefination.CommenSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class manuafatureraddaction {
    private WebDriver driver;
    public manuafatureraddaction(CommenSteps cs) {
        this.driver = cs.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "(//i[@class='fa fa-angle-double-right'])[4]")
    WebElement manufaturemenu;
    @FindBy(xpath = "//a[@class='ajax-modal-btn btn btn-new btn-flat']")
    WebElement addmanufature;
    @FindBy(id="name")
    WebElement name;
    @FindBy(id="slug")
    WebElement slug;
    @FindBy(xpath ="//select[@class='form-control select2-normal select2-hidden-accessible']")
    WebElement statusdropdown;
    @FindBy(xpath ="//input[@placeholder='Web address']")
    WebElement url;
    @FindBy(xpath="//select[@class='form-control select2 select2-hidden-accessible'] ")
    WebElement countrydropdown;
    @FindBy(xpath = "//input[@type='submit']")
    WebElement savebtn;



    public void entername(){
        name.sendKeys("Amit kale");
    }
    public void slug(){
        slug.clear();
        slug.sendKeys("kitchen-spoon");
    }
    public void statusdropdown(){
        Select sc=new Select(statusdropdown);
        sc.selectByVisibleText("Active");
    }
    public void countrydropdown(){
        Select sc=new Select(countrydropdown);
        sc.selectByValue("356");
    }
    public void enterurl(){
        url.sendKeys("https://ecom.mahendranikam.com");
    }
    public void clicksavebtn(){
        savebtn.click();
    }
    public void clickonmanufacture(){
     manufaturemenu.click();
    }
    public void clickonaddmanufacture(){
        addmanufature.click();
    }


}

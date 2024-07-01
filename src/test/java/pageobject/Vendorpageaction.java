package pageobject;

import Stepdefination.CommenSteps;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Vendorpageaction {
    private WebDriver driver;

    public Vendorpageaction(CommenSteps cs) {
        this.driver = cs.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="(//i[@class='icon ion-md-send'])[2]") ////i[@class='icon ion-md-send'])[1] customer sathi 1
    WebElement merchants;

    @FindBy(xpath="//a[@class='ajax-modal-btn btn btn-new btn-flat']")
    WebElement Addnewvendorbtn;

    @FindBy(xpath="//input[@placeholder='Enter Full Name of The Merchant'] ")
    WebElement merchantname;

    @FindBy(xpath ="(//select[@class='form-control select2-normal select2-hidden-accessible'])")
    WebElement Statusdropdown;

    @FindBy(id="email")
    WebElement emailid;

    @FindBy(id="password")
    WebElement temppassword;

    @FindBy(id="shop_name")
    WebElement shopname;

    @FindBy(id="legal_name")
    WebElement legalshopname;

    @FindBy(id="slug")
    WebElement slugname;

    @FindBy(id="external_url")
    WebElement externalurl;

    @FindBy(xpath="//div[@class='note-editable panel-body']")
    WebElement desc;

    @FindBy(id="uploadFile")
    WebElement chooseavtar;

    @FindBy(id="uploadBtn")
    WebElement uploadbtn;

    @FindBy(xpath="//input[@class='btn btn-flat btn-new']")
    WebElement savebtn;

    //create methods

    public void clickonmerchants(){
        merchants.click();
    }
    public void clickonvendorbtn(){
        Addnewvendorbtn.click();
    }
    public void merchantname(){
        merchantname.sendKeys("Amit kale");
    }
    public void statusdropdown(){
        Select select = new Select(Statusdropdown);
        select.selectByValue("0");
    }
    public void emailadd(){
        emailid.sendKeys("amitkalepatil.281995@gamil.com");
    }
    public void temppwd(){
        temppassword.sendKeys("Amit@1995");
    }
    public void shopname(){
        shopname.sendKeys("Ak shop");
    }
    public void legalshopname(){
        legalshopname.sendKeys("Ak shop");
    }
    public void slugname(){
        slugname.clear();
        slugname.sendKeys("ak_shop");
    }
    public void externalurl(){
        externalurl.sendKeys("https://www.techtarget.com/whatis/search/quer");
    }
    public void desc(){
        desc.sendKeys("ayurvedick shop. very good shop");
    }
    /*public void chooseavtar(){
        chooseavtar.sendKeys("\"C:\\Users\\hp\\OneDrive\\Desktop\\1597587428463.jpg\"");
    }
    public void uploadbtn(){
        uploadbtn.click();
    }*/
    public void clicksavebtn(){
        savebtn.click();
    }

}
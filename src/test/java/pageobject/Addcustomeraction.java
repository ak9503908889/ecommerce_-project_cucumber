package pageobject;

import Stepdefination.CommenSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Addcustomeraction
{   private WebDriver driver;

    public Addcustomeraction(CommenSteps cs) {
        this.driver = cs.getDriver();
        PageFactory.initElements(driver,this );
    }

    @FindBy(xpath="(//i[@class='icon ion-md-send'])[1]")
    WebElement customersmenu;
    @FindBy(xpath="//a[@class='ajax-modal-btn btn btn-new btn-flat']")
    WebElement Addcustomerbutton;
    @FindBy(xpath="//input[@placeholder='Enter full name']")
    WebElement fullname;

    @FindBy(id="nice_name")
    WebElement nicename;

    @FindBy(id="email")
    WebElement emailaddress;

    @FindBy(id="password")
    WebElement password;

    @FindBy(xpath="//input[@placeholder='Confirm password']")
    WebElement confirmpassword;

    @FindBy(xpath="(//select[@class='form-control select2-normal select2-hidden-accessible'])[1]")
    WebElement Statusdropdown;

    @FindBy(id="dob")
    WebElement dob;

    @FindBy(id="sex")
    WebElement Genderdropdown;

    @FindBy(id="address_line_1")
    WebElement address1;
    @FindBy(id="city")
    WebElement city;
    @FindBy(id="zip_code")
    WebElement zipcode;
    @FindBy(id="phone")
    WebElement mobileno;

    @FindBy(id="country_id")
    WebElement countrydropdown;

    @FindBy(id="state_id")
    WebElement statedropdown;

    @FindBy(xpath="//input[@type='submit']")
    WebElement savebutton;

    //now create all methods for perform actions


    public void Customersmenu() {
        customersmenu.click();
    }
    public void addcustomerbutton(){
        Addcustomerbutton.click();
    }
    public void clickonsavebutton(){
        savebutton.click();
    }
    public void entername(){
        fullname.sendKeys("amit kale");
    }
    public void enternickname(){
        nicename.sendKeys("ak");
    }
    public void enteremail(){
        emailaddress.sendKeys("amitkalepatil.281995@gmail.com");
    }
    public void password(){
        password.sendKeys("Amit@1995");
    }
    public void Confirmpassword(){
        confirmpassword.sendKeys("Amit@1995");
    }
    public void dob(){
        dob.sendKeys("2023-08-06");
    }
    public void address1(){
        address1.sendKeys("A/p khadki ,tal daund");
    }
    public void city(){
        city.sendKeys("pune");
    }
    public void zipcodeaddress(){
        zipcode.sendKeys("413130");
    }

    public void setMobileno(){
        mobileno.sendKeys("9503908889");
    }
    public void Statusdropdown(){
        Select select = new Select(Statusdropdown);
        select.selectByValue("1");
    }
    public void Genderdropdown(){
        Select gender=new Select(Genderdropdown);//we r adding web element name in select bracket here no need to add method name
        gender.selectByValue("app.male");
    }
    public void Statedropdown(){
        Select state=new Select(statedropdown);
        state.selectByVisibleText("Maharashtra");
    }
  public void Countrydropdown(){
        Select country=new Select(countrydropdown);
        country.selectByVisibleText("India");
  }


}

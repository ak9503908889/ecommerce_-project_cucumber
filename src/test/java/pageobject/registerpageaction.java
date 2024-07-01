package pageobject;

import Stepdefination.CommenSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registerpageaction {
    private WebDriver driver;

    public registerpageaction(CommenSteps cs) {
        this.driver = cs.getDriver();
        PageFactory.initElements(driver,this);
    }

    // locate all elements
    @FindBy(xpath="//input[@placeholder='Full Name']")
    private WebElement fullname;

    @FindBy(xpath="//input[@placeholder='Enter a valid email address']")
    private WebElement email;

    @FindBy(id="password")
    private WebElement password;

    @FindBy(xpath="//input[@placeholder='Confirm Password']")
    private WebElement confirmpassword;

    @FindBy(xpath="(//div[@class='icheckbox_minimal-blue'])[1]" )
    private WebElement newsletter;

    @FindBy(xpath = "(//div[@class='icheckbox_minimal-blue'])[1]")
    private WebElement terms;

    @FindBy(xpath="//input[@value='Register']")
    private WebElement register;

    //create methods for above web elements

    public void addname(String  addname) throws InterruptedException {
        fullname.sendKeys(addname);
        Thread.sleep(2000);
    }
        public void enteremailid(String  emailid) throws InterruptedException {
            email.sendKeys(emailid);
            Thread.sleep(2000);
        }
        public void enterpassword(String pwd) throws InterruptedException {
        password.sendKeys(pwd);
            Thread.sleep(2000);
        }
        public void enterconfirmpassword(String pwdc){
        confirmpassword.sendKeys(pwdc);
        }

    public void Newsletter() {
        newsletter.click();
    }
    public void terms(){
        terms.click();
    }

    public void Register() {
        register.click();
    }
}



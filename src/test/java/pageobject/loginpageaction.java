package pageobject;

import Stepdefination.CommenSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpageaction
{ private WebDriver driver;

    public loginpageaction(CommenSteps cs) {
        this.driver = cs.getDriver();
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath="//input[@placeholder='Email address']")
    public WebElement email;


    @FindBy(xpath="//input[@placeholder='Password']")
    public WebElement password;
    @FindBy(xpath = "//div[@class='icheckbox_minimal-blue']")
    public WebElement remember;

    @FindBy(xpath="//input[@type='submit'] ")
    public WebElement LoginBtn;





    public void EnterEmail(String emailadd) throws InterruptedException {  email.clear();
        email.sendKeys(emailadd);
        Thread.sleep(2000);

    }

    public void EnterPassword(String pwd) throws InterruptedException {

        password.sendKeys(pwd);
        Thread.sleep(2000);
    }
    public void clickonremember() throws InterruptedException {
        remember.click();
        Thread.sleep(2000);
    }
    public void ClickonLoginbtn() throws InterruptedException {
        LoginBtn.click();
        Thread.sleep(2000);
    }


}

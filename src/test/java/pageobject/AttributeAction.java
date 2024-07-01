package pageobject;

import Stepdefination.CommenSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AttributeAction
{  private WebDriver driver;
    public AttributeAction(CommenSteps cs) {
        this.driver = cs.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@name='email']")
    public WebElement email;

    @FindBy(id = "password")
    public WebElement pass;

    @FindBy(xpath ="//div[@class='icheckbox_minimal-blue']")
    public WebElement checkbox;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement LoginBtn;

    @FindBy(xpath = "(//i[@class='fa fa-angle-left pull-right'])[1]")
    public WebElement catalog;

    @FindBy(xpath = "(//i[@class='fa fa-angle-double-right'])[2]")
    public WebElement att;

    @FindBy(xpath = "(//a[@class='ajax-modal-btn btn btn-new btn-flat'])[2]")
    public WebElement attbtn;

    @FindBy(xpath = "//select[@name='attribute_type_id']")
    public WebElement attType;

    @FindBy(id = "name")
    public WebElement attName;

    @FindBy(id = "order")
    public WebElement order;

    @FindBy(xpath = "//select[@name='categories[]']")
    public WebElement catName;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement savebtn;

    public void EnterEmail(String emailadd) throws InterruptedException {
        email.clear();
        email.sendKeys(emailadd);
        Thread.sleep(2000);
    }
    public void EnterPassword(String pwd) throws InterruptedException {
        pass.sendKeys(pwd);
        Thread.sleep(2000);
    }


    public void Clickonremember() throws InterruptedException {
        checkbox.click();
        Thread.sleep(2000);
    }
    public void ClickonLoginbtn() throws InterruptedException {
        LoginBtn.click();
        Thread.sleep(2000);
    }

    public void clickoncatalog()
    {
        catalog.click();
    }
    public void clickAttributes()
    {
        att.click();
    }
    public void clickAttbtn()
    {
        attbtn.click();
    }
    public void EnterAttType()
    {
        Select at = new Select(attType);
        at.selectByVisibleText("Radio");
    }
    public void EnterAttName()
    {
        attName.sendKeys("dish set");
    }
    public void Enterorder()
    {
        order.sendKeys("3");
    }
    public void selectcatagories()
    {
        Select ca = new Select(catName);
        ca.selectByVisibleText("Kitchen Spoon");
    }
    public void clicksavebtn()
    {
        savebtn.click();
    }
}




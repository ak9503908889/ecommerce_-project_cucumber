package pageobject;

import Stepdefination.CommenSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Productaction
{ private WebDriver driver;

    public Productaction(CommenSteps cs) {
        this.driver = cs.getDriver();
        PageFactory.initElements(driver,this);
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

    @FindBy(xpath = "(//i[@class='fa fa-angle-double-right'])[3]")
    public WebElement product;

    @FindBy(xpath = "//a[@class=' btn btn-new btn-flat']")
    public WebElement AddProduct;

    @FindBy(id = "name")
    public WebElement title;

    @FindBy(xpath = "//select[@name='active']")
    public WebElement status;

    @FindBy(xpath = "//div[@class='note-editable panel-body']")
    public WebElement description;

    @FindBy(xpath = "//select[@name='category_list[]']")
    public WebElement catagory;

    @FindBy(id = "origin_country")
    public WebElement country;

    @FindBy(id = "slug")
    public WebElement slug;

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
    public void clickProducts()
    {
        product.click();
    }
    public void clickAddPro()
    {
        AddProduct.click();
    }
    public void Entername()
    {
        title.sendKeys("Dinning hall");
    }
    public void selectstatus()
    {
        Select st = new Select(status);
        st.selectByVisibleText("Active");
    }
    public void EnterDescription()
    {
        description.sendKeys("please come all Dinner is reddy");
    }
    public void selectcatagory()
    {
        Select st = new Select(catagory);
        st.selectByVisibleText("Kitchen Spoon");
    }
    public void selectcountry()
    {
        Select st = new Select(country);
        st.selectByVisibleText("India");
    }
    public void Enterslug()
    {
        slug.sendKeys("kitchen-spoon");
    }
    public void clicksavebtn()
    {
        savebtn.click();
    }

}

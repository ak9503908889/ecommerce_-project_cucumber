package pageobject;

import Stepdefination.CommenSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class categoryaction
{public WebDriver driver;
    public categoryaction(CommenSteps cs) {
        this.driver = cs.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "(//i[@class='fa fa-angle-left pull-right'])[1]")
    public WebElement catalog;

    @FindBy(xpath = "(//i[@class='fa fa-angle-left pull-right'])[2]")
    public WebElement categories;

    @FindBy(xpath ="(//i[@class='fa fa-angle-right'])[1]")
    public WebElement group;

    @FindBy(xpath = "//a[@class='ajax-modal-btn btn btn-new btn-flat']")
    public WebElement btn;

    @FindBy(xpath="//input[@placeholder='Category name']")
    public WebElement name;

    @FindBy(id="order")
    public WebElement order;

    @FindBy(id = "slug")
    public WebElement slug;

    @FindBy(xpath = "//div[@class='input-group iconpicker-container']")
    public WebElement icon;

    @FindBy(xpath="//input[@placeholder='Type to filter']")
    public WebElement filterdropdown;

    @FindBy(xpath = "//select[@class='form-control select2-normal select2-hidden-accessible']")
    public WebElement status;

    @FindBy(xpath = "//div[@class='note-editable panel-body']")
    public WebElement text;

    @FindBy(id = "uploadBtn")
    public WebElement uploade;

    @FindBy(id = "uploadBtn1")
    public WebElement up1;

    @FindBy(id = "uploadBtn2")
    public WebElement up2;

    @FindBy(id = "meta_title")
    public WebElement metitle;

    @FindBy(id = "meta_description")
    public WebElement metaDe;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement save;

    @FindBy(xpath=("//i[@class='fa fa-heart']"))
    public WebElement heart;

    public void clickoncatalog()
    {
        catalog.click();
    }
    public void clickoncategories()
    {
        categories.click();
    }
    public void clickonGroup()
    {
        group.click();
    }
    public void clickAddgpbtn()
    {
        btn.click();
    }
    public void entername()
    {
        name.sendKeys("Kitchen");
    }
    public void enterorder()
    {    order.clear();
        order.sendKeys("10");
    }
    public void enterslug() throws InterruptedException {   slug.clear();
        Thread.sleep(5000);
        slug.sendKeys("_a-1");
    }
    public void icon()
    { icon.click();
    }
    public void filterdropdown() throws InterruptedException {  filterdropdown.clear();
       filterdropdown.sendKeys("heart");
       Thread.sleep(5000);
       //driver.findElements(By.xpath("//i[@class='fa fa-heart']"));
       heart.click();
       Thread.sleep(2000);
    }
    public void status()
    {
        Select st = new Select(status);
        st.selectByVisibleText("Active");
    }
    public void enterdescription()
    {
        text.sendKeys("be capable and make money u will get everything");
    }
    public void backgroundimg()
    {
        uploade.sendKeys("C:\\Users\\hp\\OneDrive\\Desktop\\1597587428463.jpg");
    }
    public void coverimage ()
    {

        up1.sendKeys("C:\\Users\\hp\\OneDrive\\Desktop\\1597587428463.jpg");
    }

    public void iconimage()
    {up2.sendKeys("C:\\Users\\hp\\OneDrive\\Desktop\\images.png");
    }
    public void entermetatitle()
    {
        metitle.sendKeys("amit");
    }
    public void entermetade()
    {
        metaDe.sendKeys("Hi");
    }
    public void clickonsavebtn()
    {
        save.click();
    }

}
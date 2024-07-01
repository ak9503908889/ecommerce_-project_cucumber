package Stepdefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CommenSteps {
    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    @Before
    public void setup() throws InterruptedException {
        /*System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Google\\Chrome\\Application\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions co=new ChromeOptions();
        co.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome-win64\\chrome.exe");*/
        //WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        this.driver = new ChromeDriver();
        //driver=new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(5000);

        System.out.println("browser is launched");
    }

    @After
    public void teardown() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();
        System.out.println("browser is closed");

    }
}
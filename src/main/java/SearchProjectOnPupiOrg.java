import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SearchProjectOnPupiOrg {

    private static WebDriver driver;
    public WebDriverWait wait = new WebDriverWait(driver, 10);

    @BeforeClass
    public static void setup(){
        System.setProperty("webdriver.chrome.driver", "/home/arsen/IdeaProjects/drivers/chromedriver");
        driver = new ChromeDriver();

        driver.get("https://www.google.com");

        driver.manage().window().maximize();
    }

    @Test
    public void openSecondResultFromItems(){
        driver.findElement(By.name("q")).sendKeys("selenium install ubuntu python");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[2]/div/div[1]/a/div/cite")).click();

        driver.findElement(By.name("q")).sendKeys("selenium");
        driver.findElement(By.xpath("//html/body/header/div/div/div[1]/form/button")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[2]/form/div[3]/ul/li[2]/a/h3")).click();

    }

    @AfterClass
    public static void quit(){
        driver.quit();
    }
}
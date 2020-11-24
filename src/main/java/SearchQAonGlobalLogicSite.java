import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SearchQAonGlobalLogicSite {

    private static WebDriver driver;
    public WebDriverWait wait = new WebDriverWait(driver, 10);
    @BeforeClass
    public static void setup(){
        System.setProperty("webdriver.chrome.driver", "/home/arsen/IdeaProjects/drivers/chromedriver");
        driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://www.globallogic.com/ua/careers/");
        js.executeScript("window.scrollBy(0,200)");

        driver.manage().window().maximize();
    }

    @Test
    public void getOfVacancyTest(){
        WebElement webElement = driver.findElement(By.id("by_keyword"));
        webElement.sendKeys("QA");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class ='btn btn-primary find-btn']")));
        driver.findElement(By.xpath("//button[@class ='btn btn-primary find-btn']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("mb-0")));
        System.out.println(driver.findElement(By.className("mb-0")).getText());
    }

    @AfterClass
    public static void quit(){
        driver.quit();
    }
}

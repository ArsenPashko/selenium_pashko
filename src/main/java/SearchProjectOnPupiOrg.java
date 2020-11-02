import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchProjectOnPupiOrg {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/arsen/IdeaProjects/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        driver.findElement(By.name("q")).sendKeys("selenium install ubuntu python");
        driver.findElement(By.name("btnK")).click();
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[2]/div/div[1]/a/div/cite")).click();

        driver.findElement(By.name("q")).sendKeys("selenium");
        driver.findElement(By.xpath("//html/body/header/div/div/div[1]/form/button")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[2]/form/div[3]/ul/li[2]/a/h3")).click();


    }

}

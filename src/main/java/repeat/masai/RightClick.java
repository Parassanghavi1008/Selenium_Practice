package repeat.masai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");

        driver.manage().window().maximize();

        Thread.sleep(4000);

        WebElement rc = driver.findElement(By.id("email"));

        Actions act = new Actions(driver);

        act.contextClick(rc).build().perform();

        driver.close();
    }
}

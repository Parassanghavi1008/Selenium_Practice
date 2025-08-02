package repeat.masai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHovering {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver(); // Browser is launched
        driver.get("https://www.ebay.com");

        driver.manage().window().maximize();

        Thread.sleep(3000);

        WebElement mousehover = driver.findElement(By.linkText("Fashion"));
        Actions act = new Actions(driver);

        act.moveToElement(mousehover).build().perform();

        Thread.sleep(3000);

        driver.quit();
    }
}

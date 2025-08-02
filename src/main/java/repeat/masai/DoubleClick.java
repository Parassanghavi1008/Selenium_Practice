package repeat.masai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver(); // Browser is launched
        driver.get("https://www.demo.guru99.com/test/simple_context_menu.html");

        driver.manage().window().maximize();

        Thread.sleep(3000);

        WebElement Xpathbutn = driver.findElement(By.xpath("//button[text()=\"Double-Click Me To See Alert\"]"));

        Actions act = new Actions(driver);

        act.doubleClick(Xpathbutn).build().perform();

        Thread.sleep(3000);

        driver.quit();
    }
}

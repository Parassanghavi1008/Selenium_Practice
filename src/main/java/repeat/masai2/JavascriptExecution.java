package repeat.masai2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JavascriptExecution {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");

        driver.manage().window().maximize();

        WebElement textbox = driver.findElement(By.id("name"));
//        textbox.sendKeys("ShreeRam");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('value, 'ShreeRam')", textbox);

        Thread.sleep(3000);

        WebElement radiobutton = driver.findElement(By.id("male"));

        js.executeScript("arguments[0].click()", radiobutton);

        driver.quit();
    }
}

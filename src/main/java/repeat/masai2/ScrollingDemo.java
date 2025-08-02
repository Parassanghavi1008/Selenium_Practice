package repeat.masai2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ScrollingDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demo.nopcommerce.com/");

        driver.manage().window().maximize();

        Thread.sleep(3000);

        // 1 scroll operation by - pixels, by moving to the end of the page, by mobing to selected Webelement

        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,1500)","");

        // 2 scroll operation by - moving to the end of the page

        js.executeScript("window.scrollBy(0, document.body.scrollHeight");
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0, -document.body.scrollHeight");

        // 3 scroll operation by - moving to the selected element
//        WebElement ele = driver.findElement(By.linkText("Apple MacBook Pro"));
//        js.executeScript("arguments[0].scrollIntoView()", ele);
        Thread.sleep(3000);

        driver.close();
    }
}

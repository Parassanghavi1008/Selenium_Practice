package repeat.masai1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeAssign {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://v1.training-support.net/selenium/iframes");
        driver.manage().window().maximize();
        WebElement frame1 = driver.findElement(By.xpath("//iframe[@src='/selenium/frame1']"));

        driver.switchTo().frame(frame1);

        driver.findElement(By.id("actionButton")).click();

        driver.switchTo().defaultContent();

        WebElement frame2 = driver.findElement(By.xpath("//iframe[@src='/selenium/frame2']"));

        driver.switchTo().frame(frame2);

        driver.findElement(By.id("actionButton")).click();

        driver.quit();

    }
}

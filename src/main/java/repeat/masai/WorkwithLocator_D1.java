package repeat.masai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkwithLocator_D1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/login");

//        WebElement user = driver.findElement(By.id("username"));
//        user.sendKeys("Ram");

//        driver.findElement(By.id("username")).sendKeys("tomsmith");
//        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
//
//        driver.findElement(By.partialLinkText("Elemental")).click();

//        driver.findElement(By.cssSelector("input#username")).sendKeys("tomsmith");
//        driver.findElement(By.cssSelector("input#password")).sendKeys("SuperSecretPassword!");
//        driver.findElement(By.cssSelector("button.radius")).click();

        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("tomsmith");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        Thread.sleep(3000);

        driver.quit();
    }

}

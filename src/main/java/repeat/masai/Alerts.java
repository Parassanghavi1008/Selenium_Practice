package repeat.masai;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.manage().window().maximize();

//        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

//        Alert alert1 = driver.switchTo().alert(); // one way
//        alert1.accept();

//        driver.switchTo().alert().accept(); // Second Way


//        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//        Alert alert2 = driver.switchTo().alert();
////        alert2.accept();
//        alert2.dismiss();
//        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        Alert alert3 = driver.switchTo().alert();
        alert3.sendKeys("Jay Shree Ram");
        System.out.println("Text is : " + alert3.getText());

        alert3.accept();

        Thread.sleep(5000);

        driver.quit();

    }
}

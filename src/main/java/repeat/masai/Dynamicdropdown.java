package repeat.masai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Dynamicdropdown {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        driver.manage().window().maximize();
        driver.findElement(By.name("q")).sendKeys("Selenium");

        Thread.sleep(2000);

        List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@class='wM6W7d']/span"));


        System.out.println(list.size());

        driver.close();
    }

}

package repeat.masai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Dropdown {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        WebElement dropdown = driver.findElement(By.xpath("//select[@id=\"country\"]"));

        // we use to select class to handle
        Select drp = new Select(dropdown);
//        drp.selectByIndex(4);
//         drp.selectByVisibleText("India");
//        drp.selectByValue("germany");
        List<WebElement> opt = drp.getOptions();

        System.out.println(opt.size());

        for(int i = 0; i < opt.size(); i++){

            System.out.println(opt.get(i).getText());
        }
        driver.quit();
    }
}

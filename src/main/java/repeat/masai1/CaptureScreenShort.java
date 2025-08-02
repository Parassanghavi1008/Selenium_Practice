package repeat.masai1;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class CaptureScreenShort {
    public static void main (String[] args) throws InterruptedException, IOException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        Thread.sleep(3000);

        TakesScreenshot ts = (TakesScreenshot) driver; // TakesScreenshort is an interface which takes screenshort of a complete page

        File SourceFile = ts.getScreenshotAs(OutputType.FILE); //get screenshort is a actual method which takes screenshort &
        File targetFile = new File("/Users/paraskumarzumbaralalsanghavi/Documents/Masai/R_Assignment/Capturess/fullpage1.png");

        FileUtils.copyFile(SourceFile, targetFile);



        WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));

//        File source1= logo.getScreenshotAs(OutputType.FILE);
//        File targetFile = new File("/Users/paraskumarzumbaralalsanghavi/Documents/Masai/R_Assignment/Capture ScreenShort/m1.png");
//
//        FileUtils.copyFile(source1, targetFile);


        driver.quit();

    }
}

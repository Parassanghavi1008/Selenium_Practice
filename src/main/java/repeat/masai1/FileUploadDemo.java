package repeat.masai1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FileUploadDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");

        driver.manage().window().maximize();

        driver.findElement(By.id("filesToUpload")).sendKeys("/Users/paraskumarzumbaralalsanghavi/Desktop/pic1.png");

        if (driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("pic1.png"))
        {
            System.out.println("File Uploaded Successfully");
        }else {
            System.out.println("File not Uploaded");
        }
        driver.quit();
    }
}

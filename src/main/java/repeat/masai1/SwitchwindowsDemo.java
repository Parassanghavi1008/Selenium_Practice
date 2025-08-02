package repeat.masai1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class SwitchwindowsDemo {
    public static void main(String[] args) {
        // Setup ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open the main page
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();

        // Click the "Open Tab" button
        driver.findElement(By.id("opentab")).click();

        // Store the parent window handle
        String parentHandle = driver.getWindowHandle();

        // Get all window handles
        Set<String> allWindows = driver.getWindowHandles();

        // Switch to the new window/tab
        for (String handle : allWindows) {
            if (!handle.equals(parentHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }

        // Set up an explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Wait for the preloader to disappear
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("preloader")));

        // Wait for the "Access all our Courses" link to be clickable
        WebElement courseLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Access all our Courses")));
        courseLink.click();

        // Pause for demo
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Switch back to the parent window
        driver.switchTo().window(parentHandle);

        // Optional: Click the "Home" button if it exists — update the locator as per the actual site structure
        // For example, here using a sample xpath (may need adjustment or removal)
        try {
            WebElement homeButton = driver.findElement(By.xpath("//button[text()='Home']"));
            homeButton.click();
        } catch (Exception e) {
            System.out.println("Home button not found or clickable.");
        }

        // Wait a bit before closing
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close all browser windows
        driver.quit();
    }
}

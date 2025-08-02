package repeat.masai;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://books.toscrape.com/");

        // Get the actual page title
        String actualTitle = driver.getTitle();
        String expectedTitle = "My Store";

        // Verify the title
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification PASSED!");
        } else {
            System.out.println("Title verification FAILED!");
            System.out.println("Expected: " + expectedTitle);
            System.out.println("Actual: " + actualTitle);
        }
        driver.close();
    }
}

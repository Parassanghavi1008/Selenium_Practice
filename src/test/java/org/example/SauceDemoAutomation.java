package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class SauceDemoAutomation
    extends TestCase
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        // Step 1: Login
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        // Step 2: Sort by Price
        WebElement sortDropdown = driver.findElement(By.className("product_sort_container"));
        sortDropdown.sendKeys("Price (low to high)");

        Thread.sleep(2000); // Allow sorting to take effect

        // Step 3: Add first two products to cart
        List<WebElement> addButtons = driver.findElements(By.cssSelector(".inventory_item button"));
        addButtons.get(0).click();
        addButtons.get(1).click();

        // Capture product details for assertion
        List<WebElement> items = driver.findElements(By.className("inventory_item"));
        String name1 = items.get(0).findElement(By.className("inventory_item_name")).getText();
        String desc1 = items.get(0).findElement(By.className("inventory_item_desc")).getText();
        String price1 = items.get(0).findElement(By.className("inventory_item_price")).getText();

        String name2 = items.get(1).findElement(By.className("inventory_item_name")).getText();
        String desc2 = items.get(1).findElement(By.className("inventory_item_desc")).getText();
        String price2 = items.get(1).findElement(By.className("inventory_item_price")).getText();

        // Step 4: Go to cart
        driver.findElement(By.className("shopping_cart_link")).click();

        // Step 5: Assertions for name, description, price
        List<WebElement> cartItems = driver.findElements(By.className("cart_item"));

        assert cartItems.get(0).findElement(By.className("inventory_item_name")).getText().equals(name1);
        assert cartItems.get(0).findElement(By.className("inventory_item_desc")).getText().equals(desc1);
        assert cartItems.get(0).findElement(By.className("inventory_item_price")).getText().equals(price1);

        assert cartItems.get(1).findElement(By.className("inventory_item_name")).getText().equals(name2);
        assert cartItems.get(1).findElement(By.className("inventory_item_desc")).getText().equals(desc2);
        assert cartItems.get(1).findElement(By.className("inventory_item_price")).getText().equals(price2);

        System.out.println("Assertions Passed for both products");

        // Step 6: Remove one product
        cartItems.get(0).findElement(By.tagName("button")).click();

        Thread.sleep(1000); // Give time for UI update

        System.out.println("One product removed from the cart.");

        //  Close browser
        driver.quit();
    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddProduct {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver_executable");

        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the SauceDemo website
        driver.get("https://www.saucedemo.com/");

        // Locate the username and password input fields and the login button
        WebElement usernameField = driver.findElement(By.id("user-name"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));

        // Enter valid login credentials
        usernameField.sendKeys("standard_user");
        passwordField.sendKeys("secret_sauce");

        // Click the login button
        loginButton.click();

        // Locate and click on a product (e.g., Sauce Labs Backpack)
        WebElement product = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        product.click();

        // Locate and click the "Add to Cart" button
        WebElement addToCartButton = driver.findElement(By.name("add-to-cart-sauce-labs-backpack"));
        addToCartButton.click();

        // Add validation logic to check if the product was added to the cart
        WebElement cartBadge = driver.findElement(By.className("shopping_cart_badge"));

        if (cartBadge.getText().equals("1")) {
            System.out.println("Product added to the cart successfully!");
        } else {
            System.out.println("Failed to add the product to the cart.");


        }

        // Close the browser
        driver.quit();
    }
}

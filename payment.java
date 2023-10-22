import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class payment {
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

        // Locate and click on products (e.g., Sauce Labs Bolt T-Shirt and Sauce Labs Fleece Jacket)
        WebElement product1 = driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']"));
        product1.click();

        WebElement product2 = driver.findElement(By.xpath("//div[text()='Sauce Labs Fleece Jacket']"));
        product2.click();

        // Locate and click the "Add to Cart" buttons
        WebElement addToCartButton1 = driver.findElement(By.name("add-to-cart-sauce-labs-bolt-t-shirt"));
        addToCartButton1.click();

        WebElement addToCartButton2 = driver.findElement(By.name("add-to-cart-sauce-labs-fleece-jacket"));
        addToCartButton2.click();

        // Locate and click the shopping cart icon to proceed to checkout
        WebElement shoppingCartIcon = driver.findElement(By.className("shopping_cart_link"));
        shoppingCartIcon.click();

        // Proceed to the checkout page
        WebElement checkoutButton = driver.findElement(By.id("checkout"));
        checkoutButton.click();

        // Enter billing information (modify with your actual data)
        WebElement firstNameField = driver.findElement(By.id("first-name"));
        WebElement lastNameField = driver.findElement(By.id("last-name"));
        WebElement zipCodeField = driver.findElement(By.id("postal-code"));

        firstNameField.sendKeys("John");
        lastNameField.sendKeys("Doe");
        zipCodeField.sendKeys("12345");

        // Click the "Continue" button to proceed with the payment
        WebElement continueButton = driver.findElement(By.id("continue"));
        continueButton.click();

        // Simulate the payment (not real payment information)
        WebElement finishButton = driver.findElement(By.id("finish"));
        finishButton.click();

        // Verify that the order has been completed
        WebElement confirmationMessage = driver.findElement(By.className("complete-text"));

        if (confirmationMessage.getText().equals("THANK YOU FOR YOUR ORDER")) {
            System.out.println("Payment and order completed successfully!");
        } else {
            System.out.println("Payment and order failed.");


        }

        // Close the browser
        driver.quit();
    }
}

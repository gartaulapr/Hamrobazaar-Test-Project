package hamrobazaartest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class logout {
		public static void funlogout() throws InterruptedException {
			
			WebDriverManager.chromedriver().setup();
			WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.manage().window().maximize();
			
	        String url = "https://hamrobazaar.com/login";
	        driver.get(url);

	      //login
	        
			// country selector dropdown
	        Select countryDropdown = new Select(driver.findElement(By.className("PhoneInputCountrySelect")));
	        countryDropdown.selectByValue("NP"); // Select Nepal by value, you can also use selectByVisibleText or selectByIndex

	        // Filling in the phone number
	        driver.findElement(By.className("PhoneInputInput")).sendKeys("984-9445573");

	        // Filling in the password
	        driver.findElement(By.name("password")).sendKeys("fWM$mu7k7T2@4vV");

	        // Clicking the password visibility toggle
	        driver.findElement(By.cssSelector("span.eye")).click();

	        // Submitting the form by clicking the login button
	        driver.findElement(By.cssSelector("button[type='submit']")).click();

	        // Add any assertions here to verify the expected outcomes, like successful login or validation messages

			//logout
	     
	        // Assuming you have to click on a profile or menu dropdown to access the logout link
	        // Replace 'menuButtonLocator' with the actual locator of your menu button
	        By menuButtonLocator = By.id("profileMenuButton"); // Example locator, adjust according to your application
	        driver.findElement(menuButtonLocator).click();

	        // Wait for the dropdown to appear and the logout link to be clickable
	        // Replace 'logoutButtonLocator' with the actual locator of your logout link/button
	        By logoutButtonLocator = By.id("logoutButton"); // Example locator, adjust according to your application
	        driver.findElement(logoutButtonLocator).click();

	        
		
		}

}

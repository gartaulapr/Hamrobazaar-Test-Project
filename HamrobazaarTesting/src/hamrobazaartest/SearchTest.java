package hamrobazaartest;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class SearchTest {
		public static void Additem() throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			ChromeDriver item=new ChromeDriver();
			  item.get("https://hamrobazaar.com/login");
			  item.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
			  item.manage().window().maximize();
			// Locate the search input element
		        WebElement searchInput = item.findElement(By.cssSelector(".nav-searchbar-input input[type=search]"));

		        // Set the text "Cosmetics" in the search input field
		        searchInput.sendKeys("vehicles");
		        
		        // Simulate pressing the Enter key
		        searchInput.sendKeys(Keys.ENTER);

		}

}

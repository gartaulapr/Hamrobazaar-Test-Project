package hamrobazaartest;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LogIn {

    @Test
    public void testLoginForm() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        String url = "https://hamrobazaar.com/login";
        driver.get(url);

        Select countryDropdown = new Select(driver.findElement(By.className("PhoneInputCountrySelect")));
        countryDropdown.selectByValue("NP");

        driver.findElement(By.className("PhoneInputInput")).sendKeys("984-9445573");
        driver.findElement(By.name("password")).sendKeys("fWM$mu7k7T2@4vV");
//        driver.findElement(By.cssSelector("span.eye")).click();
        driver.findElement(By.cssSelector(".form-login button[type='submit']")).click();
        driver.wait(1000 * 100);

       
    }
}

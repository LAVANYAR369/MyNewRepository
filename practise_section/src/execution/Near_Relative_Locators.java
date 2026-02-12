package execution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Near_Relative_Locators {
	public static void main(String[] args) {

	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(RelativeLocator.with(By.className("ico-login")).near(By.linkText("Register"))).click();
	driver.findElement(RelativeLocator.with(By.className("ico-login"))).click();
}
}

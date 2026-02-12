package execution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class To_Above_Relative_Locator {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.findElement(RelativeLocator.with(By.id("pollanswers-1")).above(By.id("pollanswers-2"))).click();
		Thread.sleep(2000);
		driver.findElement(RelativeLocator.with(By.id("newsletter-email")).above(By.xpath("//input[@type='button']"))).sendKeys("dshgiasj");
	}

}

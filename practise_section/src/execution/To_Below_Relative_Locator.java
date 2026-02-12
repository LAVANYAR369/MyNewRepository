package execution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class To_Below_Relative_Locator {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.id("pollanswers-2"))).click();
		driver.findElement(RelativeLocator.with(By.id("vote-poll-1")).below(By.id("pollanswers-4"))).click();
}
}
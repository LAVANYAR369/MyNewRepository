package tek_Pyramid;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase7 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement visible=driver.findElement(By.xpath("//i[@class='fa fa-home']"));
		
		if(visible.isDisplayed())
		{
			System.out.println(" Home page is visible successfully");
			
		}
		WebElement testcases=driver.findElement(By.xpath("//i[@class='fa fa-list']"));
				testcases.click();
			String currenturl=driver.getCurrentUrl();
		if(currenturl.contains("/test_cases"))
		{
			System.out.println("Navigate to the testcases page");
		}
		
	}

}

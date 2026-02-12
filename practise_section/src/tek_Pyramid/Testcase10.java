package tek_Pyramid;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase10 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement home=driver.findElement(By.xpath("//i[@class='fa fa-home']"));
		if(home.isDisplayed()) {
			System.out.println("home page displayed");
		}
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,15000);");
		WebElement end=driver.findElement(By.xpath("//h2[text()='Subscription']"));
		String match="SUBSCRIPTION";
		if(end.getText().equals(match))
		{
			System.out.println("Visible successfully");
		}
		driver.findElement(By.xpath("//input[@id='susbscribe_email']")).sendKeys("krmlavanya@gmail.com");
		driver.findElement(By.xpath("//button[@id='subscribe']")).click();
		
		
		
	}

}

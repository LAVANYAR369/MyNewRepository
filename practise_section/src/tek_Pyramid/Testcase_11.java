package tek_Pyramid;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Testcase_11 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//String home=driver.getTitle();
		//String check= "AutomationExercise";
		if(driver.getTitle().equalsIgnoreCase("Automation exercise"))
		{
			System.out.println("Home page is visible");
		}
		driver.findElement(By.xpath("//a[contains(text(),'Cart')]")).click();
		Actions act=new Actions(driver);
		act.scrollByAmount(0, 500);
		act.build().perform();
		WebElement subscription=driver.findElement(By.xpath("//h2[text()='Subscription']"));
	
		if(subscription.isDisplayed())
		{
			System.out.println("text visible");
		}
		driver.findElement(By.id("susbscribe_email")).sendKeys("krmlavanya@gmail.com");
		driver.findElement(By.id("subscribe")).click();
		
		WebElement success=driver.findElement(By.xpath("//div[text()='You have been successfully subscribed!']"));
		//String check1="You have been successfully subscribed!";
		System.out.println("displayed");
		if(success.isDisplayed())
		{
			System.out.println("visible successfully");
		}
	
}

}

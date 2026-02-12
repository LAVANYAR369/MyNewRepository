package tek_Pyramid;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase6 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get(("https://automationexercise.com/"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String name="Automation Exercise";
		if(driver.getTitle().equalsIgnoreCase(name)) {
			System.out.println("Yes, the home page is visible");
		
	}
		driver.findElement(By.xpath("//i[@class='fa fa-envelope']")).click();
		WebElement get=driver.findElement(By.xpath("//h2[text()='Get In Touch']"));
		if(get.isDisplayed())
		{
			System.out.println("GET IN TOUCH msg is displayed");
			
		}
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Lavanya",Keys.TAB,"krmlavanya@gmail.com",Keys.TAB,"Regarding return",Keys.TAB,"The ordered dress contain some damage, can you please change and give me a fresh one");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Alert alt= driver.switchTo().alert();
		alt.accept();	
		WebElement success=driver.findElement(By.xpath("//div[text()='Success! Your details have been submitted successfully.']"));
		if(success.isDisplayed())
		{
			System.out.println("successfully details are submitted");
		}
		driver.findElement(By.xpath("//i[@class='fa fa-angle-double-left']")).click();
		String home=driver.getCurrentUrl();
	
		String end="https://automationexercise.com/";

		if(home.equals(end))
		{
			System.out.println("Successfully landed to the home page");
		}
		}
		
}

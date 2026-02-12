package tek_Pyramid;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://automationexercise.com/");

		if(driver.getTitle().equalsIgnoreCase("Automation exercise"))
				{
			System.out.println("home page is visible successfully");
				}
		else
		{
			System.out.println("not visible");
		}
		
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.xpath("//a[text()=' Signup / Login']")).click();
WebElement login=driver.findElement(By.xpath("//h2[text()='Login to your account']"));
if(login.isDisplayed())
{
	System.out.println("login page visible");
}
driver.findElement(By.xpath("//input[@name='email']")).sendKeys("krmlavanya@gmail.com");
driver.findElement(By.xpath("//input[@name='password']")).sendKeys("hellow@123");
driver.findElement(By.xpath("//button[text()='Login']")).click();
WebElement search=driver.findElement(By.xpath("//p[text()='Your email or password is incorrect!']"));
if(search.isDisplayed())
{
System.out.println("it displaying the incorrect username and password");
	}
}
}
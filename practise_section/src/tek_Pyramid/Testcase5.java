package tek_Pyramid;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase5 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String name="Automation Exercise";
		if(driver.getTitle().equalsIgnoreCase(name)) {
			System.out.println("Yes, the home page is visible");
		}
		driver.findElement(By.xpath("//a[text()=' Signup / Login']")).click();
		WebElement login=driver.findElement(By.xpath("//h2[text()='Login to your account']"));
		if(login.isDisplayed())
		{
			System.out.println("login page visible");
		}
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("lavanya",Keys.TAB,"krmlavanya@gmail.com");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		WebElement verify=driver.findElement(By.xpath("//p[text()='Email Address already exist!']"));
		if(verify.isDisplayed())
		{
			System.out.println("yes it is displayed mail already exist msg");
		}
	}

}

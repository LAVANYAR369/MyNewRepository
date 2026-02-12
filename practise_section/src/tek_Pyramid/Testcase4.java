package tek_Pyramid;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase4 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String title=driver.getTitle();
		String check="Automation Exercise";
		if(title.equalsIgnoreCase(check)) {
			System.out.println("home page is visible");
		}
		driver.findElement(By.xpath("//a[text()=' Signup / Login']")).click();
		WebElement login=driver.findElement(By.xpath("//h2[text()='Login to your account']"));
		if(login.isDisplayed())
		{
			System.out.println("login page visible");
		}
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("krmlavanya@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("lavanya@123");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		WebElement name=driver.findElement(By.xpath("//b[text()='lavanya']"));
		if(name.isDisplayed())
		{
			System.out.println("Displayed");
		}
		driver.findElement(By.xpath("//a[text()=' Logout']")).click();
		String url=driver.getCurrentUrl();
		String cururl="https://automationexercise.com/login";
		if(url.equals(cururl))
		{
			System.out.println("its navigating to the current url");
		}
		
	
	
	
	
	}

}

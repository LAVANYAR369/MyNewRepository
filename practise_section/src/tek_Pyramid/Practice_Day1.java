package tek_Pyramid;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice_Day1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		if(driver.getTitle().equalsIgnoreCase("Automation exercise"))
				{
			System.out.println("home page is visible successfully");
				}
		else
		{
			System.out.println("not visible");
		}
		driver.get("https://automationexercise.com/");
		System.out.println();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement signupheader=driver.findElement(By.xpath("//a[@href='/login']"));
		
		if(signupheader.isDisplayed())
		{
			System.out.println("new user signup is visible");
		}
		else
		{
			System.out.println("not visible");
		}
		signupheader.click();
		WebElement search=driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("Lavanya",Keys.TAB,"krmlavanya07@gmail.com",Keys.TAB);
		search.submit();
		driver.findElement(By.xpath("//input[@type='radio']")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("lavanya@123");
		WebElement sel=driver.findElement(By.xpath("//select[@id='days']"));
		Select s=new Select(sel);
		
		s.selectByValue("6");
		driver.findElement(By.xpath("//option[text()='January']")).click();
		//driver.findElement(By.xpath("//select[@id='years']")).click();
		driver.findElement(By.xpath("//option[text()='1990']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='newsletter']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		WebElement fn=driver.findElement(By.xpath("//input[@data-qa='first_name']"));
		fn.sendKeys("lavanya",Keys.TAB,"vinoth",Keys.TAB,"Tak Pyramid",Keys.TAB,"Bangalore",Keys.TAB,"btm layout");
		driver.findElement(By.xpath("//option[text()='India']")).submit();
		driver.findElement(By.xpath("(//input[@type='text'])[8]")).sendKeys("Tamilnadu",Keys.TAB,"Bangalore",Keys.TAB,"624304",Keys.TAB,"9988774455",Keys.TAB);
		driver.findElement(By.xpath("//button[@data-qa='create-account']")).click();
		WebElement ac=driver.findElement(By.xpath("//b[text()='Account Created!']"));
		Thread.sleep(2000);
		if(ac.isDisplayed())
		{
			System.out.println("Account is created");
		}
		
		driver.findElement(By.xpath("//a[text()='Continue']")).click();
		WebElement we=driver.findElement(By.xpath("//b[text()='Lavanya']"));
		if(we.isDisplayed())
		{
			System.out.println("Login name displayed");
		}
		
	}

}

package practise_section;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Handling_calendar_Popup {
	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		String monthandyear="January 2026";
		int day=30;
	WebDriver driver=new ChromeDriver(option);
	driver.get("https://www.goibibo.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
	driver.findElement(By.xpath("//label[@for='departure']")).click();
	for(; ;)
	{
		try
		{
	
		driver.findElement(By.xpath("//div[text()='"+monthandyear+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='"+day+"']")).click();	
		break;
		}
		catch(Exception e)
		{
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		}
		}
	driver.quit();
	}

}

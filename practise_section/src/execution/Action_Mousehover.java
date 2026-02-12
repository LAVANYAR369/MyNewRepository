package execution;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Action_Mousehover {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.findElement(RelativeLocator.with(By.xpath("(//input[@type='checkbox']))[2]")).below(By.xpath("(//input[@type='checkbox'])[3]"))).click();
	driver.findElement(RelativeLocator.with(By.xpath("(//input[@type='checkbox'])[2]")).below(By.xpath("(//input[@type='checkbox'])[3]"))).click();
		
		
		
		
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("puma");
		
//driver.findElement(By.xpath("//div[@class='_3idirA']")).click();
		
	}

}

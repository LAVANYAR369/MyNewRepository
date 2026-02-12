package saturday_practise;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement s1=driver.findElement(By.xpath("//input[@name='q']"));
		s1.sendKeys("mobiles");
		s1.submit();
		driver.findElement(By.xpath("//div[@class='KzDlHZ']")).click();
		String parent=driver.getWindowHandle();
		Set<String>all=driver.getWindowHandles();
		for(String child:all)
		{
			if(!child.equals(parent))
			{
				driver.switchTo().window(child);
				driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']")).click();
			}
		}
	}

}

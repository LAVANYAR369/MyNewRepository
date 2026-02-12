package execution;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Hand {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement main=driver.findElement(By.xpath("//input[@name='q']"));
		main.sendKeys("toys");
		main.submit();
		String get=driver.getWindowHandle();
		WebElement child=driver.findElement(By.xpath("(//a[@class='wjcEIp'])[1]"));
		child.click();
		 Set<String> children = driver.getWindowHandles();
		for(String name:children)
		{
			driver.switchTo().window(name);
			String title=driver.getTitle();
			if(title.contains("VikriDa"))
			{
					driver.findElement(By.xpath("//*[local-name()='svg' and @class='NwyjNT']")).click();
			}
		}
	
	
	
	}

}

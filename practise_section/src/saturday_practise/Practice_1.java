package saturday_practise;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement a1=driver.findElement(By.xpath("//input[@name='q']"));
		a1.sendKeys("iphone");
		a1.submit();
		driver.findElement(By.xpath("//div[@class='KzDlHZ']")).click();
		String p1=driver.getWindowHandle();

		Set<String> b1=driver.getWindowHandles();
		for(String c1:b1)
		{
			
			if(!c1.equals(p1))
			{
				driver.switchTo().window(c1);
						//	driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']")).click();
				WebElement f1=driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']"));
						f1.click();
				Thread.sleep(2000);

			}


		}
		System.out.println("over");
		
	}

}

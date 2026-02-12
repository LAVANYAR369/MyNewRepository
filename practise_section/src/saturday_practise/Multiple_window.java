package saturday_practise;

import java.awt.Window;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_window {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String parent=driver.getWindowHandle();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobiles",Keys.ENTER);
		
		
		WebElement childch=driver.findElement(By.xpath("//div[@class='KzDlHZ']"));
		childch.click();
		//driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		
		Set<String> all=driver.getWindowHandles();
		  for (String window : all) {
	            driver.switchTo().window(window);
	            String title = driver.getTitle();
	            System.out.println("Switched to window: " + title);

	            if (title.contains("Ai+ Pulse")) {
	                System.out.println("Found POCO window!");
	                Thread.sleep(2000);  // Give time to load fully
	                
	                // Locate the SVG and click it
	                WebElement svgElement = driver.findElement(
	                    By.xpath("//*[name()='svg' and contains(@class,'NwyjNT')]")
	                );
	                svgElement.click();
	                break;  // Stop looping once POCO window is handled
	            }
	        }

//		for(String window:all)
//		{
//			driver.switchTo().window(window);
//			if(driver.getTitle().contains("POCO"))
//			{
//			Thread.sleep(200);
//			driver.findElement(By.xpath("//*[name()='svg' and @class=\"NwyjNT\"]")).click();
//
//			}
//		}
	
			driver.switchTo().defaultContent();
		System.out.println("performed");
		
	}
		
	}
		
			
	







				

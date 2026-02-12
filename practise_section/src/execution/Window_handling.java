package execution;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_handling {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		driver.findElement(By.linkText("Facebook")).click();
		Set<String>child=driver.getWindowHandles();
		for(String window:child) {
			driver.switchTo().window(window);
			if(driver.getTitle().contains("Facebook"))
			{
				driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("lavanya@gmail.com");
				driver.close();
			}
			
		}
		driver.switchTo().window(parent);
		driver.findElement(By.id("small-searchterms")).sendKeys("mobiles");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.close();
	}

}

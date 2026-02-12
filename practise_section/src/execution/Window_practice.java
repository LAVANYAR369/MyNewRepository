package execution;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_practice {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement parent=driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		parent.sendKeys("mobiles");
		parent.submit();
		driver.findElement(By.xpath("//div[@class='KzDlHZ']")).click();
		System.out.println(driver.getWindowHandle());
		Set<String> child=driver.getWindowHandles();
		driver.switchTo().window(null);
		
	}

}

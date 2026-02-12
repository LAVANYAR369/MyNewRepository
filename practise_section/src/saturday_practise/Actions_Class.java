package saturday_practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Class {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Static.html");
			
		Actions act=new Actions(driver);
		
	
		
		WebElement first=driver.findElement(By.xpath("//img[@id='angular']"));
		WebElement Place=driver.findElement(By.xpath("//div[@id='droparea']"));
		
		act.dragAndDrop(first,Place);
		act.perform();
		
		
		
	
	}

}

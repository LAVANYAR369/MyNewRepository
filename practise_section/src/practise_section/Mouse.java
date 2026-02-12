package practise_section;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		//driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		//WebElement search=driver.findElement(By.xpath("//div[text()='Drag Me']"));
		//Actions act=new Actions(driver);
		//act.contextClick();
		//act.clickAndHold();
		//act.build();
		//act.perform();
		driver.findElement(By.xpath("//section[text()='Frames']")).click();
		driver.findElement(By.xpath("//section[text()='iframes']")).click();
		driver.switchTo().frame(1);
		driver.switchTo().defaultContent();

		
	}

}

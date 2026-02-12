package execution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_with_htmlcode {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/USER/OneDrive/Desktop/iframe.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame("frame2");
		WebElement name=driver.findElement(By.xpath("//button[text()='Quick Start']"));
		name.click();
		System.out.println("over");
		driver.switchTo().defaultContent();
		System.out.println("parent");
		driver.findElement(By.xpath("//h1[contains(text(),'Welcome')]")).click();
		System.out.println("over");
	}

}

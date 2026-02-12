package saturday_practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frameworking {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/frames?sublist=0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement fram=driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
		
		driver.switchTo().frame(fram);
		WebElement name=driver.findElement(By.xpath("//input[@id='username']"));
		name.sendKeys("lavanya",Keys.TAB,"lavanya@123");
	}

}

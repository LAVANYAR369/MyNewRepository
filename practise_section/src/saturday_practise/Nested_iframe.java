package saturday_practise;

import java.awt.RenderingHints.Key;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nested_iframe {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement first=driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
		driver.switchTo().frame(first);
		WebElement second= driver.findElement(By.xpath("//input[@id='email']"));
		second.sendKeys("lavanya@gmail.com",Keys.TAB,"lavanya123",Keys.TAB,"lavanya123",Keys.TAB,Keys.ENTER);
		WebElement third=driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
		driver.switchTo().frame(third);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("lavanya",Keys.TAB,"lavanya123",Keys.TAB,Keys.ENTER);
		
		
	}

}

package saturday_practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowHost_Element_Open{
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/shadow?sublist=0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		SearchContext sc=driver.findElement(By.xpath("(//div[@class='my-3'])[1]")).getShadowRoot();
		sc.findElement(By.cssSelector("input[type='text']")).sendKeys("lavanya");
		SearchContext sc1=driver.findElement(By.xpath("(//div[@class='my-3'])[2]")).getShadowRoot();
		sc1.findElement(By.cssSelector("input[type='text']")).sendKeys("lavanya@123");
		//SearchContext sc2=driver.findElement(By.xpath("//button[text()='Login']")).getShadowRoot();
		//sc2.findElement(By.cssSelector("button[type='submit']")).click();
		driver.findElement(By.xpath("//button[text()='Login']")).click();
	}
	

}

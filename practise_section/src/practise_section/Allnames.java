package practise_section;

import java.awt.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Allnames {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement search=driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		search.sendKeys("iphone");
		search.submit();
		 WebElement allnames = driver.findElement(By.xpath("(//div[@class='Nx9bqj _4b5DiR'])[1]"));
	}

}

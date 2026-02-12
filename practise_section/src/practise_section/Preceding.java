package practise_section;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Preceding {
	public static <webelement> void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement search=driver.findElement(By.xpath("//input[@class='Pke_EE']"));
	search.sendKeys("iphone16");
	Thread.sleep(1000);
	search.submit();
	List<WebElement>pnames=driver.findElements(By.xpath("//div[text()='Apple iPhone 16 (Black, 128 GB)']"));
	
	for(int i=1;i<pnames.size();i++)
			{
		String allnames=pnames.get(i).getText();
			}
	
	}

}

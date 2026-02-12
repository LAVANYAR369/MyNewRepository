package practise_section;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusBookingTest {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://ksrtc.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//label[contains(text(),'Departure')]")).click();
		driver.findElement(By.xpath("//span[text()='November']/ancestor::div[@class='ui-datepicker-group ui-datepicker-group-first']/descendant::a[text()='26']")).click();
	}

}

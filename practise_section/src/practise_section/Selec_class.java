package practise_section;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selec_class {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get(("https://demoapps.qspiders.com/ui?scenario=1"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		
		WebElement search=driver.findElement(By.xpath("//select[@id='country_code']"));
		Select s=new Select(search);
		s.selectByIndex(1);
		s.deselectAll();
		
	}

}

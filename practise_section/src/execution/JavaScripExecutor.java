package execution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScripExecutor {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor jse =(JavascriptExecutor)driver;
		jse.executeScript("document.getElementById('small-searchterms').value='mobiles';");
		
		WebElement searchbt=driver.findElement(By.xpath("//input[@type='submit']"));
		jse.executeScript("arguments[0].click()", searchbt);

}
}


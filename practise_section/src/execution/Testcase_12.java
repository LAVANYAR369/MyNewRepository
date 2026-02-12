package execution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Testcase_12 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		if(driver.getTitle().equalsIgnoreCase("Automation exercise"))
		{
			System.out.println("Home page is visible");
		}
		driver.findElement(By.xpath("//a[contains(text(),'Products')]")).click();
		Actions act=new Actions(driver);
		WebElement firstpro=driver.findElement(By.xpath("//div[@class='product-image-wrapper']"));
		act.moveToElement(firstpro).perform();
		System.out.println("printed");
		Thread.sleep(1000);
		WebElement addtocart=driver.findElement(By.xpath("(//a[@class='btn btn-default add-to-cart'])[1]"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollintoview(true);",addtocart);
		
		Thread.sleep(5000);
		addtocart.click();
	}

}

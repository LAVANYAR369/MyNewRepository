package tek_Pyramid;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Testcase8_Product {
	public static void main(String[] args)   {
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement home=driver.findElement(By.xpath("//i[@class='fa fa-home']"));
		if(home.isDisplayed()) {
			System.out.println("home page displayed");
		}
		driver.findElement(By.xpath("//i[@class='material-icons card_travel']")).click();
		String productpage=driver.getCurrentUrl();
		if(productpage.contains("/products"))
		{
			System.out.println("Navigated to the product page");
		}
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,2000);");

		driver.findElement(By.xpath("//a[@href='/product_details/1']")).click();
		List<WebElement> details=driver.findElements(By.xpath("class=\"product-information\""));
		if(details.size()>0)
		{
			System.out.println("Products list is visible");
		}
	}

}

package tek_Pyramid;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase9 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement home=driver.findElement(By.xpath("//i[@class='fa fa-home']"));
		if(home.isDisplayed()) {
			System.out.println("home page displayed");
		}
		driver.findElement(By.xpath("//i[@class='material-icons card_travel']")).click();
		System.out.println(driver.getTitle());
		WebElement all=driver.findElement(By.xpath("//h2[@class='title text-center']"));
		if(all.isDisplayed())
		{
			System.out.println("Navigated to the all product page successfully");
		}
		WebElement find=driver.findElement(By.xpath("//input[@id='search_product']"));
		find.sendKeys("jean");
		driver.findElement(By.xpath("//button[@id='submit_search']")).click();
		List<WebElement>allpro=driver.findElements(By.xpath("//div[@class='features_items']"));
		if(allpro.size()>0)
		{
			System.out.println("visible");
		}
	}

}

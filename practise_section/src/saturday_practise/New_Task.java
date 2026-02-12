package saturday_practise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class New_Task {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement good=driver.findElement(By.xpath("//span[text()='Fashion']"));
		Actions act=new Actions(driver);

		act.moveToElement(good);
		act.perform();
		List<WebElement> first=driver.findElements(By.xpath("//a[@class='_1BJVlg']"));
		List<WebElement> one=driver.findElements(By.xpath("//div[contains(text(),'More in ')]/ancestor::div[@class='_31z7R_']/descendant::a"));
				
		for(WebElement how:first)
		{
			
		String ty = how.getText();
			System.out.println(ty );
			
		}
		for(int i=0;i<one.size();i++)
		{
			String rd = one.get(i).getText();
			System.out.println(rd );
		}
		driver.quit();
	}

}

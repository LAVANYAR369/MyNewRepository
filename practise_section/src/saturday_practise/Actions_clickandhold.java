package saturday_practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actions_clickandhold {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/captcha?sublist=0");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			//WebElement ch=driver.findElement(By.xpath("//div[@id='circle']"));
			//WebElement otp=driver.findElement(By.xpath("//section[text()='Captcha']"));
			Actions act=new Actions(driver);
			//act.clickAndHold(ch);
			//act.contextClick(ch);
			
			//act.click(otp);
			//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
			//wait.until(ExpectedConditions.elementToBeClickable(otp));
			
			
			WebElement hi=driver.findElement(By.xpath("//button[text()='Register']"));
			act.moveToElement(hi);
			
			act.perform();
			System.out.println("hi hellow");
			
	}

}

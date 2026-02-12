package saturday_practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Closed_shadow {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/shadow/closed?sublist=1");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//section[@class=\"pt-3 p-6 basis-[60%] bg-white h-fit\"]/h1[text()='Login']")).click();
		Actions act=new Actions(driver);
		act.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		act.sendKeys("lavanya");
		act.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		act.sendKeys("lavanya@123");
		act.sendKeys(Keys.TAB);
		act.sendKeys(Keys.ENTER);
		act.perform();
		driver.quit();
		

}
}
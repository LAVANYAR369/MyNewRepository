package tek_Pyramid;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_TC2 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://automationexercise.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String title= driver.getTitle();
		//System.out.println(title);
		String compare="Automation Exercise";
		if(title.equals(compare))
		{
			System.out.println("visible");
		}
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		WebElement data=driver.findElement(By.xpath("//h2[text()='Login to your account']"));
		//String check="Login to your account";
		if(data.isDisplayed())
		{
			System.out.println("matching");
		}
		WebElement login=driver.findElement(By.xpath("(//input[@type='email'])[1]"));
		login.sendKeys("krmlavanya07@gmail.com",Keys.TAB,"lavanya@123",Keys.TAB);
		login.submit();
		WebElement same=driver.findElement(By.xpath("//b[text()='Lavanya']"));
		String name="Lavanya";
		if(same.isDisplayed())
		{
			System.out.println("same");
		}
		driver.findElement(By.xpath("//a[text()=' Delete Account']")).click();
		String delete="Account Deleted!";
		WebElement find=driver.findElement(By.xpath("//b[text()='Account Deleted!']"));
		if(delete.equals(find))
		{
			System.out.println("Deleted");
		}
	}

}

package saturday_practise;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Duration;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_element {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement screen=driver.findElement(By.xpath("//a[@class='_1krdK5 _3jeYYh']"));
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=screen.getScreenshotAs(OutputType.FILE);
		File f=new File("./screen1/test.png");
		FileUtils.copyFile(source, f);
		
		
		
	}

}

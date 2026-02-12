package execution;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Try_new {
	public static void main(String[] args) throws IOException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://automationexercise.com/");
		TakesScreenshot ts= (TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File f=new File("./Folder1/screen.png");
		FileHandler.copy(src,f);
		
		}

}

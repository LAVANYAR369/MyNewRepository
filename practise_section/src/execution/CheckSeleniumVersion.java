package execution;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class CheckSeleniumVersion {
	    public static void main(String[] args) {
	        System.out.println("Selenium version: " + new ChromeDriver().getClass().getPackage().getImplementationVersion());
	    }
	}




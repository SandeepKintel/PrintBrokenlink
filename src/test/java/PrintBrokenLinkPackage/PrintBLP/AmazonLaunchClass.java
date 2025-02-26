package PrintBrokenLinkPackage.PrintBLP;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(ItestListenerPro.class)
public class AmazonLaunchClass extends ItestListenerPro {
	@BeforeMethod
	public void LaunchBrowser()
	{
		driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@AfterMethod
	public void QuitBrowser()
	{
		driver.quit();
	}

}

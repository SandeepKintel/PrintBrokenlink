package PrintBrokenLinkPackage.PrintBLP;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class VisitHomepage extends AmazonLaunchClass{
	@Test(retryAnalyzer=PrintBrokenLinkPackage.PrintBLP.iRetryAnalyzerPro.class)
	public void visitHomepage() throws InterruptedException
	{
		Thread.sleep(12000);
		AmazonHomepage amz = new AmazonHomepage(driver);
		
		amz.displayLogo();	

		/*List<WebElement> li=(List<WebElement>) driver.findElement(By.tagName("a"));
		Thread.sleep(2000);
		
		for(int i=0; i<li.size(); i++)
		{
			WebElement e1= li.get(i);
			System.out.println(e1);
			String url = e1.getAttribute("href");
			String msg = e1.getText();
			
			URL url1 = new URL(url);
			HttpURLConnection hp= (HttpURLConnection) url1.openConnection();
			int code=hp.getResponseCode();
			String resmsg = hp.getResponseMessage();
			
		}*/
	}

}

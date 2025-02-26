package PrintBrokenLinkPackage.PrintBLP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AmazonHomepage {
	WebDriver driver;
	
	@FindBy(xpath="//a[@id=\"nav-logo-sprites\"]")
	WebElement Logo;
	
	public void displayLogo()
	{
		Assert.assertTrue(Logo.isDisplayed());
	}
	
	public AmazonHomepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}

package PrintBrokenLinkPackage.PrintBLP;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ItestListenerPro implements ITestListener{
	static WebDriver driver;

	@Override
	public void onTestSuccess(ITestResult result) {
		
		ITestListener.super.onTestSuccess(result);
		Reporter.log("Test Case is Passed");
		Date d1 = new Date();
		Date d2 = new Date(d1.getTime());
		String time = d2.toString();
		System.out.println(time);
		String date = time.substring(4, 10);
		String istTime= time.substring(11);
		String modiTime = istTime.replace(':', '_');
		String exactTime = date.concat(istTime);
		
		TakesScreenshot ts= (TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\sandeep.kumar\\eclipse-workspace\\PrintBLP\\Screenshots\\Passed\\PassedSS "+exactTime+".png");
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestFailure(ITestResult result) {

		ITestListener.super.onTestFailure(result);
		Reporter.log("Test Case is Failed");
		Date d1 = new Date();
		Date d2 = new Date(d1.getTime());
		String time = d2.toString();
		System.out.println(time);
		String date = time.substring(4, 10);
		String istTime= time.substring(11);
		String modiTime = istTime.replace(':', '_');
		String exactTime = date.concat(istTime);
		
		TakesScreenshot ts= (TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\sandeep.kumar\\eclipse-workspace\\PrintBLP\\Screenshots\\Failed\\FailedSS "+exactTime+".png");
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}

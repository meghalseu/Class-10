package framework.skeleton;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestRunner {

	public static WebDriver getdriver(String browser)
	{
		if (browser.equalsIgnoreCase("ie")) 
			
			return new InternetExplorerDriver();
		if(browser.equalsIgnoreCase("chrome"))
			
			return new ChromeDriver();
		else 
			return new FirefoxDriver();
	}
	
	public static void main(String[] args) {
		
		WebDriver driver = getdriver("ff");
		
				
		ArrayList<ITestCase> Testcases = new ArrayList<>();
		 
		
		Testcases.add(new Testcase1());
		Testcases.add(new Testcase2());
		
		for (ITestCase tc : Testcases) {
			 tc.setup();
			 tc.run(driver);	
			 tc.cleanup();
		}
		
	}


}	
	
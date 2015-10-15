package framework.skeleton;

import org.openqa.selenium.WebDriver;

public interface ITestCase {
	
	void setup ();
	

	void run (WebDriver driver);
	
	
	void cleanup ();
	
}

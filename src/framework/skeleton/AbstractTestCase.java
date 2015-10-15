package framework.skeleton;

import org.openqa.selenium.WebDriver;

public abstract class AbstractTestCase implements ITestCase {
	

	@Override
	public void setup() {

		System.out.println("Login successful");
		
	}

	@Override
	public abstract void run(WebDriver driver);

	@Override
	public void cleanup() {
		
		System.out.println("Logout");
		
	}



}

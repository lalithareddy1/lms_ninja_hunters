package hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.lms.util.TestBase;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class Hooks extends TestBase {
	
	
	@After(order = 1)
	public void takeScreenshot(Scenario scenario) {
		
		
		if(scenario.isFailed()) {
			TakesScreenshot screenshot = (TakesScreenshot)driver;
			byte[] src = screenshot.getScreenshotAs(OutputType.BYTES);
			scenario.attach(src, "image/png", "screenshot");
			
		}
	}
	
	
}

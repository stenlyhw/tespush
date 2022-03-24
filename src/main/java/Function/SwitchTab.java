package Function;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

public class SwitchTab {
	public static WebDriver driver;
	
	public void WebDriver() {
		this.driver = driver;
	}
	
	public void gantitab() {
		ArrayList<String> tab = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tab.get(1));
	}
}

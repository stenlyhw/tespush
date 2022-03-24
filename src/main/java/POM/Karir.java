package POM;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import Function.SwitchTab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Karir {
	public static WebDriver driver;
	public static SwitchTab switchtab;
	
	By KarirTab = By.xpath("//*[@id=\"about-inews\"]/div/div[6]/div[1]/div/div[1]/ul/li[3]/a"); 
	By Logo = By.xpath("//*[@id=\"headerBottom\"]/div/div[1]");
	
	public Karir(WebDriver driver) {
		this.driver = driver;
	}


public void KarirTab()
{
	switchtab = new SwitchTab();
	driver.findElement(KarirTab).click();
	switchtab.gantitab();
}


public void ValidateKarir() {
	boolean logo = driver.findElements(Logo).size() > 0;
	assertTrue(logo);
}

public void ValidateKarir2()
{
	String url1 = driver.getCurrentUrl();
	String url2 = "http://www.jobsmnc.co.id/";
	assertEquals(url1, url2);
}
}
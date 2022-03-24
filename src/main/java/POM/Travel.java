package POM;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Travel {
	public WebDriver driver;
	By Destinasi = By.xpath("//*[@id=\"slick-slide01\"]/div/div[1]/div/div[1]/div[2]/b");
	By Kuliner = By.xpath("//*[@id=\"slick-slide02\"]/div/div[1]/div/div[1]/div[2]/b");
	
	public Travel(WebDriver driver) {
		this.driver = driver;
	}
	
	public void ValidateTravel()
	{
		boolean validate = driver.findElements(Kuliner).size() > 0;
		assertTrue(validate);
	}
	
	public void ValidateTravel2()
	{
		String url1 = driver.getCurrentUrl();
		String url2 = "https://www.inews.id/travel";
		assertEquals(url1, url2);
		
	}

}


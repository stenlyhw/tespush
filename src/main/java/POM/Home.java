package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Home 
{
	public WebDriver driver;
	
	@FindBy (how = How.XPATH, using = "/html/body/section[1]/div/nav/div[2]/ul/li[6]/a")
	WebElement Travel;
	
	By Travel2 = By.xpath("/html/body/section[1]/div/nav/div[2]/ul/li[6]/a");
	
	
	public Home(WebDriver driver) {
		this.driver = driver;
	}


	public void iNews () {
		driver.get("https://inews.id");
		boolean home = driver.findElements(By.xpath("/html/body/section[1]/div/nav/div[2]/ul/li[1]/a")).size() > 0;
		Assert.assertTrue(home);
	}
	public void Homepage(WebDriver driver)
    {
		PageFactory.initElements(driver, this);
    }
	
	public void Travel()
    {
		driver.findElement(Travel2).click();
    }
}

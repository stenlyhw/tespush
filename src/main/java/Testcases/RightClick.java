package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		  	driver = new ChromeDriver();
		  	driver.manage().window().maximize();
		  	driver.get("http://inews.id");
		  	Thread.sleep(3000);
		  	Actions action = new Actions(driver);
		  	WebElement image = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/a/img"));
		  	action.contextClick(image).perform();
		  	Thread.sleep(3000);
		  	driver.close();
	}

}

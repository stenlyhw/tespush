package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.reporters.jq.Main;

public class NewTabCheck {
	public static WebDriver driver;
	
 public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
	  	driver = new ChromeDriver();
	  	driver.manage().window().maximize();
	  	driver.get("http://inews.id");
	  	Thread.sleep(3000);
	  	driver.findElement(By.xpath("/html/body/section[3]/div[2]/div/div[3]/div/div[13]/div/div/div/div[6]/div[1]/div/div[1]/ul/li[3]/a")).click();
 }
		

}

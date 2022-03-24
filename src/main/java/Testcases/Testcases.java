package Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import POM.Home;
import POM.Travel;
import POM.Karir;

public class Testcases {

	public static WebDriver driver;
	public static Home menu;
	public static Travel travel;
	public static Karir karir;
	
@BeforeTest()
public void before()
{
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
  	driver = new ChromeDriver();
  	driver.manage().window().maximize();
}


@Test(priority = 1)
public void test1() throws InterruptedException{
	menu = new Home(driver);
	menu.iNews();
	Thread.sleep(3000);
}

@Test(priority = 2)
public void test2(){
	menu = new Home(driver);
	menu.Travel();
}


@Test(priority = 3)
public void test3(){
	travel = new Travel(driver);
	travel.ValidateTravel();
	travel.ValidateTravel2();
}

@Test(priority = 4)
public void test4() {
	karir = new Karir(driver);
	karir.KarirTab();
	karir.ValidateKarir();
	karir.ValidateKarir2();
}

@AfterTest()
public void after() throws InterruptedException
{
	Thread.sleep(3000);
	driver.close();
}


}

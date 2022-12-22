package demoMaven;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestClass {
	    WebDriver driver;
	
		@BeforeSuite
		public void beforeSuite() {
			//RestAssured.baseURI = "https://cdn-api.co-vin.in/api";
			System.setProperty("webdriver.chrome.driver", "/Users/b0228121/Documents/EclipseProjects/demoMaven/chromedriver");
			
			driver = new ChromeDriver();
		}
		
		
		@Test(enabled = true)
		public void openGoogle(Method m) {
			System.out.println("--------------"+m.getName()+"--------------");	
			
			driver.get("https://www.google.co.in");
			driver.manage().window().maximize();
			driver.quit();
			System.out.println("Goggle is successfully opened and closed");
		}
}

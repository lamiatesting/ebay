package com.ebayyUtility.qa;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ebayyBaseClass {
	public static Properties prop;
	public static WebDriver driver;
	
	public ebayyBaseClass() {
		try {
			FileInputStream fls = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\ebayyConfig\\qa\\ebayyConfigFile.properties");
			prop = new Properties();
			prop.load(fls);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void initBrowser() {
		String BrowserSet = prop.getProperty("Browser1");
		
		if(BrowserSet.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\ebayyDriver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		}
		else if(BrowserSet.equals("Chrome")) {
			
		}
	}
	
	public static void launchURL(String URL) {
		driver.get(prop.getProperty("URL"));
		
	}
}

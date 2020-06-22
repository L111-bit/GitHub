package com.cucum.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase() {
		
		prop =new Properties();
		FileInputStream fis;
		try {
			fis = new FileInputStream("C:\\Users\\ELCOT\\eclipse-workspace\\BDD\\YOUTUBE\\src\\test\\java\\com\\cucum\\config\\Config.properties");
			
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public static void initialization() {
		String browserName=prop.getProperty("browser");
		if(browserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\Downloads\\chromedriver_v83\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox")) {
			
			driver= new FirefoxDriver();
		}
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
		
		
		
		
	}
	
	
	
	
}

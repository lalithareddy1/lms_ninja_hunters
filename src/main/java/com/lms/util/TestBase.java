package com.lms.util;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop ;
	public static String properties_path = System.getProperty("user.dir") + "//src//test//resources//properties//project.properties";

	public static String project_path = System.getProperty("user.dir");

	
	public TestBase() {

		try {
			prop = new Properties();
			FileInputStream fs = new FileInputStream(properties_path);
			prop.load(fs);
		} catch (Exception e) {
			e.printStackTrace();
		}
		PageFactory.initElements(driver, this);

	}
	
	public static void initialization() {
		String browserName = prop.getProperty("browser");
		System.out.println("Browser name :" + browserName);
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", project_path+"//src//test//resources//drivers//chromedriver.exe");
			driver = new ChromeDriver();

		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(prop.getProperty("url"));
		
	}
	
	public void open_url() {
		driver.get(prop.getProperty("url"));
	}
	
	
}

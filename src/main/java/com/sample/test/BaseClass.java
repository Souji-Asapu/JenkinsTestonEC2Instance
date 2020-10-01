package com.sample.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class BaseClass 
{

	WebDriver driver;
	String url = "https://toolsqa.com";

	@Parameters
	@BeforeTest
	public void setup(String browser) {
		DesiredCapabilities caps = new DesiredCapabilities();

		if(browser.equals("Chrome")){
			WebDriverManager.chromedriver().setup();
		}else if(browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
		}
		caps.setCapability("browserName", browser);
		try {
			driver = new RemoteWebDriver(new URL(url), caps);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Navigate to a URL
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
	}


}

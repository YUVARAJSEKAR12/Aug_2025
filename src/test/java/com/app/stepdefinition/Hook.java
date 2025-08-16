package com.app.stepdefinition;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.app.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hook extends BaseClass {

	@Before
	public void browserlanch() {
		
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notification");
		op.addArguments("--start-maximized");
		op.addArguments("--incognito");//firefox private , edge inprivate
		DesiredCapabilities cap1 = new DesiredCapabilities();
		cap1.setCapability(ChromeOptions.CAPABILITY, op);
		// WebDriverManager.chromedriver().setup();
		// driver = new ChromeDriver();
		// driver.get("https://adactinhotelapp.com/");// url need to come form
		// properties file

		// grid
		try {

			String browser = System.getProperty("browser");
			// DesiredCapabilities cap = new DesiredCapabilities();
			// cap.setBrowserName("chrome");
			// cap.setVersion("latest");
			// cap.setCapability("platform", "WIN10");
			DesiredCapabilities cap = new DesiredCapabilities();
			switch (browser.toLowerCase()) {
			case "chrome":
				cap.setBrowserName("chrome");

			case "firefox":
				cap.setBrowserName("firefox");
			case "edge":
				cap.setBrowserName("edge");
			default:
				cap.setBrowserName("chrome");
			}

			driver = new RemoteWebDriver(new URL("https://localhost:8080"), cap);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@After
	public void teardown() {
		// screen shot ...reports
		Date d = new Date();
		System.out.println(d);
		try {
			System.out.println("screen shot");
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File des = new File("C:\\Users\\HP\\eclipse-workspace\\Develop\\new\\new\\oct" + "\\API_2025_July\\target\\"
					+ d + "screenshot.jpeg");
			FileUtils.copyFile(src, des);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

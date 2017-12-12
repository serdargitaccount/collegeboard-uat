package com.collegeboard.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Driver {

	private static WebDriver driver;
	static DesiredCapabilities caps = new DesiredCapabilities();

	public static WebDriver getInstance() {

		if (driver == null || ((RemoteWebDriver) driver).getSessionId() == null) {

			switch (Config.getProperty("browser")) {

			case "chrome":
				caps = DesiredCapabilities.chrome();
				caps.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
				
				System.setProperty("webdriver.chrome.driver", Config.getProperty("chrome"));
				driver = new ChromeDriver(caps);
				break;
			case "firefox":
				caps = DesiredCapabilities.firefox();
				caps.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
				
				System.setProperty("webdriver.gecko.driver", Config.getProperty("firefox"));
				driver = new FirefoxDriver(caps);
				break;
			case "ie":
				caps = DesiredCapabilities.internetExplorer();
				caps.setCapability(InternetExplorerDriver.NATIVE_EVENTS, false);
				caps.setCapability(InternetExplorerDriver.ENABLE_PERSISTENT_HOVERING, false);
				caps.setCapability(InternetExplorerDriver.REQUIRE_WINDOW_FOCUS, false);
				caps.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
				caps.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
				caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);

				System.setProperty("webdriver.ie.driver", Config.getProperty("ie"));
				driver = new InternetExplorerDriver(caps);
				break;
			case "safari":
				System.setProperty("webdriver.safari.driver", Config.getProperty("safari"));
				driver = new SafariDriver();
				break;
			case "phantomjs":
				System.setProperty("webdriver.phantomjs.driver", Config.getProperty("phantomjs"));
				driver = new PhantomJSDriver();
				break;
			default:
				System.setProperty("webdriver.chrome.driver", Config.getProperty("chrome"));
				driver = new ChromeDriver();
			}

		}

		return driver;

	}

	public static void closeDriver() {
		if (driver != null) {
			driver.quit();
			
		}

	}

}

package operation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Base {
	public static WebDriver driver;
	public static String url = "https://www.google.com/";
	public static Page pg;
	public static Util util;
	

	public static void startDriver() {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "//chromedriver//chromedriver100.exe");
		ChromeOptions options = new ChromeOptions();
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(capabilities);
		driver = new ChromeDriver(options);
		driver.get(url);
		driver.manage().window().maximize();
	}

	public static void closeDriver() {
		driver.close();
		driver.quit();
	}

	@Before
	public void setup() {
		startDriver();
	}

	@After
	public void endTest() {
		closeDriver();
	}
}

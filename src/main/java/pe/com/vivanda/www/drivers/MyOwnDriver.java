package pe.com.vivanda.www.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyOwnDriver {
	
	private static WebDriver driver;

	public static MyOwnDriver web() {
		System.setProperty("webdriver.chrome.driver",
				"chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito", "--start-maximized", "--disable-infobars");
		driver = new ChromeDriver(options);
		return new MyOwnDriver();
	}
	
	public WebDriver inTheWebPage(String url) {
		driver.get(url);
		return driver;
	}

}

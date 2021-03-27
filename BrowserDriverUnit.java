package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserDriverUnit {
	WebDriver driver;
	/**
	 * this method returns the launch of browser by given broswername
	 * @param browsername
	 * @return this method defines the driver
	 */
	
	public WebDriver init_broswer(String browsername) {
		
		switch (browsername) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\TINYCAMS\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\TINYCAMS\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			break;
		case "Micorsoft Edge":
			System.setProperty("webdriver.edge.driver", "C:\\Users\\TINYCAMS\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			break;
		default:
			System.out.println("Please pass the browser name");
			break;
		}
		return driver;
	}
	public void launchURL(String url) {
		driver.get(url);
	}
	public String getPagetitle() {
		return driver.getTitle();
	}
	public String PageURL() {
		return driver.getCurrentUrl();
	}
	public void closebrowser() {
		driver.close();
	}
	public void quitbrowser() {
		driver.quit();
	}
}
	

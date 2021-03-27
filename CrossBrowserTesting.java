package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowserTesting {

	public static void main(String[] args) {
		String browser = "safari";
		WebDriver driver = null;
		switch (browser) {
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
		driver.get("https://www.google.com/");
		String url =driver.getTitle();
		System.out.println(url);
		
		if(url.equals("Google")){
			System.out.println("Correct title");
		}
		else {
			System.out.println("Incorrect title");
		}
	    //driver.quit();
		

	}

}

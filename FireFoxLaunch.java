package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxLaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\TINYCAMS\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
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

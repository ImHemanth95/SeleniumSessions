package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TINYCAMS\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
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

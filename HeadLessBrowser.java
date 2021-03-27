package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessBrowser {

	public static void main(String[] args) {
		//Headless - do not show the browser
		//fast
		//no broswer display
		WebDriverManager.chromedriver().setup();
		//we need to create an options class of chrome as the objects to run headless
		ChromeOptions co = new ChromeOptions();
		//FirefoxOptions fo = new FirefoxOptions();
		//fo.addArguments("--headless");
		//after creating the objects then you need to call the method that is addArguments and pass the string value as headless
		co.addArguments("--incognito");
		//pass the references to this - co to chromdriver
		//WebDriver driver = new FirefoxDriver(fo);
		
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.google.com/");
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		

	}

}

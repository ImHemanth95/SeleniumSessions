package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcept {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/bonigarcia/webdrivermanager");
		System.out.println(driver.getCurrentUrl());
		//now navigate to diff url
		driver.navigate().to("https://www.google.com/");
	    System.out.println(driver.getCurrentUrl());
	    driver.navigate().back();
	    driver.navigate().forward();
	    driver.navigate().back();//github url now its in
	}

}

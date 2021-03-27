package SeleniumSession;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForElementsMethods {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.freshworks.com/");
		driver.manage().window().maximize();
		By footernav = By.cssSelector("ul.footer-nav li a");
		List<WebElement> footerlist = waitforVisiblityofEle(footernav,10);
		for(WebElement e:footerlist) {
			System.out.println(e.getText());
		}
		int count = getElementsTextList(footernav,10).size();
		System.out.println("This is the list of footer nav text found" + count);
		
		By img = By.tagName("a");
		int imagecount = waitforPresenceOfEle(img,10).size();
		System.out.println(imagecount);
	}
	
	/*
	 An expectation for checking that all elements present on the web page that match the locator are visible.
     Visibility means that the elements are not only displayed but also have a height and width that is greater than 0. 
	 */
	public static List<WebElement> waitforVisiblityofEle(By locator,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,10);
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	public static List<WebElement> waitforPresenceOfEle(By locator,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,10);
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
	}
	public static List<String> getElementsTextList(By locator,int timeout) {
		List<String> eletext = new ArrayList<String>();
		List<WebElement> elelist= waitforVisiblityofEle(locator,10);
		for(WebElement e:elelist) {
			if(!e.getText().isEmpty()) {
				eletext.add(e.getText());
			}
		}
		return eletext;
		
	}
	public static WebElement waitforElementTobeClickable(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	public static void clickWhenReady(By locator, int timeout) {
		waitforElementTobeClickable(locator,timeout).click();
	}

}

package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpiceJet_Actions_1 {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.getTitle();
		
    By Main = By.id("ctl00_HyperLinkLogin");
	By mem =By.xpath("//a[text()='SpiceClub Members']");
	By memLogin = By.xpath("(//a[text()='Member Login'])[2]");
		
	doMoveToElementByActions(Main);
	doMoveToElementByActions(mem);
	doActionsClick(memLogin);
	driver.quit();
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
    
	public static void doMoveToElementByActions(By element) {
		Actions act =new Actions(driver);
		act.moveToElement(getElement(element)).perform();
	}
//	public static void doMoveElementAndClickByActions(By element) {
//		Actions act =new Actions(driver);
//		act.moveToElement(getElement(element)).perform();
//		
//	}
	public static void doActionsClick(By element) {
		Actions act = new Actions(driver);
		act.click(getElement(element)).perform();
		
	}
}
		


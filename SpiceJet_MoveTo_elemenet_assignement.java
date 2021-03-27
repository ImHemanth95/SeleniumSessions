package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpiceJet_MoveTo_elemenet_assignement{
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException  {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.getTitle();
		Actions act  = new Actions(driver);
		WebElement ele = driver.findElement(By.id("ctl00_HyperLinkLogin"));
		act.moveToElement(ele).perform();
		Thread.sleep(3000);
		act.moveToElement(driver.findElement(By.xpath("//a[text()='SpiceClub Members']"))).perform();
		driver.findElement(By.xpath("(//a[text()='Member Login'])[2]")).click();
		driver.getCurrentUrl();
		driver.getTitle();
		driver.quit();
		
		//*[@id="smoothmenu1"]/ul/li[18]/ul/li  -- use this code to get the links of the login button and continue code
		}

		
		//Thread.sleep(3000);
		
		//SelectByLinkText(content,"COURSES");
		//SelectByLinkText(content,"ARTICLES");
//		doActionsMoveToElementAndClick(By.linkText("COURSES"));
//		
//		}
//	public static WebElement getElement(By locator) {
//		return driver.findElement(locator);
//	}
//	public static void doActionsMovetoele(By locator) {
//		Actions act  = new Actions(driver);
//		act.moveToElement(getElement(locator)).perform();
//	}
//	public static void doActionsMoveToElementAndClick(By locator) {
//		doActionsMovetoele(locator);
//		getElement(locator).click();
//	}
		
	}

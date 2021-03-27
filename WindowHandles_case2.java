package SeleniumSession;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles_case2 {
	static WebDriver driver;

	 public static String switchToWindowAndgetTitle(String windowId) {
			driver.switchTo().window(windowId);
			String title = driver.getTitle();
			return title;
			}
	public static Iterator<String> getAllOpenWindows() {
		Set<String> handles = driver.getWindowHandles();

		return handles.iterator();
	}

public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com");

	By linkedIn = By.xpath("//img[@alt='LinkedIn OrangeHRM group']");
	By faceBook = By.xpath("//img[@alt='OrangeHRM on Facebook']");
	By twitter = By.xpath("//img[@alt='OrangeHRM on twitter']");
	By youTube = By.xpath("//img[@alt='OrangeHRM on youtube']");
	By cookiesFaceBook = By.xpath("//button[@id='u_0_27_Ol']");
	
	driver.findElement(linkedIn).click();

	Iterator<String> it = getAllOpenWindows();

	String parentWindowId = it.next();
	System.out.println("parentWindow Id  : " + parentWindowId);

	String childWindowId = it.next();
	System.out.println("childWindow Id : " + childWindowId);
	
	switchToWindowAndgetTitle(childWindowId);
	driver.close();
	Thread.sleep(2000);
	
	switchToWindowAndgetTitle(parentWindowId);
	driver.findElement(twitter).click();
	
	it = getAllOpenWindows();
	parentWindowId = it.next();
	childWindowId = it.next();
	switchToWindowAndgetTitle(childWindowId);
	Thread.sleep(2000);
	driver.close();
	
	switchToWindowAndgetTitle(parentWindowId);
	driver.findElement(youTube).click();
	it = getAllOpenWindows();
	parentWindowId = it.next();
	childWindowId = it.next();
	switchToWindowAndgetTitle(childWindowId);
	Thread.sleep(2000);
	driver.close();
	
	switchToWindowAndgetTitle(parentWindowId);
	driver.findElement(faceBook).click();
	it = getAllOpenWindows();
	parentWindowId = it.next();
	childWindowId = it.next();
	switchToWindowAndgetTitle(childWindowId);
	Thread.sleep(2000);
	driver.close();
	switchToWindowAndgetTitle(parentWindowId);
	Thread.sleep(1000);
	driver.close();
		// TODO Auto-generated method stub

	}

}

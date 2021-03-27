package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WeDriverWait_concept_1 {
 static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/guest/home.do");
//		String title = driver.getTitle();
//		System.out.println(title);
		//title= KSRTC Official Website for Online Bus Ticket Booking - KSRTC.in
//        WebDriverWait wait = new WebDriverWait(driver,20);
//		wait.until(ExpectedConditions.titleIs("home"));
//		System.out.println(driver.getTitle());
		
	//	String title = waitForTitleContains(15,"Official");
		//System.out.println(title);
		//String title = waitForUrl(15,"home.do");
		//System.out.println(title);
		
		if(waitForUrl(15,"home.do")) {
			System.out.println("KSRTC website is present");
		}
		driver.findElement(By.xpath("//li/a[text()=' Sign In']")).click();
	}
	//exception for this method if its not equal then its "TimeOut Exception"
	//internal pooling will happen if ex if you have specified it to 15secs then by defualt it will check 15*500milliseconds until that is present
	//You can sepcify your own timeout things, that is new WeDriverWait(driver,timeout,200);//so 15*200millisecs now
	public static String waitForTitleContains(int timeout,String title) {
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.titleContains(title));
		//wait.until(ExpectedConditions.titleIs(title));
		return driver.getTitle();
	}
	public static boolean waitForUrl(int timeout,String url) {
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		return wait.until(ExpectedConditions.urlContains(url));
		
	}
}

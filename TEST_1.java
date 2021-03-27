package SeleniumSession;
import java.util.Set;
import java.util.*;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TEST_1 {
	
	static WebDriver driver;

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

		Set<String> handles = driver.getWindowHandles();

		Iterator<String> it = handles.iterator();

		String parentWindowId = it.next();
		System.out.println("parentWindow Id  : " + parentWindowId);

		String childWindowId = it.next();
		System.out.println("childWindow Id : " + childWindowId);

		

		driver.switchTo().window(childWindowId);
		System.out.println("childWindowId Title : " + driver.getTitle());
		driver.close();

		driver.switchTo().window(parentWindowId);
		System.out.println("parentWindowId Title " + driver.getTitle());
		System.out.println("parentWindowId current Url : " + driver.getCurrentUrl());

		driver.findElement(youTube).click();

		driver.switchTo().window(childWindowId);
		System.out.println("childWindowId Title : " + driver.getTitle());
		driver.close();

		driver.switchTo().window(parentWindowId);
		System.out.println("parentWindowId Title " + driver.getTitle());
		System.out.println("parentWindowId current Url : " + driver.getCurrentUrl());

		driver.findElement(twitter).click();

		driver.switchTo().window(childWindowId);
		System.out.println("childWindowId Title : " + driver.getTitle());
		driver.close();

		driver.switchTo().window(parentWindowId);
		System.out.println("parentWindowId Title " + driver.getTitle());
		System.out.println("parentWindowId current Url : " + driver.getCurrentUrl());
	}
}



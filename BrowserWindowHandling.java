package SeleniumSession;

import java.util.Set;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");//parent page
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();//child page
		//by the time we click the linkdein button it opens the new window or new tab or tab
		//there will be two windows that is parent and child window
		// we need to use this - window handler API to perform the actions
		Set<String> handles =driver.getWindowHandles();// this provides us the unique values to get identified
	    Iterator<String> IR = handles.iterator();//to iterate to the elemnts that are not in order based
	    String parentwindowID= IR.next();
	    System.out.println("This is you parent windowID="+parentwindowID);
	    String childwindowID = IR.next();
	    System.out.println("This is your child windowID="+childwindowID);
	    driver.switchTo().window(childwindowID);//the IR.next will pass the parent ID to switch to new window andn this switch the new window(child)
	    System.out.println("Child window url:"+ driver.getCurrentUrl());
	    // we need to use this close bcause we will close one window/ but if we use quit it will quit every window and will close everything
	    driver.close();
	    //now we need to switch to the new window tht is parent window after you closing the child window
	    driver.switchTo().window(parentwindowID);//now the driver is available in the parent window
	    String geturl =driver.getCurrentUrl();
	    System.out.println("Your current URL is="+geturl);
	    String getTitle = driver.getTitle();
	    System.out.println("Your current title of the page is="+getTitle);
	    }

}

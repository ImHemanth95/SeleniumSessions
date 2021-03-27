package SeleniumSession;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles_ListWise {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");//parent page
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");//parent page
		WebElement ch1=  driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']"));//1st child
     	WebElement ch2=  driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']"));//2nd child page
     	WebElement ch3 =driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']"));//3rd child page
     	WebElement ch4 = driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']"));//3rd child page
		
		//CASE1: All window open and close by switch
		Set<String> handles = driver.getWindowHandles();
		//set collection to array
		List<String> handlelist = new ArrayList<String>(handles);//pass the set to the array list as we need to solve it by the index wise
		String parentWindowID = handlelist.get(0);
	    String childWindowID1 = handlelist.get(1);
	    String childWindowID2 = handlelist.get(2);
	    String childWindowID3 = handlelist.get(3);
	    String childWindowID4 = handlelist.get(4);
	   
	    
	    //now switching back from parent window to child window as it launches the new window
	    ch1.click();//1st child
	    driver.switchTo().window(childWindowID1);
	    System.out.println("This is 1st child window="+driver.getCurrentUrl());//now getting the current url
	    //now close the child browswer
	    driver.close();//now the driver contrl will be with the child window so we are closing this broswer
	    
	    //after you close the browser now we are getting the control of the driver to the parent window by switching
	    //child 2
	    ch2.click();//2nd child page
	    driver.switchTo().window(childWindowID2);
	    System.out.println(driver.getTitle());
	    System.out.println("This is 2nd child window="+driver.getCurrentUrl());
	    driver.close();
	    
	    //child 3
	    ch3.click();
	    driver.switchTo().window(childWindowID3);
	    System.out.println("This is 3rd child window="+driver.getCurrentUrl());
	    driver.close();
	    
	    //child 4
	    ch4.click();
	    driver.switchTo().window(childWindowID4);
	    System.out.println("This is 4th child window="+driver.getCurrentUrl());
	    System.out.println(driver.getTitle());
	    driver.close();
	    
	    //switch to main window
	    driver.switchTo().window(parentWindowID);
	    System.out.println(driver.getTitle());
	    System.out.println("This is parent window or default window="+driver.getCurrentUrl());
	    driver.quit();
	    }

}

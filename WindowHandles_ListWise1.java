package SeleniumSession;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles_ListWise1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");//parent page
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();//1st child
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();//2nd child page
	    driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();//3rd child page
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();//3rd child page
		
		Set<String> handles = driver.getWindowHandles();
		//set collection to array
		List<String> handlelist = new ArrayList<String>(handles);//pass the set to the array list as we need to solve it by the index wise
		String parentWindowID = handlelist.get(0);
	    String childWindowID1 = handlelist.get(1);
	    String childWindowID2 = handlelist.get(2);
	    String childWindowID3 = handlelist.get(3);
	    String childWindowID4 = handlelist.get(4);
	    //child window -1
	    driver.switchTo().window(childWindowID1);
	    System.out.println("This is 1st child window="+driver.getCurrentUrl());
	    System.out.println(driver.getTitle());
	    driver.close();
	   
	    //child window - 2
	    driver.switchTo().window(childWindowID2);
	    System.out.println("This is 2nd child window="+driver.getCurrentUrl());
	    System.out.println(driver.getTitle());
	    driver.close();
	    
	    
	    //child window -3 
	    driver.switchTo().window(childWindowID3);
	    System.out.println("This is 3rd child window="+driver.getCurrentUrl());
	    System.out.println(driver.getTitle());
	    driver.close();
	    
	  
	    //child window -4
	    driver.switchTo().window(childWindowID4);
	    System.out.println("This is 4th child window="+driver.getCurrentUrl());
	    System.out.println(driver.getTitle());
	    driver.close();
	    
	    //now the parent window
	    driver.switchTo().window(parentWindowID);
	    System.out.println("This is your parent window="+driver.getCurrentUrl());
	    System.out.println(driver.getTitle());
	    driver.quit();
	    }

}

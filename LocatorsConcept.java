package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register");
//before we interact with the page we need to follow number of steps
//1.Create the webelement + then perform the actions(click,check,sendkeys,get text,isdisplayed)
//id is static method, we are using the that as args, and this are called as locators
		//driver.findElement(By.id("input-firstname")).sendKeys("Hemanth");
		//driver.findElement(By.id("input-lastname")).sendKeys("Kumar");
		//driver.findElement(By.id("input-email")).sendKeys("hemanthUI@gmail.com");
		//driver.findElement(By.id("input-telephone")).sendKeys("22020202");
		//driver.findElement(By.id("input-password")).sendKeys("Testme2021");
		//driver.findElement(By.id("input-confirm")).sendKeys("Testme2021");
		//driver.findElement(By.name("agree")).click();
		//driver.findElement(By.xpath("//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[2]")).click();
		
//2nd---- approach of accessing the webelement
//WebElement firstname = driver.findElement(By.id("input-firstname"));
//firstname.sendKeys("Hemanth");
		
//3rd -- approach
//by is a class and it gives the static approach and takes the args
//By firstname = By.id("input-firstname");
//By lastname = By.id("input-lastname");
//driver.findElement(firstname).sendKeys("TEST");
		
//4th --- approach
//		By firstname = By.id("input-firstname"); -- maintain the by locators 
//		WebElement first_name = driver.findElement(firstname);//
//		first_name.sendKeys("TEST");
		
		//5th---approach
		By firstname = By.id("input-firstname");
		By lastname = By.id("input-lastname");
		By emailID = By.id("input-email");
		By Tele = By.id("input-telephone");
		By Password = By.id("input-password");
		By confirm = By.id("input-confirm");
		
		
//		getElement(firstname, "testdata");//locators and values
//		getElement(lastname, "test1");
		driver.manage().window().maximize();
		
		doSendkeys(firstname, "Hemanth");
		doSendkeys(lastname, "Kumar");
		doSendkeys(emailID, "hemanthIU@gmail.com");
		doSendkeys(Tele, "789988");
		doSendkeys(Password, "Hemu4545");
		doSendkeys(confirm, "Hemu4545");
		WebElement agree = driver.findElement(By.name("agree"));
		agree.click();
		WebElement submit = driver.findElement(By.xpath("//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[2]"));
		submit.click();
		
}
////5th --- approach -- generic method
//	public static void getElement(By locator,String value) {//making it to static as we dont want to create an object every time
//		driver.findElement(locator).sendKeys(value);
//	}
//6th approach
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);//its returning the webelement
	}
	public static void doSendkeys(By locator,String value) {
		getElement(locator).sendKeys(value);
}

	
}

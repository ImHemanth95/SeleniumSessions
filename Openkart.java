package SeleniumSession;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Openkart {
public static void main(String[] args) {
		//step1 : use the class browser unit for browser activity
		BrowserDriverUnit BR =  new BrowserDriverUnit();
		WebDriver driver = BR.init_broswer("chrome");
		BR.launchURL("https://demo.opencart.com/index.php?route=account/register");
		//Step2: Maintain the webelements that you find
		By firstname = By.id("input-firstname");
		By lastname = By.id("input-lastname");
		By emailID = By.id("input-email");
		By Tele = By.id("input-telephone");
		By Password = By.id("input-password");
		By confirm = By.id("input-confirm");
		//Step 3: Using the element class generic methods you will perform actions
		ElementUtil  ELE = new ElementUtil(driver);//pass the driver that you have got from the broserunit
		ELE.doSendkeys(firstname, "Hemanth");
		ELE.doSendkeys(lastname, "Kumar");
		ELE.doSendkeys(emailID, "hemanthII@gmail.com");
		ELE.doSendkeys(Tele, "1232323");
		ELE.doSendkeys(Password, "TEST@4545");
		ELE.doSendkeys(confirm, "TEST@4545");
		//Step 4: Elements for clicking the checkbox and submitting / get the title / close the broswer using browser class
		WebElement agree = driver.findElement(By.name("agree"));
		agree.click();
		WebElement submit = driver.findElement(By.xpath("//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[2]"));
		submit.click();
		String Title = BR.getPagetitle();
		System.out.println(Title);
		BR.closebrowser();
		}}

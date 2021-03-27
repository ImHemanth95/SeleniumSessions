package SeleniumSession;

import java.util.List;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonLink_1 {
	static WebDriver driver;

  public static void main(String[] args) {
	  WebDriverManager.chromedriver().setup();
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.amazon.in/");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     // driver.get("https://www.amazon.in/");
    List<WebElement> l = driver.findElements(By.xpath("//div[@class='navFooterVerticalRow navAccessibility']//a"));
    for (WebElement e : l) {
      System.out.println(e.getText());
      if (e.getText().contains("Instagram")) {
        System.out.println("Inside If condition");
        e.click();
        break;
      }
    }
  }
}




////*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li
// //*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li
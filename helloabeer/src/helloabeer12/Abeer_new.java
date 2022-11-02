package helloabeer12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abeer_new {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\my new driver\\chromedriver_win32//chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
	    driver.get("https://www.booking.com");
	  Thread.sleep(3000);
	  
	  
	
	  WebElement abeer= driver.findElement(By.id("ss"));

	  driver.findElement(By.id("ss")).sendKeys("amman");
     Thread.sleep(1000);
     abeer.sendKeys(Keys.ARROW_DOWN);
     Thread.sleep(2000);
    abeer.submit();

//     driver.findElement(By.id("ss")).sendKeys(Keys.RETURN);
	}

}

package testselenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.sun.jna.platform.mac.Carbon.EventHotKeyID.ByValue;

import org.openqa.selenium.chrome.ChromeDriver;

public class Myclass {

 public static void main(String[] args) {
	 //System.setProperty("webdriver.firefox.marionette","/Users/srikanthvrns/Documents/geckodriver");
	 System.setProperty("webdriver.chrome.driver", "/Users/srikanthvrns/Documents/chromedriver"); 
	 WebDriver driver = new ChromeDriver();
  
	 driver.get("https://goo.gl/forms/DXXzjuPvi695hZGg1");
	 
	 driver.manage().window().maximize();
  

	 driver.findElement(By.name("entry.1456069782")).sendKeys("HareRam"); //username	
	 driver.findElement(By.name("entry.1565420787")).sendKeys("HareRam@yomail.com"); //email
	 driver.findElement(By.name("entry.1841232065")).sendKeys("hariom"); //phone Number
	
	 driver.findElement(By.className("freebirdFormviewerViewNavigationButtons")).click(); //next button on first page
	
	 Set<String> set1=driver.getWindowHandles();
	 Iterator<String> win1=set1.iterator();
	
	 String child=win1.next();
	
	 driver.switchTo().window(child);
	 
	 driver.findElement(By.name("entry.2084856316")).sendKeys("1234567890");
	 driver.findElement(By.name("entry.1339122660")).click();
	 driver.findElement(By.cssSelector("div[jsname='MPu53c']")).click();
	 
	 
 }
}
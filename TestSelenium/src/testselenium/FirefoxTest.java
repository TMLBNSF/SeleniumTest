package testselenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.MarionetteDriver;

public class FirefoxTest {


 @SuppressWarnings("deprecation")
@Test
public void testFirefox() throws InterruptedException {

	System.setProperty("webdriver.gecko.driver", "/Users/srikanthvrns/Documents/geckodriver");
	MarionetteDriver driver = new MarionetteDriver();

	//System.setProperty("webdriver.chrome.driver", "/Users/srikanthvrns/Documents/chromedriver"); 
	//WebDriver driver = new ChromeDriver();
  
	driver.get("https://accounts.google.com/ServiceLogin?continue=https%3A%2F%2Faccounts.google.com%2FManageAccount&dsh=6105850914390702115#identifier");
	
	driver.findElement(By.id("Email")).sendKeys("rahulbnsf@gmail.com");
	driver.findElement(By.name("signIn")).click();
	 
	 Thread.sleep(300);
	 driver.findElement(By.id("Passwd")).sendKeys("MySel@123");
	 driver.findElement(By.id("signIn")).click();
	 
	 Thread.sleep(1000);
	 //Check if Logged In successfully
	 if(driver.findElement(By.cssSelector("div[class='Ll1RQb']")).getText().equals("Welcome, rahul suresh"))
		{
		driver.navigate().to("https://goo.gl/forms/DXXzjuPvi695hZGg1");	
		}
	 
	
	// driver.get("https://goo.gl/forms/DXXzjuPvi695hZGg1");
	 
	 driver.manage().window().maximize();
	
	 //1st page

	 driver.findElement(By.name("entry.1456069782")).sendKeys("Tarun"); //username	
	 driver.findElement(By.name("entry.1565420787")).sendKeys("Elon@yomail.com"); //email
	 Thread.sleep(100);
	 //Date
		 driver.findElement(By.xpath(".//*[@id='mG61Hd']/div/div[2]/div[2]/div[3]/div[2]/div/div[1]/div/div[2]/div[1]/div/div[1]/input")).sendKeys("1");
		 driver.findElement(By.xpath(".//*[@id='mG61Hd']/div/div[2]/div[2]/div[3]/div[2]/div/div[3]/div/div[2]/div[1]/div/div[1]/input")).sendKeys("6");
		 driver.findElement(By.xpath(".//*[@id='mG61Hd']/div/div[2]/div[2]/div[3]/div[2]/div/div[5]/div/div[2]/div[1]/div/div[1]/input")).clear();
		 driver.findElement(By.xpath(".//*[@id='mG61Hd']/div/div[2]/div[2]/div[3]/div[2]/div/div[5]/div/div[2]/div[1]/div/div[1]/input")).sendKeys("2021");

	 //Password
	 driver.findElement(By.name("entry.1841232065")).sendKeys("9869449292"); 
	 
	 driver.findElement(By.cssSelector("input[aria-label='firstname']")).sendKeys("jagdish");
	 driver.findElement(By.cssSelector("input[aria-label='lastname']")).sendKeys("wankde");
	 
	 //address
	 driver.findElement(By.name("entry.1254820097")).sendKeys("Plano Dallas TX");
	 
	 //phone number
	 driver.findElement(By.name("entry.1506862664")).sendKeys("9120450189");
	
	 driver.findElement(By.className("freebirdFormviewerViewNavigationButtons")).click(); //next button on first page
	
	 // 2nd Page
	 
	 Set<String> set1=driver.getWindowHandles();
	 Iterator<String> win1=set1.iterator();
	
	 String child=win1.next();
	
	 driver.switchTo().window(child);
	 
	 Thread.sleep(500);
	 
	//Comments
	 driver.findElement(By.cssSelector("textarea[jsname='YPqjbf']")).sendKeys("Please put your Comments here");
	  
	 //Income
	 driver.findElement(By.cssSelector("div[data-value='$60000-$80000']")).click();
	 
	 //DropDown Fix Using Xpath
	 driver.findElement(By.xpath(".//*[@id='mG61Hd']/div/div[2]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]")).click();
	 driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	 driver.findElement(By.xpath(".//*[@id='mG61Hd']/div/div[2]/div[2]/div[3]/div[2]/div[2]/div[6]")).click();
	 Thread.sleep(500);
	 
	 //Age
	 driver.findElement(By.cssSelector("div[aria-label='18-25']")).click();
	 
	 //Fav color
	 driver.findElement(By.cssSelector("div[aria-label='Blue']")).click();
     
	 //Rating
	 driver.findElement(By.cssSelector("div[ aria-posinset='7']")).click();
     
	 //Time in hours
	 driver.findElement(By.xpath(".//*[@id='mG61Hd']/div/div[2]/div[2]/div[8]/div[2]/div[1]/div[2]/div[1]/div/div[1]/input")).sendKeys("12");
     
	 //Time in minutes
	 driver.findElement(By.xpath(".//*[@id='mG61Hd']/div/div[2]/div[2]/div[8]/div[2]/div[3]/div/div[1]/div/div[1]/input")).sendKeys("30");

	 //Next Button
     driver.findElement(By.cssSelector("div[jsname='OCpkoe']")).click();
     
     //3rd Page
     
     String parentWindowHandler1 = driver.getWindowHandle(); 
	 Set<String> set3=driver.getWindowHandles();
	 Iterator<String> win3=set3.iterator();
	
	 String child3=win3.next();
	
	 driver.switchTo().window(child3);
	 
	 //Credit Card Number
	 driver.findElement(By.name("entry.216505432")).sendKeys("72775439103456");
	 
	 //Credit Card Name
	 driver.findElement(By.name("entry.952063220")).sendKeys("Jagdish Wankde");
	 
	 //Date
	 driver.findElement(By.xpath(".//*[@id='mG61Hd']/div/div[2]/div[2]/div[5]/div[2]/div/div[3]/div/div[2]/div[1]/div/div[1]/input")).sendKeys("6");
	 driver.findElement(By.xpath(".//*[@id='mG61Hd']/div/div[2]/div[2]/div[5]/div[2]/div/div[1]/div/div[2]/div[1]/div/div[1]/input")).sendKeys("10");
	 driver.findElement(By.xpath(".//*[@id='mG61Hd']/div/div[2]/div[2]/div[5]/div[2]/div/div[5]/div/div[2]/div[1]/div/div[1]/input")).click();
	 driver.findElement(By.xpath(".//*[@id='mG61Hd']/div/div[2]/div[2]/div[5]/div[2]/div/div[5]/div/div[2]/div[1]/div/div[1]/input")).sendKeys("2022");
	 
	 
	 //Submit
	 driver.findElement(By.cssSelector("div[jsname='M2UYVd']")).submit();
	 
 }
}
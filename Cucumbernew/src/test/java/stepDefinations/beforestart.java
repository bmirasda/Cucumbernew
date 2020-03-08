package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class beforestart 
{
	public static void main(String args[]) 
    { 
          
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\PARTH\\Desktop\\CucumberFramework\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.universalfinancials.com/mytax/login.php");
	driver.manage().window().maximize();
	
	
	driver.findElement(By.id("clientloginform-username")).sendKeys("bhushan.mirasdar@gmail.com");
	driver.findElement(By.id("clientloginform-password")).sendKeys("India*123");
	driver.findElement(By.name("login")).click();
	
	
	String s = driver.getTitle();
	System.out.println(s);
	System.out.println("User is on Universal financial login page");
    }
	
}


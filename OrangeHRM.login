package LINKANKI;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {

	public static void main(String[] args) throws InterruptedException{

		System.setProperty("webdriver.chrome.driver","F:\\browserdrivers\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.get("https://www.google.com/");
			
			driver.findElement(By.xpath("//textarea[@id=\"APjFqb\"]")).sendKeys("OrangeHRM",Keys.ENTER);
			
			driver.findElement(By.xpath("(//h3[text()=\"OrangeHRM\"])[1]")).click();
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("Admin", Keys.ENTER);
			
			driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123",Keys.ENTER);
			
			driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
			
			
	}

}

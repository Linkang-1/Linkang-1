package INTERVIEW;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SwagLabs {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F://browserdrivers//chromedriver_win32//chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.saucedemo.com/");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");

		driver.findElement(By.xpath("//input[@id='login-button']")).click();


		String actualTitle = driver.getTitle(); //To get title of page

		String expectedTitle = "Swag Labs";  //Actual text visible on webpage

		if (actualTitle.equals(expectedTitle)) {  //If else ststement use to validate condtion

			System.out.println("pass: User on Swag Labs page");
		}

		else {

			System.out.println("fail: User is not on Swag Labs page");
		}


		WebElement addtocart1=driver.findElement(By.xpath("//button[@id=\"add-to-cart-sauce-labs-backpack\"]"));
		addtocart1.click();

		Thread.sleep(2000);

		WebElement remove1=driver.findElement(By.xpath("//button[@id=\"remove-sauce-labs-backpack\"]"));
		remove1.click();

		WebElement addtocart2=driver.findElement(By.xpath("//button[@id=\"add-to-cart-sauce-labs-bike-light\"]"));
		addtocart2.click();

		Thread.sleep(2000);

		WebElement remove2=driver.findElement(By.xpath("//button[@id=\"remove-sauce-labs-bike-light\"]"));
		remove2.click();


		WebElement addtocart3=driver.findElement(By.xpath("//button[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]"));
		addtocart3.click();

		Thread.sleep(2000);

		WebElement remove3=driver.findElement(By.xpath("//button[@id=\"remove-sauce-labs-bolt-t-shirt\"]"));
		remove3.click();


		WebElement addtocart4=driver.findElement(By.xpath("//button[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]"));
		addtocart4.click();

		Thread.sleep(2000);

		WebElement remove4=driver.findElement(By.xpath("//button[@id=\"remove-sauce-labs-fleece-jacket\"]"));
		remove4.click();


		WebElement addtocart5=driver.findElement(By.xpath("//button[@id=\"add-to-cart-sauce-labs-onesie\"]"));
		addtocart5.click();

		Thread.sleep(2000);

		WebElement remove5=driver.findElement(By.xpath("//button[@id=\"remove-sauce-labs-onesie\"]"));
		remove5.click();

		WebElement addtocart6=driver.findElement(By.xpath("//button[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]"));
		addtocart6.click();

		Thread.sleep(2000);

		WebElement remove6=driver.findElement(By.xpath("//button[@id=\"remove-test.allthethings()-t-shirt-(red)\"]"));
		remove6.click();

		WebElement selectdropdown1=driver.findElement(By.xpath("//select[@class=\"product_sort_container\"]"));
		Select s1=new Select(selectdropdown1);
		s1.selectByVisibleText("Price (low to high)");

		WebElement lowtohigh=driver.findElement(By.xpath("//button[@id=\"add-to-cart-sauce-labs-onesie\"]"));
		lowtohigh.click();

		Thread.sleep(2000);

		WebElement removelowtohigh=driver.findElement(By.xpath("//button[@id=\"remove-sauce-labs-onesie\"]"));
		removelowtohigh.click();

		WebElement selectdropdown2=driver.findElement(By.xpath("//select[@class=\"product_sort_container\"]"));
		Select s2=new Select(selectdropdown2);
		s2.selectByVisibleText("Price (high to low)");

		WebElement hightolow=driver.findElement(By.xpath("//button[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]"));
		hightolow.click();

		Thread.sleep(2000);

		WebElement removehightolow=driver.findElement(By.xpath("//button[@id=\"remove-sauce-labs-fleece-jacket\"]"));
		removehightolow.click();


		Thread.sleep(3000);

		driver.close();


	}
}

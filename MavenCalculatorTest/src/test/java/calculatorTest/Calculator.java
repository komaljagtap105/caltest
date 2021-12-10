package calculatorTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Calculator {

	WebDriver driver;

	@BeforeMethod
	public void Setup() {

		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\Komal\\Desktop\\eclipse\\Automation-Repo\\MavenCalculatorTest\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.calculator.net/");
	}

	@Test(priority = 1)
	public void multiplication() throws InterruptedException {
	 driver.findElement(By.xpath("//span[contains(text(),'4')]")).click();
		  
	
	  
	   driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();
	   driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();
	    driver.findElement(By.xpath("//span[contains(text(),'×')]")).click();
	    driver.findElement(By.xpath("//span[contains(text(),'5')]")).click();
	    driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();
	    driver.findElement(By.xpath("//span[contains(text(),'5')]")).click();
	    driver.findElement(By.xpath("//span[contains(text(),'=')]")).click();
	    
		    Thread.sleep(2000);
		String s = driver.findElement(By.xpath(" //div[@id='sciOutPut']")).getText();
		s = s.replaceAll("\\s", "");
		int num = Integer.parseInt(s);
		Assert.assertEquals(222075, num);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException ie) {

		}

	}

	@Test(priority = 2)
	public void Division() throws InterruptedException {
		
		
		driver.findElement(By.xpath("//span[contains(text(),'4')]")).click();
		
		   driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
		   driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
		   driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
		   driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[4]")).click();
		   driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		   driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
		   driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
		   driver.findElement(By.xpath("//span[contains(text(),'=')]")).click();
		     Thread.sleep(2000);
		String s = driver.findElement(By.xpath(" //div[@id='sciOutPut']")).getText();
		s = s.replaceAll("\\s", "");
		int num = Integer.parseInt(s);
		Assert.assertEquals(20, num);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException ie) {

		}

	}

	@Test(priority = 3)
	public void Addition() throws InterruptedException {
		 driver.findElement(By.xpath("//span[contains(text(),'–')]")).click();
		 driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		 driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();
		 driver.findElement(By.xpath("//span[contains(text(),'4')]")).click();
		 driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		 driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();
		 driver.findElement(By.xpath("//span[contains(text(),'4')]")).click();
		 driver.findElement(By.xpath(" //tbody/tr[2]/td[2]/div[1]/div[1]/span[4]")).click();
		 driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();
		 driver.findElement(By.xpath("//span[contains(text(),'4')]")).click();
		 driver.findElement(By.xpath("//span[contains(text(),'5')]")).click();
		 driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();
		 driver.findElement(By.xpath("//span[contains(text(),'4')]")).click();
		 driver.findElement(By.xpath("//span[contains(text(),'5')]")).click();
		 driver.findElement(By.xpath("//span[contains(text(),'=')]")).click();
		 Thread.sleep(2000);
		String s = driver.findElement(By.xpath(" //div[@id='sciOutPut']")).getText();
		s = s.replaceAll("\\s", "");
		int num = Integer.parseInt(s);
		Assert.assertEquals(111111, num);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException ie) {

		}
	}

	@Test(priority = 4)
	public void subtraction() {
		driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		   driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();
		   driver.findElement(By.xpath("//span[contains(text(),'4')]")).click();
	driver.findElement(By.xpath("//span[contains(text(),'8')]")).click();
		   driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		   driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();
		   driver.findElement(By.xpath("//span[contains(text(),'–')]")).click();
		   driver.findElement(By.xpath("//span[contains(text(),'–')]")).click();
		   driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		   driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();
		   driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
		   driver.findElement(By.xpath("//span[contains(text(),'9')]")).click();
		   driver. findElement(By.xpath("//span[contains(text(),'4')]")).click();
		   driver.findElement(By.xpath("//span[contains(text(),'8')]")).click();
		   driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		   driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();
		   driver.findElement(By.xpath("//span[contains(text(),'=')]")).click();

		String s = driver.findElement(By.xpath(" //div[@id='sciOutPut']")).getText();
		s = s.replaceAll("\\s", "");
		int num = Integer.parseInt(s);
		Assert.assertEquals(23329646, num);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException ie) {

		}

	}

	@AfterMethod
	public void tearDown() {
		driver.close();

	}

}

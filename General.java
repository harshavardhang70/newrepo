package utility;


import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import utility.Log;
import utility.Global;


public class General extends Global {

	
	public static void openapplication() {
		System.setProperty("webdriver.edge.driver", "C:\\selenium\\edgedriver_win32\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("https://www.amazon.in/your-account");
		
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		Log.info("application opened");
		
	}

public void mouseover() throws Exception {
		
		
		System.setProperty("webdriver.edge.driver", "C:\\selenium\\edgedriver_win32\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get(url);
		
		assertTrue(driver.getTitle().matches("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"));
		
		driver.manage().window().maximize();
		Thread.sleep(1500);	Thread.sleep(1500);	Thread.sleep(1500);	
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys(un);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys(password);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button/span")).click();

	
	Log.info("login done");
	
	
}


public void dropdown() throws Exception {
	
	driver.get("https://www.amazon.in/your-account");
	
	//assertTrue(driver.getTitle().matches("Your Account"));
	
Select dropdown = new Select(driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[1]/div/div/select")));
	
	dropdown.selectByVisibleText("Car & Motorbike");
	Thread.sleep(1500);

	
	dropdown.selectByVisibleText("Health & Personal Care");
	dropdown.selectByVisibleText("Home & Kitchen");
	dropdown.selectByVisibleText("Music");
	dropdown.selectByVisibleText("Amazon Devices");
	
	driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input")).sendKeys("alexa");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[3]/div/span/input")).click();
	Thread.sleep(1500);

	
}


public void checkbox() throws Exception {
	
	
	driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[2]/div/div[3]/span/div/span/div/div/div[2]/ul/li/span/a/div/label/i")).click();
	Thread.sleep(1500);	
}




	
}

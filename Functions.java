package pom_framework;

import org.openqa.selenium.edge.EdgeDriver;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import static org.testng.Assert.assertTrue;
import org.testng.Assert;

public class Functions {

	
	public static WebDriver driver;

	
	
	
	
	public static void openapplication() {
		System.setProperty("webdriver.edge.driver", "C:\\selenium\\edgedriver_win32\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("https://www.amazon.in/your-account");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		assertTrue(driver.getTitle().matches("Your Account"));
		
		
	}

	public void dropdown() throws Exception {
		
		driver.get("https://www.amazon.in/your-account");
		
		assertTrue(driver.getTitle().matches("Your Account"));
		
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
	
	
public void mouseover() throws Exception {
		
		
		System.setProperty("webdriver.edge.driver", "C:\\selenium\\edgedriver_win32\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		
		assertTrue(driver.getTitle().matches("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"));
		
		driver.manage().window().maximize();
		Thread.sleep(1500);	Thread.sleep(1500);	Thread.sleep(1500);	
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("7032394341");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("wrong password");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button/span")).click();
		Thread.sleep(1500);
		Thread.sleep(1500);Thread.sleep(1500);Thread.sleep(1500);

	/*	WebElement Fashion = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[4]/a/div[1]/div/img"));
		
		Actions action =new Actions(driver);
		action.moveToElement(Fashion).perform();
		Thread.sleep(1500);
		
		WebElement Electronics = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[5]/a/div[1]/div/img"));
		action.moveToElement(Electronics).perform();
		Thread.sleep(1500);
		WebElement Home = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[6]/a/div[1]/div/img"));
		action.moveToElement(Home).perform();
		Thread.sleep(1500);
		WebElement Appliences = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[7]/a/div[1]/div/img"));
		action.moveToElement(Appliences).perform();
		Thread.sleep(1500);
		WebElement Toys = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[9]/a/div[1]/div/img"));
		action.moveToElement(Toys).perform();
		Thread.sleep(1500);
		*/
		Actions action =new Actions(driver);
		//action.moveToElement(Fashion).perform();
		Thread.sleep(1500);
		WebElement myaccount = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[3]/div/div/div/div"));
		action.moveToElement(myaccount).perform();
		
		Thread.sleep(1500);
		
	/*	WebElement Toys1 = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[9]/a/div[1]/div/img"));
		
		
		
		WebElement element = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[4]/a/div[1]/div/img"));
		JavascriptExecutor executer = (JavascriptExecutor)driver;
		System.out.println("java script");
		
		
		
		String javaScript = "var evObj = document.createEvent('MouseEvents');" +
					"evObj.initMouseEvent(\"mouseover\",true, false, window, 0, 0, 0, 0, 0, false, false, false, false, 0, null);" +
						"arguments[0].dispatchEvent(evObj);";


((JavascriptExecutor)driver).executeScript(javaScript, element);
((JavascriptExecutor)driver).executeScript(javaScript, Toys1);
		*/
//driver.close();
		
		
	
	
}
	
	
public void excel() throws BiffException, Exception {
	
	FileInputStream f = new FileInputStream("C:\\Users\\HarshaVardhanGanguru\\Downloads\\Book 2.xlsx");
	Workbook w = Workbook.getWorkbook(f);
	Sheet s= w.getSheet("Sheet1");
	System.out.println(s.getName());
	
	String username = s.getCell(0,1).getContents();
	String password = s.getCell(0,2).getContents();
	System.out.println(username);
	System.out.println(password);
	
	
	System.setProperty("webdriver.edge.driver", "C:\\selenium\\edgedriver_win32\\msedgedriver.exe");
	driver = new EdgeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	Thread.sleep(1500);	Thread.sleep(1500);	Thread.sleep(1500);	
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys(username);
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys(password);
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button/span")).click();
	Thread.sleep(1500);
	
}

public void excelwrite() throws Exception {
	FileInputStream f = new FileInputStream("C:\\Users\\HarshaVardhanGanguru\\Downloads\\Book 2.xlsx");
	XSSFWorkbook w = new XSSFWorkbook(f);
	XSSFSheet s= w.getSheet("Sheet1");
	System.out.println(s.getSheetName());
	
	
	XSSFCell cell = s.getRow(3).getCell(2);
	cell.setCellValue("VIPER");
	f.close();
}


	
}	
	

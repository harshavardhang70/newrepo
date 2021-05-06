package harsha;

import org.openqa.selenium.WebDriver;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;


import java.io.FileInputStream;
import java.io.FileNotFoundException;

import jxl.*;



public class excelwithtestng {
	
	
	WebDriver driver;
	
	
	
	
	@BeforeSuite
	public void excel() throws Exception {
	FileInputStream f = new FileInputStream("C:\\Users\\HarshaVardhanGanguru\\Downloads\\Book 2.xlsx");
	Workbook w = Workbook.getWorkbook(f);
	Sheet s= w.getSheet("Sheet1");
	
	String username = s.getCell(1, 1).getContents();
	String password = s.getCell(1, 2).getContents();
		
		System.out.println("excel opening");
		
	}
	
	@BeforeMethod
	public void browser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HarshaVardhanGanguru\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
	}
	
	
	
	
@AfterMethod	
public void closebrowser() {
	
driver.close();


}
	
	@Test(priority=1)
	public void login() throws Exception {
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();	
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("7032394341");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("wrong password");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button/span")).click();
		Thread.sleep(1500);
			
	}
	
	
	
	@Test(priority=2)
	public void cart() throws Exception {
		
		
		driver.get("https://www.google.co.in/");
		Thread.sleep(1500);
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();	
		Thread.sleep(1500);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("7032394341");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("wrong password");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button/span")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[5]/div/div/a/span")).click();
		
		Thread.sleep(1500);Thread.sleep(1500);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	}
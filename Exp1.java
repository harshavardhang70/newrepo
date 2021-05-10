package second;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;


public class Exp1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HarshaVardhanGanguru\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		
		
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(1500);

		
		
		
		
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[5]/div[2]/div/div/a[7]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[1]/ul/li[2]/span/a/span")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div/div[2]/ul/span[2]/li/span/div/a/div[1]/div")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[1]/ul/li[4]/span/a/span")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[1]/ul/li[4]/span/a/span")).click();
		
				
		
		System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[1]/div/span[3]/div[2]/div[1]/div/span/div/div/div/div/div[2]/h2/a/span")).getText());
		
		
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[1]/div/span[3]/div[2]/div[1]/div/span/div/div/div/div/div[2]/h2/a/span")).click();
		
		ArrayList<String> al = new ArrayList<String>(driver.getWindowHandles());
		Thread.sleep(1500);
		
		for (int i = 0; i < al.size(); i++)
	          System.out.println(al.get(i) + " ");
			Thread.sleep(1500);
			
			driver.switchTo().window(al.get(1));
			
			System.out.println(driver.getTitle());
			Thread.sleep(1500);Thread.sleep(1500);
			
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[4]/div[4]/div[1]/div[3]/div/div/div/form/div/div/div/div/div[2]/div/div[34]/div/div/span/span/input")).click();
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[4]/div[4]/div[1]/div[3]/div/div/div/form/div/div/div/div/div[5]/div[1]/div[1]/span/span/a")).click();
		
		
		


			
			
			driver.get("https://www.flipkart.com/");
			
			Thread.sleep(1500);
		
			driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("7032394341");
			driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("wrong password");
			driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")).click();
			Thread.sleep(1500);
	
			
			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys("prince of persia sands of time");
			Thread.sleep(1500);
			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div[2]/form/div/button")).click();
			Thread.sleep(1500);
			
			driver.findElement(By.xpath("/html/body/div/div/div[3]/div/div[2]/div[2]/div/div[1]/div/a[2]")).click();
			
			
			ArrayList<String> ala = new ArrayList<String>(driver.getWindowHandles());
			Thread.sleep(1500);
			
			for (int i = 0; i < ala.size(); i++)
		          System.out.println(ala.get(i) + " ");
				Thread.sleep(1500);
				
				driver.switchTo().window(ala.get(2));
				
				System.out.println(driver.getTitle());
				Thread.sleep(1500);Thread.sleep(1500);
				
				driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[2]/form/button")).click();
				
				
			
		
		
	}

}

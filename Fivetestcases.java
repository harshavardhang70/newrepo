package harsha;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

public class Fivetestcases {
	WebDriver driver;
	
	
	@Test(priority=1)
	public void login() throws Exception {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.edge.driver", "C:\\selenium\\edgedriver_win32\\msedgedriver.exe");
		 driver = new EdgeDriver();
			driver.get("https://www.flipkart.com/account/login?ret=/");
			
			driver.manage().window().maximize();
			Thread.sleep(1500);
			driver.findElement(By.xpath("/html/body/div/div/div[3]/div/div[2]/div/form/div[1]/input")).sendKeys("7032394341");
			driver.findElement(By.xpath("/html/body/div/div/div[3]/div/div[2]/div/form/div[2]/input")).sendKeys("wrong password");
			driver.findElement(By.xpath("/html/body/div/div/div[3]/div/div[2]/div/form/div[4]/button")).click();
			Thread.sleep(1500);
	}	
			
	
	//Thread.sleep(1500);
	@Test(priority=4)
	public void cartandlogout() throws Exception {
	Actions action =new Actions(driver);
			
			WebElement myaccount = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[3]/div/div/div/div"));
			action.moveToElement(myaccount).perform();
			
			Thread.sleep(1500);
			
			
			driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[5]/div/div/a/span")).click();
			
			
			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div[1]/div/a[1]/img")).click();
			Thread.sleep(1500);
			//System.out.println("al");
			Thread.sleep(1500);Thread.sleep(1500);
			
			WebElement myaccount1 = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/div"));
			
			action.moveToElement(myaccount1).perform();
}


		@Test(priority=2)
		public void searching() throws Exception {	
			driver.get("https://www.amazon.in/your-account");
			
			Thread.sleep(1000);Thread.sleep(1000);
			
			driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[4]/div[1]/span[1]")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input")).sendKeys("alexa");
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[3]/div/span/input")).click();
			Thread.sleep(1500);
		}
		
			@Test(priority=3)
			public void addcart() throws Exception {
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[1]/div/span[3]/div[2]/div[1]/div/span/div/div/div[2]/div[1]/div/div/span/a/div/img")).click();
			
			Thread.sleep(1500);Thread.sleep(2500);
			
			System.out.println(driver.getWindowHandle());
			Thread.sleep(2500);
			
			
			ArrayList<String> al = new ArrayList<String>(driver.getWindowHandles());
			Thread.sleep(2500);
			
			//System.out.println(al);
			//Thread.sleep(2500);
			
			
			//for (int i = 0; i < al.size(); i++)
	          //  System.out.print(al.get(i) + " ");
			//Thread.sleep(2500);
			
			driver.switchTo().window(al.get(1));
			
			System.out.println(driver.getTitle());
			Thread.sleep(2500);
			//driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[5]/div[10]/div[1]/div[5]/div/div/div/form/div[1]/div/div/div/div[2]/div/div[31]/div[1]/span/span/span/input")).click();
			driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[4]/div[10]/div[1]/div[5]/div/div/div/form/div[1]/div/div/div/div[2]/div/div[31]/div[1]/span/span/span/input")).click();
			
			//System.out.println("htcuv");
			Thread.sleep(2500);
			
			driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[3]/span[2]/span/input")).click();
			
			
			//Alert a = driver.switchTo().alert();
			//a.dismiss();
			
		
			//System.out.println("htcuv1");
		
			
			
			
		
		
		
		
	}

}

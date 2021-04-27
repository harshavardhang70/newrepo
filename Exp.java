package second;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;



public class Exp {

	//public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
	
	
		@Test
		public void login() {
		System.setProperty("webdriver.edge.driver", "C:\\selenium\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("venkaiahramaiahgari2223@gmail.com");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("Venky3020rve@");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button/span")).click();
		//Thread.sleep(1500);
		//Thread.sleep(1500);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("7702504506");
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button/span")).click();
		
		//Thread.sleep(1500);
		driver.close();
		
		
	}

}

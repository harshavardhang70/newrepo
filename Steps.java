package StepDefinition;
import java.util.ArrayList;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	public WebDriver driver;
	@Given("^Open the Browser$")
	public void Open_the_and_launch_the_application()throws Throwable
	{
		System.setProperty("webdriver.edge.driver", "C:\\selenium\\edgedriver_win32\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("https://www.google.co.in/");
		System.out.println("browser opening");
	}
	
	@Then("^Enter the Username and Password$")
	public void Enter_the_Username_and_Password() throws Throwable {
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
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
			
			driver.switchTo().window(ala.get(ala.size()-1));
			
			System.out.println(driver.getTitle());
			Thread.sleep(1500);Thread.sleep(1500);
			
			driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[2]/form/button")).click();
			
			Thread.sleep(1500);Thread.sleep(1500);

		System.out.println("username password");
		Thread.sleep(1500);
	}
	
	@When("^Close the application$")
	public void Close_the_application() throws Throwable {
		driver.quit();
		System.out.println("driver closed");
		
	}


}
    
package Testrunner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Testcase {
	
	
	
public WebDriver driver;
	
	@Given("^open e-commerce application$")
	public void openbrowser()
	{
		System.setProperty("webdriver.edge.driver", "C:\\selenium\\edgedriver_win32\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("https://www.google.co.in/");
		System.out.println("browser opening");
	}
	
	@Then("^user name and password entered$")
	public void login() {
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("7032394341");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("wrong password");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button/span")).click();
		
		System.out.println("username password");
	}
	
	@When("^login page should display$")
	public void logout() {
		driver.close();
		System.out.println("driver closed");
		
	}


}

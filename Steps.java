package StepDefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	public WebDriver driver;
	@Given("^Open the Firefox and launch the application$")
	public void Open_the_Firefox_and_launch_the_application()throws Throwable
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
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button/span")).click();
		
		System.out.println("username password");
		Thread.sleep(1500);
	}
	
	@When("^Reset the credential$")
	public void Reset_the_credential() throws Throwable {
		driver.close();
		System.out.println("driver closed");
		
	}


}

package second;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;




public class Exp {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
	
	
	
		//System.setProperty("webdriver.chrome.driver", "C:\\selenium\\edgedriver_win32\\msedgedriver.exe");
		//WebDriver driver = new EdgeDriver();
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HarshaVardhanGanguru\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("7032394341");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("wrong password");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button/span")).click();
		Thread.sleep(1500);
		
		
		WebElement Fashion = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[4]/a/div[1]/div/img"));
		
		Actions action =new Actions(driver);
		action.moveToElement(Fashion).perform();
		
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[3]/div[2]/div[2]/div/div[2]/a[13]/span")).click();
		
		
		
		
		
		
		
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
		
		
		
		WebElement myaccount = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[3]/div/div/div/div"));
		action.moveToElement(myaccount).perform();
		
		Thread.sleep(1500);
		
		WebElement Toys1 = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[9]/a/div[1]/div/img"));
		
		
		
		WebElement element = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[4]/a/div[1]/div/img"));
		JavascriptExecutor executer = (JavascriptExecutor)driver;
		System.out.println("java script");
		
		
		String javaScript = "var evObj = document.createEvent('MouseEvents');" +
					"evObj.initMouseEvent(\"mouseover\",true, false, window, 0, 0, 0, 0, 0, false, false, false, false, 0, null);" +
						"arguments[0].dispatchEvent(evObj);";


((JavascriptExecutor)driver).executeScript(javaScript, element);
((JavascriptExecutor)driver).executeScript(javaScript, Toys1);
		
		
		
		
		//executer.executeScript("", element);
		//((JavascriptExecutor) driver).executeScript("arguments[0].mouseOverScript()",element);
		//((JavascriptExecutor)driver).executeScript("/html/body/div/div/div[2]/div/div/div[4]/a/div[1]/div/img",element);
		
		System.out.println("finding element");
		Thread.sleep(1500);
		Thread.sleep(1500);
		
		
		
		
		
		
		
		
		
		
		//dropdown
		
		driver.get("https://www.amazon.in/your-account");
		driver.manage().window().maximize();
		Thread.sleep(1500);
		
		
		
		
		//driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[1]/div/div/select")).click();
		//Thread.sleep(1500);
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

		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[2]/div/div[3]/span/div/span/div/div/div[2]/ul/li/span/a/div/label/i")).click();
		Thread.sleep(1500);	
		
		
		
		
		//JavascriptExecutor executer = ((JavascriptExecutor)driver);
		//executer.executeScript("window.scrollTo(0, 250)");
		Thread.sleep(1500);
		
		
		driver.close();
		
		
	}

}

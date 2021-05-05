package harsha;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class collectionapi {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		
		
		HashMap<Integer, String> h = new HashMap<Integer, String>();

		h.put(1, "7032394341");
		h.put(2, "wrong password");
   
    
    System.setProperty("webdriver.edge.driver", "C:\\selenium\\edgedriver_win32\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.flipkart.com/");
	
	
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys(h.get(1));
	Thread.sleep(1500);
	System.out.println("username entered");
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys(h.get(2));
	System.out.println("password entered");
	Thread.sleep(1500);
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button/span")).click();
	Thread.sleep(1500);
	System.out.println("login into application");
	
	
	
    
    
    
		    }
		
		
		
		
	}


package day1test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.annotations.*;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;


public class Tcase {

	//public static void main(String args[]) throws Exception {
		@Test
		public void login() throws Exception {
		System.out.println("maven project");
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HarshaVardhanGanguru\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(1500);
		driver.close();
		
	}
	
}

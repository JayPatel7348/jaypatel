package p3;


import java.io.File;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;





public class TestCaseJunit {
	
	@Test
	public void TC1ValLgn() throws InterruptedException, IOException
	{
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		System.out.println("When Enter valid credential->");
		Thread.sleep(1000);
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(3000);
		String expected="Dashboard";
		
		try{
		 String actual= driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
		 
		//below message just for user understand the output
			System.out.println("Expected: "+expected);
			System.out.println("Actual: "+actual);
			Assert.assertEquals("Not Dashboard",expected,actual);
		}
		catch(Exception e){
			
			
		}
		
        TakesScreenshot ts= (TakesScreenshot) driver;
		
		File scrFile =ts.getScreenshotAs(OutputType.FILE);
		
		Files.copy(scrFile, new File("E:\\jay\\SS\\TC1ValLgn.png"));
		driver.close();
	}
	
	@Test
	public void TC2InvalLgn() throws InterruptedException, IOException
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		System.out.println("When Enter Invalid credential->");
		Thread.sleep(1000);
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin12");
		
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(3000);
		
		String expected="OrangeHRM";
		String actual=driver.getTitle();
		if (expected==actual)
		{
			
		}
		/*
		  String actual="";
		 
		try{
		 actual= driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
	
		}
		catch(Exception e){
			
			//below message just for user understand the output
			 System.out.println("Expected: "+expected);
			System.out.println("Actual: "+actual);

		}
		*/
		System.out.println(actual);
		System.out.println(expected);
		
		 TakesScreenshot ts= (TakesScreenshot) driver;
			
			File scrFile =ts.getScreenshotAs(OutputType.FILE);
			
			Files.copy(scrFile, new File("E:\\jay\\SS\\TC2InvalLgn.png"));
			
			driver.close();
       
		
		
	}
	
	@Test
	public void TC3ValdnMsg() throws InterruptedException, IOException
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		System.out.println("When Enter Invalid credential & show validation message->");
		Thread.sleep(1000);
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin12");
		
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(3000);
		
		String expected="Invalid credentials";
		String actual= driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")).getText();
		if(expected==actual)
		{
			
		}
		System.out.println(actual);
		System.out.println(expected);
		
        TakesScreenshot ts= (TakesScreenshot) driver;
		
		File scrFile =ts.getScreenshotAs(OutputType.FILE);
		
		Files.copy(scrFile, new File("E:\\jay\\SS\\TC3ValdnMsg.png"));
		driver.quit();
		
	}
}

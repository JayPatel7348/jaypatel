package p3;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class screenShot {

	static void ScreenShot(TakesScreenshot driver) throws IOException
	{
		TakesScreenshot ts= (TakesScreenshot) driver;
		
		File scrFile =ts.getScreenshotAs(OutputType.FILE);
		
		Files.copy(scrFile, new File("E:\\jay\\SS\\screenshot01.png"));
		System.out.println("SS1 The Screenshot is captured.");
	}
	
	/*
	//Capturing the screenshot
	static void ScreenShot2(TakesScreenshot drv) throws IOException
	{
    File f = ((TakesScreenshot) drv).getScreenshotAs(OutputType.FILE);
    Files.copy(f, new File("E:\\jay\\SS\\screenshot02.png"));

     //screenshot copied from buffer is saved at the mentioned path.

    System.out.println("SS2 The Screenshot is captured.");
	}
	*/
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(1000);
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		Thread.sleep(1000);
		ScreenShot((TakesScreenshot) driver);
		
	}

}

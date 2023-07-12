import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollWebPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.out.println("hello");
		System.setProperty("webdriver.chrome.driver", "D:\\software\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
		//to perform Scroll on application using Selenium
	       JavascriptExecutor js = (JavascriptExecutor) driver;
	       js.executeScript("window.scrollBy(0,500)", "");
	       
	       Thread.sleep(1000);
	       driver.close();
		
	}

}

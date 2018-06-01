package WebformTest;
	
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;		

public class IETest {
	public static void main (String [] args) throws Exception {
		WebDriver driver;
		String baseURL = "http://info.xoi.io/pilot";
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\blair\\Desktop\\IEDriverServer.exe");
		//InternetExplorerDriver driver2 = new InternetExplorerDriver(options);
	
		DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		caps.setCapability(InternetExplorerDriver.NATIVE_EVENTS, false);
		caps.setCapability(InternetExplorerDriver.ENABLE_PERSISTENT_HOVERING, false);
		caps.setCapability(InternetExplorerDriver.REQUIRE_WINDOW_FOCUS, false);
		caps.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
		caps.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
		caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		
		
		driver = new InternetExplorerDriver(caps);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseURL);	
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement FirstName = driver.findElement(By.xpath(".//*[@name='firstname']"));
		
		//FirstName.sendKeys(org.openqa.selenium.Keys.CONTROL);
		//FirstName.click();
		
		//Actions action = new Actions(driver);
		//action.sendKeys(FirstName, "Blaire").build().perform();
		
	}
}
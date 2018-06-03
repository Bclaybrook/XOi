package WebformTest;
	
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;		

public class IETest {
	public static void main (String [] args) throws Exception {
		WebDriver driverforIE11;
		String baseURL = "https://info.xoi.io/pilot";
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\blair\\Desktop\\IEDriverServer.exe");
		//InternetExplorerDriver driver2 = new InternetExplorerDriver(options);
	
		DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		caps.setCapability(InternetExplorerDriver.NATIVE_EVENTS, false);
		caps.setCapability(InternetExplorerDriver.ENABLE_PERSISTENT_HOVERING, false);
		caps.setCapability(InternetExplorerDriver.REQUIRE_WINDOW_FOCUS, false);
		caps.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
		caps.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
		caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		
		
		driverforIE11 = new InternetExplorerDriver(caps);
		driverforIE11.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driverforIE11.manage().window().maximize();
		driverforIE11.get(baseURL);	
		
		// Fill out all fields        
        // 1. Fill out Contact Name
        WebElement ContactName = driverforIE11.findElement(By.xpath(".//*[@name='firstname']"));  
        
        // Type the contact name email to the form
        ContactName.sendKeys("Blaire");
        System.out.println("ContactName has been filled out");
        
        // 2. Fill out Job Title
        WebElement JobTitle = driverforIE11.findElement(By.xpath(".//*[@name='jobtitle']"));

        // Type a title to the form. This needs not be unique.
        JobTitle.sendKeys("Tester");
        System.out.println("JobTitle has been filled out");
        
       // 3. Fill out CompanyName
        WebElement XOi = driverforIE11.findElement(By.xpath(".//*[@name='company']"));

       // Type a CompanyName to the form. This needs not be unique.
        XOi.sendKeys("XOI is awesome");
        System.out.println("Company Name has been filled out");
        
       // 4. Fill out CompanyEmail
        WebElement CompanyEmail = driverforIE11.findElement(By.xpath(".//*[@name='email']"));

       // Type a CompanyEmail to the form. This needs not be unique.
        CompanyEmail.sendKeys("RandomEmail@blank.com");
        System.out.println("Company Email has been filled out");
        
        // 5. Fill out Phone Number
        WebElement PhoneNum = driverforIE11.findElement(By.xpath(".//*[@name='phone']"));

       // Type a random Phone Number to the form. This needs not be unique.
        PhoneNum.sendKeys("999-999-9999");
        System.out.println("Phone Number has been filled out");

        // Find Submit button and ID color
        WebElement PreHoverSubmit = driverforIE11.findElement(By.xpath("//div[@class='actions']"));
        System.out.println("Prior to hovering, the Tested color is: " + PreHoverSubmit.getCssValue("background-color"));
        
       // Mouse Over and verify color change on Submit button
        driverforIE11.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        
        //WebElement HoverSubmit = driver.findElement(By.cssSelector(selector_For_Web_Element_To_Be_Hovered));
        Actions builder = new Actions(driverforIE11);
        WebElement HoverSubmit = driverforIE11.findElement(By.xpath(".//*[@class='hs-button primary large']"));
        builder.moveToElement(HoverSubmit).build().perform();
        System.out.println("After hovering, the Tested color is: " + HoverSubmit.getCssValue("background-color"));
        // Submit the sign up form
        
        WebElement ClickSubmit = driverforIE11.findElement(By.xpath("//input[@type='submit']"));
         
        ClickSubmit.click();
  
        String title = "Pilot Form Confirmation";
        WebDriverWait waitatIEtest1 = new WebDriverWait(driverforIE11, 5);
        waitatIEtest1.until(ExpectedConditions.titleContains(title));
        System.out.println("Functional Test 1 successful, form filled out correctly and user was directed to Thank You Page");
        driverforIE11.close();
        //TryPilot.click();
        //waitatIEtest1.until(ExpectedConditions.TryPilot));
        //waitatIEtest1.until(ExpectedConditions.urlToBe(baseURLTYtobe));
        

//--------------------------------------------FUNCTIONAL TEST 2--------------------------------------------//
        driverforIE11 = new InternetExplorerDriver(caps);
		driverforIE11.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driverforIE11.manage().window().maximize();
		driverforIE11.get(baseURL);	

		// Fill out all fields        
		// 1. Fill out Contact Name       
        WebElement ContactName2 = driverforIE11.findElement(By.xpath(".//*[@name='firstname']"));  
		ContactName2.sendKeys("Blaire");
        System.out.println("ContactName has been filled out");
        
        // 2. Fill out Job Title
        WebElement JobTitle2 = driverforIE11.findElement(By.xpath(".//*[@name='jobtitle']"));
        JobTitle2.sendKeys("Tester");
        System.out.println("JobTitle has been filled out");
        
       // 3. Fill out CompanyName
        WebElement XOi2 = driverforIE11.findElement(By.xpath(".//*[@name='company']"));
        XOi2.sendKeys("XOI is awesome");
        System.out.println("Company Name has been filled out");
        
       // 4. Fill out CompanyEmail
        WebElement CompanyEmail2 = driverforIE11.findElement(By.xpath(".//*[@name='email']"));
        CompanyEmail2.sendKeys("asdfasdf");
        System.out.println("Company Email has been filled out");
        
        // 5. Fill out Phone Number in nonconventional char form
        WebElement PhoneNum2 = driverforIE11.findElement(By.xpath(".//*[@name='phone']"));
        PhoneNum2.sendKeys("asdfas");
        System.out.println("Phone Number has been filled out");
        
        WebElement ClickSubmit2 = driverforIE11.findElement(By.xpath("//input[@type='submit']"));       
        ClickSubmit2.click();
        String baseURLtobe = "https://info.xoi.io/pilot";
        WebDriverWait waitatIEtest2 = new WebDriverWait(driverforIE11, 10);
        waitatIEtest2.until(ExpectedConditions.urlToBe(baseURLtobe));
        System.out.println("Functional Test 2 successful due to incorrect character input and did not direct user to Thank You page.");
        driverforIE11.close();

        		
        
        
//------------------------------------------FUNCTIONAL TEST 3--------------------------------------------//
        
        //Test Submitting an empty form and not directing user to Thank You page
        
        driverforIE11 = new InternetExplorerDriver(caps);
		driverforIE11.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driverforIE11.manage().window().maximize();
		driverforIE11.get(baseURL);	
		
        // 1. Fill out Contact Name    
        WebElement ContactName3 = driverforIE11.findElement(By.xpath(".//*[@name='firstname']"));  
        ContactName3.click();
        ContactName3.sendKeys(Keys.SPACE);
        
        // 2. Fill out Job Title
        WebElement JobTitle3 = driverforIE11.findElement(By.xpath(".//*[@name='jobtitle']"));
        JobTitle3.click();
        JobTitle3.sendKeys(Keys.SPACE);
        
       // 3. Fill out CompanyName
        WebElement XOi3 = driverforIE11.findElement(By.xpath(".//*[@name='company']"));
        XOi3.click();
        XOi3.sendKeys(Keys.SPACE);
        
       // 4. Fill out CompanyEmail
        WebElement CompanyEmail3 = driverforIE11.findElement(By.xpath(".//*[@name='email']"));
        CompanyEmail3.click();
        CompanyEmail3.sendKeys(Keys.SPACE);
        
        // 5. Fill out Phone Number
        WebElement PhoneNum3 = driverforIE11.findElement(By.xpath(".//*[@name='phone']"));
        PhoneNum3.click();
        PhoneNum3.sendKeys(Keys.SPACE);
        
        // Submit the sign up form
        WebElement ClickSubmit3 = driverforIE11.findElement(By.xpath("//input[@type='submit']"));       
        ClickSubmit3.click();
        WebDriverWait waitatIEtest3 = new WebDriverWait(driverforIE11, 10);
        waitatIEtest3.until(ExpectedConditions.urlToBe(baseURLtobe));
        System.out.println("Functional Test 3 successful due to nonentries in form and did not direct user to Thank You page.");
        driverforIE11.close();
        
		
	}

}
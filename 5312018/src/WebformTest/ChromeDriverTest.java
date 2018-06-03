package WebformTest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChromeDriverTest {
//--------------------------------------------FUNCTIONAL TEST 1-----------------------------------------------------
	public static void main (String[] args) throws Exception {
		String baseURL = "http://info.xoi.io/pilot";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\blair\\Desktop\\eclipse\\XOITechnologies\\5312018\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseURL);

		// Fill out all fields        
        // 1. Fill out Contact Name
        WebElement ContactName = driver.findElement(By.xpath(".//*[@name='firstname']"));  
        
        // Type the contact name email to the form
        ContactName.sendKeys("Blaire");
        System.out.println("ContactName has been filled out");
        
        // 2. Fill out Job Title
        WebElement JobTitle = driver.findElement(By.xpath(".//*[@name='jobtitle']"));

        // Type a title to the form. This needs not be unique.
        JobTitle.sendKeys("Tester");
        System.out.println("JobTitle has been filled out");
        
       // 3. Fill out CompanyName
        WebElement XOi = driver.findElement(By.xpath(".//*[@name='company']"));

       // Type a CompanyName to the form. This needs not be unique.
        XOi.sendKeys("XOI is awesome");
        System.out.println("Company Name has been filled out");
        
       // 4. Fill out CompanyEmail
        WebElement CompanyEmail = driver.findElement(By.xpath(".//*[@name='email']"));

       // Type a CompanyEmail to the form. This needs not be unique.
        CompanyEmail.sendKeys("RandomEmail@blank.com");
        System.out.println("Company Email has been filled out");
        
        // 5. Fill out Phone Number
        WebElement PhoneNum = driver.findElement(By.xpath(".//*[@name='phone']"));

       // Type a random Phone Number to the form. This needs not be unique.
        PhoneNum.sendKeys("999-999-9999");
        System.out.println("Phone Number has been filled out");

        // Find Submit button and ID color
        WebElement PreHoverSubmit = driver.findElement((By.xpath("//input[@type='submit']")));
        System.out.println("Prior to hovering, the Tested color is: " + PreHoverSubmit.getCssValue("background-color"));
        
        
       // Mouse Over and verify color change on Submit button
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        
        Actions builder = new Actions(driver);
        WebElement HoverSubmit = driver.findElement((By.xpath("//input[@type='submit']")));
        builder.moveToElement(HoverSubmit).build().perform();
        System.out.println("After hovering, the Tested color is: " + HoverSubmit.getCssValue("background-color"));
      
        
        // Submit the sign up form
        WebElement ClickSubmit = driver.findElement(By.xpath("//input[@type='submit']"));
        ClickSubmit.click();
        String title = "Pilot Form Confirmation";
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.titleContains(title));
        System.out.println("Functional Test 1 successful, form filled out correctly and user was directed to Thank You Page");
        driver.close();
        
//--------------------------------------------FUNCTIONAL TEST 2--------------------------------------------//
        //Test submitting incorrect characters and not directing user to Thank You page.
        driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseURL);

		// Fill out all fields        
		// 1. Fill out Contact Name       
        WebElement ContactName2 = driver.findElement(By.xpath(".//*[@name='firstname']"));  
		ContactName2.sendKeys("Blaire");
        System.out.println("ContactName has been filled out");
        
        // 2. Fill out Job Title
        WebElement JobTitle2 = driver.findElement(By.xpath(".//*[@name='jobtitle']"));
        JobTitle2.sendKeys("Tester");
        System.out.println("JobTitle has been filled out");
        
       // 3. Fill out CompanyName
        WebElement XOi2 = driver.findElement(By.xpath(".//*[@name='company']"));
        XOi2.sendKeys("XOI is awesome");
        System.out.println("Company Name has been filled out");
        
       // 4. Fill out CompanyEmail
        WebElement CompanyEmail2 = driver.findElement(By.xpath(".//*[@name='email']"));
        CompanyEmail2.sendKeys("asdfasdf");
        System.out.println("Company Email has been filled out");
        
        // 5. Fill out Phone Number in nonconventional char form
        WebElement PhoneNum2 = driver.findElement(By.xpath(".//*[@name='phone']"));
        PhoneNum2.sendKeys("asdfas");
        System.out.println("Phone Number has been filled out");
        
        WebElement ClickSubmit2 = driver.findElement(By.xpath("//input[@type='submit']"));       
        ClickSubmit2.click();
        String baseURLtobe = "http://info.xoi.io/pilot";
        WebDriverWait waitattest2 = new WebDriverWait(driver, 10);
        waitattest2.until(ExpectedConditions.urlToBe(baseURLtobe));
        System.out.println("Functional Test 2 successful due to incorrect character input and did not direct user to Thank You page.");
        driver.close();

        		
        
        
//------------------------------------------FUNCTIONAL TEST 3--------------------------------------------//
        
        //Test Submitting an empty form and not directing user to Thank You page
        
        driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseURL);
		
        // 1. Fill out Contact Name    
        WebElement ContactName3 = driver.findElement(By.xpath(".//*[@name='firstname']"));  
        ContactName3.click();
        ContactName3.sendKeys(Keys.SPACE);
        
        // 2. Fill out Job Title
        WebElement JobTitle3 = driver.findElement(By.xpath(".//*[@name='jobtitle']"));
        JobTitle3.click();
        JobTitle3.sendKeys(Keys.SPACE);
        
       // 3. Fill out CompanyName
        WebElement XOi3 = driver.findElement(By.xpath(".//*[@name='company']"));
        XOi3.click();
        XOi3.sendKeys(Keys.SPACE);
        
       // 4. Fill out CompanyEmail
        WebElement CompanyEmail3 = driver.findElement(By.xpath(".//*[@name='email']"));
        CompanyEmail3.click();
        CompanyEmail3.sendKeys(Keys.SPACE);
        
        // 5. Fill out Phone Number
        WebElement PhoneNum3 = driver.findElement(By.xpath(".//*[@name='phone']"));
        PhoneNum3.click();
        PhoneNum3.sendKeys(Keys.SPACE);
        
        // Submit the sign up form
        WebElement ClickSubmit3 = driver.findElement(By.xpath("//input[@type='submit']"));       
        ClickSubmit3.click();
        WebDriverWait wait3 = new WebDriverWait(driver, 10);
        wait3.until(ExpectedConditions.urlToBe(baseURLtobe));
        System.out.println("Functional Test 3 successful due to nonentries in form and did not direct user to Thank You page.");
        driver.close();
        
		
	}
}



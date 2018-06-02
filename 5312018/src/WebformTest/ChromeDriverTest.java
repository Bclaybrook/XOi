package WebformTest;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
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

       // Type a random Phone Number to the form. This needs not be unique.-
        PhoneNum.sendKeys("999-999-9999");
        System.out.println("Phone Number has been filled out");

        // Find Submit button and ID color
        WebElement PreHoverSubmit = driver.findElement(By.xpath("//div[@class='actions']"));
        String PreColor = PreHoverSubmit.getCssValue("background-color");
        System.out.println("Prior to hovering, the submit button color should be rgba(0, 0, 0, 0). Tested color is: " + PreColor);
        
        
       // Mouse Over and verify color change on Submit button
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        
        //WebElement HoverSubmit = driver.findElement(By.cssSelector(selector_For_Web_Element_To_Be_Hovered));
        Actions builder = new Actions(driver);
        WebElement HoverSubmit = driver.findElement(By.xpath("//input[@type='submit']"));
        builder.moveToElement(HoverSubmit).build().perform();
		String Color = HoverSubmit.getCssValue("background-color");
        System.out.println("After hovering, the submit button color is: " + Color);
        
        // Submit the sign up form
        WebElement ClickSubmit = driver.findElement(By.xpath("//input[@type='submit']"));
        ClickSubmit.click();
        String title = "Pilot Form Confirmation";
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.titleContains(title));
        System.out.println("Functional Test 1 successful and form filled out correctly");
        driver.close();
        
//--------------------------------------------FUNCTIONAL TEST 2--------------------------------------------//
        //Test Submitting an empty form
        
        driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseURL);
		
        // 1. Fill out Contact Name        
        WebElement ContactName2 = driver.findElement(By.xpath(".//*[@name='firstname']"));  
        ContactName2.click();
        
        // 2. Fill out Job Title
        WebElement JobTitle2 = driver.findElement(By.xpath(".//*[@name='jobtitle']"));
        JobTitle2.click();
        
       // 3. Fill out CompanyName
        WebElement XOi2 = driver.findElement(By.xpath(".//*[@name='company']"));
        XOi2.click();
        
       // 4. Fill out CompanyEmail
        WebElement CompanyEmail2 = driver.findElement(By.xpath(".//*[@name='email']"));
        CompanyEmail2.click();
        
        // 5. Fill out Phone Number
        WebElement PhoneNum2 = driver.findElement(By.xpath(".//*[@name='phone']"));
        PhoneNum2.click();
        
        // Submit the sign up form
        WebElement ClickSubmit2 = driver.findElement(By.xpath("//input[@type='submit']"));
        ClickSubmit2.click();
        WebDriverWait waitagain = new WebDriverWait(driver, 10);
        waitagain.until(ExpectedConditions.titleContains(title));    
        
		
	}
}



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {

	public static WebDriver driver;
	
	
	@BeforeSuite
	public void setUp()
	{
		
		
		
		// System Property for Chrome Driver   
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kranti\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");  
          
             // Instantiate a ChromeDriver class.     
        //WebDriver driver=new ChromeDriver();  
          
        driver= new ChromeDriver();
          
          
         //Maximize the browser  
          driver.manage().window().maximize();  

	}
	
	@Test
	public void doLogin()
	{
		driver.get("http://demo.guru99.com/test/login.html");
		
		//driver.get("http://gmail.com");
		//driver.findElement(By.id("identifierId")).sendKeys("kranti.b.y@gmail.com");
		
		driver.findElement(By.id("email")).sendKeys("kranti.b.y@gmail.com");
		
		//WebElement next=driver.findElement(By.name("V67aGc"));
		//next.click();
		
		driver.findElement(By.id("passwd")).sendKeys("asdfg");
		
		WebElement login = driver.findElement(By.id("SubmitLogin"));
		login.click();
	}
	
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}
}

package old_Claim;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Thanedlc 
{
	//protected static ThreadLocal<EdgeDriver> driver=new ThreadLocal<>();
	//protected static ThreadLocal<FirefoxDriver> driver=new ThreadLocal<>();
	 protected static ThreadLocal<ChromeDriver> driver=new ThreadLocal<>();
	 @BeforeMethod
	 public void setup() throws Exception
	 { System.out.println("Browser Name Is:EdgeDriver");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\niting\\Downloads\\chromedriver_win32 (1)\\crom_drvr-2\\chromedriver.exe\\");
	    driver.set(new ChromeDriver());
	    driver().manage().window().maximize();
		driver().navigate().to("http://trti.mahamining.com/home");
		 Thread.sleep(2000);
		 driver().findElement(By.xpath("//*[@id=\"home_login\"]")).click();
		Thread .sleep(3000);
	//Thane DlC login
	driver().findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[1]/div/input")).sendKeys("ThaneDLC");		  
	Thread .sleep(1000);
	 driver().findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[2]/div/div/input")).sendKeys("aneDLC@5959");
	  Thread .sleep(1000);	
	  String s=JOptionPane.showInputDialog("enter your captcha");
	    
	  	driver().findElement(By.xpath("//input[@placeholder='Enter Captcha']")).sendKeys(s);
	      Thread .sleep(1000);
	    
	  	driver().findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[5]/button")).click();
	  	Thread .sleep(3000);
	    
	  
		 // System.setProperty("webdriver.gecko.driver","C:\\Users\\niting\\eclipse-workspace\\Mavenutility\\src\\main\\resources\\drivers\\geckodriver\\geckodriver.exe");
		  // driver.set(new FirefoxDriver());
		  // System.setProperty("webdriver.edge.driver","C:\\Users\\niting\\Downloads\\edgedriver_win64\\edgedrvr\\msedgedriver.exe\\");
		  // driver.set(new EdgeDriver());
	
	 }
	 public WebDriver driver()
	 {
		 return driver.get();
	 }
	    // @AfterMethod
	     public void teardown() 
	     {  
	    	 driver().quit();
	     }
	 
	     }
		
	
	


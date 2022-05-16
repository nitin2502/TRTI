package master;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class Panchayat {
	public static void main(String[] args) throws InterruptedException, IOException 
	{	System.setProperty("webdriver.chrome.driver","C:\\Users\\niting\\Downloads\\chromedriver_win32 (1)\\crom_drvr-2\\chromedriver.exe\\");
    WebDriver driver= new ChromeDriver();
    driver.get("http://trti.mahamining.com/login");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id=\"home_login\"]")).click();
	Thread .sleep(1000);	
	//admin login
	driver.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[1]/div/input")).sendKeys("admin");
     Thread .sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[2]/div/div/input")).sendKeys("admin");
     Thread .sleep(1000);	
	driver.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[4]/button")).click();
   Thread .sleep(3000);
   //click on master
	driver.findElement(By.xpath("//*[@id=\"heading1\"]/button/div/div[2]")).click();
		//click on panchayat
	driver.findElement(By.xpath("//*[@id=\"collapse1\"]/div/ul/li[1]/a")).click();
	Thread .sleep(3000);
	//enter panchayat all field
	driver.findElement(By.xpath("//*[@id=\"content\"]/app-panchayat/div/div/div/div/div[1]/form/div/div/div[1]/div[2]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
	Thread .sleep(2000);
    driver.findElement(By.xpath("//*[@id=\"content\"]/app-panchayat/div/div/div/div/div[1]/form/div/div/div[1]/div[2]/div/ngx-select/div/ngx-select-choices/ul/li[7]/a/span")).click();	
    Thread .sleep(2000);
    driver.findElement(By.xpath("//*[@id=\"content\"]/app-panchayat/div/div/div/div/div[1]/form/div/div/div[1]/div[3]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
    Thread .sleep(3000);
    driver.findElement(By.xpath("//*[@id=\"content\"]/app-panchayat/div/div/div/div/div[1]/form/div/div/div[1]/div[3]/div/ngx-select/div/ngx-select-choices/ul/li[5]/a/span")).click();
    Thread .sleep(3000);
    driver.findElement(By.xpath("//*[@id=\"content\"]/app-panchayat/div/div/div/div/div[1]/form/div/div/div[1]/div[4]/div/ngx-select/div/div[2]/div")).click();
    Thread .sleep(3000);
    driver.findElement(By.xpath("//*[@id=\"content\"]/app-panchayat/div/div/div/div/div[1]/form/div/div/div[1]/div[4]/div/ngx-select/div/ngx-select-choices/ul/li[3]/a/span")).click();
    Thread .sleep(3000);
    driver.findElement(By.xpath("//*[@id=\"content\"]/app-panchayat/div/div/div/div/div[1]/form/div/div/div[1]/div[5]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
    Thread .sleep(1000);
    driver.findElement(By.xpath("//*[@id=\"content\"]/app-panchayat/div/div/div/div/div[1]/form/div/div/div[1]/div[5]/div/ngx-select/div/ngx-select-choices/ul/li[3]/a")).click();
    Thread .sleep(1000);
    driver.findElement(By.xpath("//*[@id=\"content\"]/app-panchayat/div/div/div/div/div[1]/form/div/div/div[1]/div[6]/div/ngx-select/div/input")).click();
    Thread .sleep(1000);
    driver.findElement(By.xpath("//*[@id=\"content\"]/app-panchayat/div/div/div/div/div[1]/form/div/div/div[1]/div[6]/div/ngx-select/div/ngx-select-choices/ul/li[7]/a")).click();
    Thread .sleep(1000);
    driver.findElement(By.xpath("//input[@placeholder='Enter Grampanchayat/Palika Name']")).sendKeys("Testgrampanchayat");
    Thread .sleep(3000);
    // click on submit button
    driver.findElement(By.xpath("//*[@id=\"content\"]/app-panchayat/div/div/div/div/div[1]/form/div/div/div[2]/button[2]")).click();
    Thread .sleep(3000);
    // update record
    driver.findElement(By.xpath("//*[@id=\"content\"]/app-panchayat/div/div/div/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[7]/button[1]/i")).click();
    Thread .sleep(3000);
    //update record
    driver.findElement(By.xpath("//*[@id=\"content\"]/app-panchayat/div/div/div/div/div[1]/form/div/div/div[1]/div[7]/div/input")).clear();
    Thread .sleep(1000);
    driver.findElement(By.xpath("//*[@id=\"content\"]/app-panchayat/div/div/div/div/div[1]/form/div/div/div[1]/div[7]/div/input")).sendKeys("edittest");
    Thread .sleep(1000);
    driver.findElement(By.xpath("//*[@id=\"content\"]/app-panchayat/div/div/div/div/div[1]/form/div/div/div[2]/button[2]")).click();
    Thread .sleep(1000);
    //delete record
    driver.findElement(By.xpath("//*[@id=\"content\"]/app-panchayat/div/div/div/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[7]/button[2]/i")).click();
    Thread .sleep(1000);
    driver.switchTo().alert().accept();
    Thread .sleep(3000);
	//driver.close();
	/* Select drpdn=new Select(driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div/app-panchayat/div/div/div/div/div[1]/form/div/div/div[1]/div[2]/div/ngx-select/div/div[2]/div/span[1]/span"))); 
	List <WebElement> options=drpdn.getOptions();
      System.out.println(options.size());
     for (WebElement e: options)
     {
    	 System.out.println("The values are"+e.getText());
     }*/
//take screenshot
File  scr =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Files.copy(scr, new File("Z:\\Scrnshot\\Panchayat02.png"));
	
	//close browser
	Thread .sleep(5000);
  driver.close();	
	
	
	
	

	
	}

}

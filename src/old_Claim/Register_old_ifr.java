package old_Claim;

import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Register_old_ifr extends Thanedlc   

{    
  @Test()
  public void Registerold() throws Exception
  {  // click on old ifr regi
    driver().findElement(By.xpath("//*[@id=\"heading1\"]/button/div/div[2]")).click();
    Thread.sleep(2000);
    driver().findElement(By.xpath("//*[@id=\"collapse1\"]/div/ul/li[1]/a")).click();
    Thread.sleep(2000);  
   // claiam details
    driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[1]/div[2]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
    Thread.sleep(2000); 
    driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[1]/div[2]/div/ngx-select/div/ngx-select-choices/ul/li[2]/a/span")).click();
    Thread.sleep(2000);
   //select request
    driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[1]/div[3]/div/ngx-select/div/div[2]/div")).click();
    Thread.sleep(2000);
    driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[1]/div[3]/div/ngx-select/div/ngx-select-choices/ul/li[2]/a/span")).click();
    Thread.sleep(2000);
  //select claim no
    driver().findElement(By.xpath("//input[@placeholder='Claim No']")).sendKeys("259/NG");
    Thread.sleep(2000);
    driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[1]/div[4]/div/div/button")).click();
    Thread.sleep(2000);
    driver().findElement(By.xpath("//input[@placeholder='Claim Date']")).sendKeys("12-05-2022");  
    Thread .sleep(2000);  
    //area details
    driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[2]/div[4]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
    Thread.sleep(2000);
    driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[2]/div[4]/div/ngx-select/div/ngx-select-choices/ul/li[2]/a/span")).click();
    Thread.sleep(2000);
    //selct taluka
    driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[2]/div[5]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
    Thread.sleep(2000);
    driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[2]/div[5]/div/ngx-select/div/ngx-select-choices/ul/li[2]/a/span")).click();
    Thread.sleep(2000);
   //select town /village
    driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[2]/div[6]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
    Thread.sleep(2000);
    driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[2]/div[6]/div/ngx-select/div/ngx-select-choices/ul/li[4]/a/span")).click();
    Thread.sleep(2000);
   //select panchayat
    driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[2]/div[7]/ngx-select/div/div[2]/div")).click();
    Thread.sleep(2000); 
    driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[2]/div[7]/ngx-select/div/ngx-select-choices/ul/li[4]/a/span")).click();
    Thread.sleep(2000); 
    // basic details
    //Claimant name
    driver().findElement(By.xpath("//input[@placeholder='Claimant Name (English)']")).sendKeys("dhondiba");  
    Thread .sleep(2000); 
    //Claimant name(marathi)
    driver().findElement(By.xpath("//input[@placeholder='Claimant Name (Marathi)']")).sendKeys("dhondiba");
    //father name
    Thread .sleep(2000); 
    driver().findElement(By.xpath("//input[@placeholder='Father Name']")).sendKeys("shankara");
    Thread .sleep(3000); 
 //selectgender
    driver().findElement(By.id("gender1")).click();  
    Thread .sleep(2000); 
  //dateof birth    
    driver().findElement(By.xpath("//input[@placeholder='Date of Birth']")).sendKeys("12-05-2022");  
    Thread .sleep(2000);  
   //mob no
    driver().findElement(By.id("mobile_id")).sendKeys("9638521590");  
    Thread .sleep(2000); 
    //email
    driver().findElement(By.xpath("//input[@placeholder='Email ID']")).sendKeys("xyzd123@gmail.com");  
    Thread .sleep(2000); 
    //Aadhar no
    driver().findElement(By.xpath("//input[@placeholder='Aadhar No']")).sendKeys("963852741158");  
    Thread .sleep(2000); 
  //claimant category
    driver().findElement(By.xpath("//ngx-select[@placeholder='Select Category']")).click();  
    Thread .sleep(3000);
    driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[3]/div[9]/div/ngx-select/div/ngx-select-choices/ul/li[3]/a/span")).click();  
    Thread .sleep(3000);
  //claimant caste
    driver().findElement(By.xpath("//ngx-select[@placeholder='Select Caste']")).click();  
    Thread .sleep(3000);
    driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[3]/div[10]/div/ngx-select/div/ngx-select-choices/ul/li[4]/a/span")).click();  
    Thread .sleep(3000);
 //martial status
    driver().findElement(By.id("maritalstatus1")).click();  
    Thread .sleep(3000);
   //spouse name 
    driver().findElement(By.xpath("//input[@placeholder='Spouse Name']")).sendKeys("Zansi");  
    Thread .sleep(2000); 
    //spousecategory
    driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[3]/div[13]/div/ngx-select/div/div[2]/div")).click();  
    Thread .sleep(3000);
    driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[3]/div[13]/div/ngx-select/div/ngx-select-choices/ul/li[4]/a/span")).click();  
    Thread .sleep(3000);
  //spouse  caste
    driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[3]/div[14]/div/ngx-select/div/div[2]/div/span[1]/span")).click();  
    Thread .sleep(3000);
    driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[3]/div[14]/div/ngx-select/div/ngx-select-choices/ul/li[9]/a/span")).click();  
     Thread .sleep(3000);
 //dependant family member
     driver().findElement(By.xpath("//input[@placeholder='Enter Name']")).sendKeys("Ramrao");  
     Thread .sleep(2000); 
     //selectgender
     driver().findElement(By.id("genderFamily1")).click();  
     Thread .sleep(2000); 
     //enterage
     driver().findElement(By.xpath("//input[@placeholder='Enter Age']")).sendKeys("18");  
     Thread .sleep(2000);  
  //relationclimant
     driver().findElement(By.xpath("//ngx-select[@placeholder='Select Relationship With Claimant']")).click();  
     Thread .sleep(3000);
     driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[4]/div[4]/ngx-select/div/ngx-select-choices/ul/li[5]/a/span")).click();  
      Thread .sleep(3000);  
  //add
      driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[4]/div[5]/button")).click();  
      Thread .sleep(3000);
      driver().findElement(By.xpath("//input[@placeholder='Enter Name']")).sendKeys("SOMamrao");  
      Thread .sleep(2000); 
      //selectgender
      driver().findElement(By.id("genderFamily1")).click();  
      Thread .sleep(2000); 
      //enterage
      driver().findElement(By.xpath("//input[@placeholder='Enter Age']")).sendKeys("25");  
      Thread .sleep(2000);  
   //relationclimant
      driver().findElement(By.xpath("//ngx-select[@placeholder='Select Relationship With Claimant']")).click();  
      Thread .sleep(3000);
      driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[4]/div[4]/ngx-select/div/ngx-select-choices/ul/li[5]/a/span")).click();  
       Thread .sleep(3000);  
   //add
       driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[4]/div[5]/button")).click();  
       Thread .sleep(3000);
  //Encroachment Details
      driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[5]/div[1]/div[1]/div/div[2]/div/ngx-select/div/div[2]/div/span[1]/span")).click();  
      Thread .sleep(3000);
      driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[5]/div[1]/div[1]/div/div[2]/div/ngx-select/div/ngx-select-choices/ul/li[2]/a/span")).click();  
       Thread .sleep(3000);
  //compartment no
      driver().findElement(By.xpath("//input[@placeholder='Compartment No']")).sendKeys("4444");  
      Thread .sleep(2000); 
      //urvey no / gat no 
      driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[5]/div[2]/div/div/div[2]/div/input")).sendKeys("123/A,125/b");  
      Thread .sleep(2000);   
      driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[6]/div/div/div[2]/div/input")).sendKeys("50");  
      Thread .sleep(2000);
      driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[7]/div/div/div[2]/div/div/input")).sendKeys("45");  
      Thread .sleep(2000);
      driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[8]/div/div/div[2]/div/div/input")).sendKeys("43.4");  
      Thread .sleep(2000);
      driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[9]/div/div/div[2]/div/div/input")).sendKeys("42.0");  
      Thread .sleep(2000);
      driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[10]/div/div/div[2]/div/div/input")).sendKeys("41");  
      Thread .sleep(2000);
      driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[11]/div/div/div[2]/div/div/input")).sendKeys("40.0");  
      Thread .sleep(2000);
      driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[12]/div/div/div[2]/div/div/input")).sendKeys("38.9");  
      Thread .sleep(2000);
      //remark
      driver().findElement(By.xpath("//textarea[@placeholder='Remark']")).sendKeys("Notaccptedanyremark");  
      Thread .sleep(2000);
      // create case
      driver().findElement(By.xpath("//*[@id=\"fix-box\"]/form/div/div[14]/div/button")).click();  
      Thread .sleep(2000);
      driver().findElement(By.xpath("//*[@id=\"ConfirmModal\"]/div/div/div[2]/button[2]")).click();  
      Thread .sleep(2000);
      driver().findElement(By.xpath(" //*[@id=\"ConfirmDocumentModal\"]/div/div/div[2]/button[1]")).click();  
      Thread .sleep(3000);
  
      //click on claim list
      driver().findElement(By.xpath("//*[@id=\"collapse1\"]/div/ul/li[3]/a")).click();  
      Thread .sleep(2000);
      driver().findElement(By.xpath("//input[@placeholder='Enter Claimant Name/Claim No.']")).sendKeys("259/NG");  
      Thread .sleep(3000);
      driver().findElement(By.xpath("//*[@id=\"content\"]/app-old-ifr-claim-list/div/div/div/div/div/div[1]/form/div/div[8]/div/button")).click();  
      Thread .sleep(2000);
      driver().findElement(By.xpath("//a[@class='btn btn-light rounded ng-star-inserted']")).click();  
      Thread .sleep(20000);
      
   
      Screenshot k= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver());

  	ImageIO.write(k.getImage(), "png", new File("C:\\Users\\niting\\eclipse-workspace\\TRTI\\Screenshot\\14.png"));
      
      
      
  }
  

  
}

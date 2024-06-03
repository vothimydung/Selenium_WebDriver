package demoTestSelenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class LoginTest {
	
//	public String baseURL = "https://dynasty-admin.vtaan.id.vn/login";
	public WebDriver driver;
	
  @Test
  public void TC1_LoginSuccess() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://dynasty-admin.vtaan.id.vn/login");
	  Thread.sleep(2000);
	  
	  	// để trống username
	  driver.findElement(By.name("username")).sendKeys("admin");	

	    //Nhập password
	  driver.findElement(By.name("password")).sendKeys("13112002");
	    
	    // click vào nút login
	  driver.findElement(By.xpath("//button[contains(text(),'Đăng nhập')]")).click();
	  
	  Thread.sleep(2000);
	 
  }
  
   @Test
  public void TC2_UsernameBlank() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://dynasty-admin.vtaan.id.vn/login");
	  Thread.sleep(2000);
	  
	  	// để trống username
	  driver.findElement(By.name("username")).sendKeys("");	

	    //Nhập password
	  driver.findElement(By.name("password")).sendKeys("13112002");
	    
	    // click vào nút login
	  driver.findElement(By.xpath("//button[contains(text(),'Đăng nhập')]")).click();
	  
	  Thread.sleep(2000);
  }
   @Test
  public void TC3_PasswordBlank() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://dynasty-admin.vtaan.id.vn/login");
	  Thread.sleep(2000);
	  
	  	// để trống username
	  driver.findElement(By.name("username")).sendKeys("admin");	

	    //Nhập password
	  driver.findElement(By.name("password")).sendKeys("");
	    
	    // click vào nút login
	  driver.findElement(By.xpath("//button[contains(text(),'Đăng nhập')]")).click();
	  
	  Thread.sleep(2000);
  }
   @Test
   public void TC4_Empty() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://dynasty-admin.vtaan.id.vn/login");
	  Thread.sleep(2000);
	  
	  	// để trống username
	  driver.findElement(By.name("username")).sendKeys("");	

	    //Nhập password
	  driver.findElement(By.name("password")).sendKeys("");
	    
	    // click vào nút login
	  driver.findElement(By.xpath("//button[contains(text(),'Đăng nhập')]")).click();
	  
	  Thread.sleep(2000);
   }
   
   @Test
   public void TC5_errorUsername() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://dynasty-admin.vtaan.id.vn/login");
	  Thread.sleep(2000);
	  
	  	// để trống username
	  driver.findElement(By.name("username")).sendKeys("admin123@");	

	    //Nhập password
	  driver.findElement(By.name("password")).sendKeys("13112002");
	    
	    // click vào nút login
	  driver.findElement(By.xpath("//button[contains(text(),'Đăng nhập')]")).click();
	  
	  Thread.sleep(2000);
   }
   
   @Test
   public void TC6_errorPassword() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://dynasty-admin.vtaan.id.vn/login");
	  Thread.sleep(2000);
	  
	  	// để trống username
	  driver.findElement(By.name("username")).sendKeys("admin");	

	    //Nhập password
	  driver.findElement(By.name("password")).sendKeys("13112002@123");
	    
	    // click vào nút login
	  driver.findElement(By.xpath("//button[contains(text(),'Đăng nhập')]")).click();
	  
	  Thread.sleep(2000);
   }
   
}

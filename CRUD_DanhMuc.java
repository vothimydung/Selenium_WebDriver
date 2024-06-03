package demoTestSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CRUD_DanhMuc {
	
  @Test
  public void TC1_ThemDanhMuc_Success() throws InterruptedException {
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
	  	
	  // click vào trang quản lý danh mục
//	  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/aside[1]/div[2]/nav[1]/div[3]/ul[1]/li[1]/div[1]")).click();
	  driver.get("https://dynasty-admin.vtaan.id.vn/categories");
	  
	  Thread.sleep(2000);
	  
	  // sau đó bấm nút thêm danh mục
	  driver.findElement(By.xpath("//button[contains(text(),'Thêm danh mục')]")).click();
	  
	  Thread.sleep(2000);
	  
	  // Nhập thông tin tên danh mục
	  driver.findElement(By.name("name")).sendKeys("Pizza");
	  
	  // Nhập thứ tự thêm (xóa giá tri măc đinh và nhâp giá tri mới)
	  driver.findElement(By.name("priority")).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE), "5");
	  
	  // click vào button thêm
	  driver.findElement(By.xpath("//button[normalize-space()='Thêm']")).click();
	  
	  Thread.sleep(2000);
	  
//	  driver.close();
	    
  }
  
  @Test
  public void TC2_ThemDanhMuc_Error() throws InterruptedException {
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
	  	
	  // click vào trang quản lý danh mục
//	  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/aside[1]/div[2]/nav[1]/div[3]/ul[1]/li[1]/div[1]")).click();
	  driver.get("https://dynasty-admin.vtaan.id.vn/categories");
	  
	  Thread.sleep(2000);
	  
	  // sau đó bấm nút thêm danh mục
	  driver.findElement(By.xpath("//button[contains(text(),'Thêm danh mục')]")).click();
	  
	  Thread.sleep(2000);
	  
	  // Để rỗng thông tin tên danh mục
	  driver.findElement(By.name("name")).sendKeys("test");
	  
	  // Nhập thứ tự thêm (xóa giá tri măc đinh và nhâp giá tri mới)
	  driver.findElement(By.name("priority")).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE), "-1");
	  
	  // click vào button thêm
	  driver.findElement(By.xpath("//button[normalize-space()='Thêm']")).click();   
	  
	  Thread.sleep(2000);
	  
//	  driver.close();
  }
  
  @Test
  public void TC3_ThemDanhMuc_Empty() throws InterruptedException {
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
	  	
	  // click vào trang quản lý danh mục
//	  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/aside[1]/div[2]/nav[1]/div[3]/ul[1]/li[1]/div[1]")).click();
	  driver.get("https://dynasty-admin.vtaan.id.vn/categories");
	  
	  Thread.sleep(2000);
	  
	  // sau đó bấm nút thêm danh mục
	  driver.findElement(By.xpath("//button[contains(text(),'Thêm danh mục')]")).click();
	  
	  Thread.sleep(2000);
	  
	  // Để rỗng thông tin tên danh mục
	  driver.findElement(By.name("name")).sendKeys("");
	  
	  // Nhập thứ tự thêm (xóa giá tri măc đinh và nhâp giá tri mới)
	  driver.findElement(By.name("priority")).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE), "5");
	  
	  // click vào button thêm
	  driver.findElement(By.xpath("//button[normalize-space()='Thêm']")).click();   
	  
	  Thread.sleep(2000);
	  
//	  driver.close();
  }
  
  @Test
  public void TC4_SuaDanhMuc_Success() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://dynasty-admin.vtaan.id.vn/login");
	  
	  Thread.sleep(2000);
	  
	  	// nhập username
	  driver.findElement(By.name("username")).sendKeys("admin");	

	    //Nhập password
	  driver.findElement(By.name("password")).sendKeys("13112002");
	    
	    // click vào nút login
	  driver.findElement(By.xpath("//button[contains(text(),'Đăng nhập')]")).click();
	  
	  Thread.sleep(2000);
	  	
	  // click vào trang quản lý danh mục
//	  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/aside[1]/div[2]/nav[1]/div[3]/ul[1]/li[1]/div[1]")).click();
	  driver.get("https://dynasty-admin.vtaan.id.vn/categories");
	  
	  Thread.sleep(2000);
	  
	  // sau đó bấm nút sửa danh mục được chọn
	  driver.findElement(By.xpath("//tbody/tr[5]/td[8]/div[1]/div[1]//*[name()='svg']")).click();
	  
	  Thread.sleep(2000);
	  
	  // chỉnh sửa thông tin tên danh mục
	  driver.findElement(By.name("name")).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE), "Test");
	  
	  // sửa thứ tự (xóa giá tri măc đinh và nhâp giá tri mới)
	  driver.findElement(By.name("priority")).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE), "6");
	  
	  // click vào button lưu thông tin đã sửa
	  driver.findElement(By.xpath("//button[contains(text(),'Lưu thay đổi')]")).click();   
	  
	  Thread.sleep(2000);
	  
//	  driver.close();
  }
  
  @Test
  public void TC5_SuaDanhMuc_Empty() throws InterruptedException {
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
	  	
	  // click vào trang quản lý danh mục
//	  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/aside[1]/div[2]/nav[1]/div[3]/ul[1]/li[1]/div[1]")).click();
	  driver.get("https://dynasty-admin.vtaan.id.vn/categories");
	  
	  Thread.sleep(2000);
	  
	  // sau đó bấm nút sửa danh mục
	  driver.findElement(By.xpath("//tbody/tr[5]/td[8]/div[1]/div[1]//*[name()='svg']")).click();
	  
	  Thread.sleep(2000);
	  
	  // Để rỗng thông tin tên danh mục
	  driver.findElement(By.name("name")).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE), "");
	  
	  // Nhập thứ tự sửa (xóa giá tri măc đinh và nhâp giá tri mới)
	  driver.findElement(By.name("priority")).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE), "-1");
	  
	  // click vào button lưu thông tin thay đổi
	  driver.findElement(By.xpath("//button[contains(text(),'Lưu thay đổi')]")).click();   
	  
	  Thread.sleep(2000);
	  
//	  driver.close();
  }
  
  
  @Test
  public void TC6_XoaDanhMuc_Success() throws InterruptedException {
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
	  	
	  // click vào trang quản lý danh mục
//	  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/aside[1]/div[2]/nav[1]/div[3]/ul[1]/li[1]/div[1]")).click();
	  driver.get("https://dynasty-admin.vtaan.id.vn/categories");
	  
	  Thread.sleep(2000);
	  
	  // sau đó bấm nút xóa danh mục
	  driver.findElement(By.xpath("//tbody/tr[5]/td[8]/div[1]/div[2]//*[name()='svg']")).click();
	  
	  Thread.sleep(2000);
	  
	  // click vào button thêm
	  driver.findElement(By.xpath("//button[contains(text(),'Đồng ý')]")).click();   
	  
	  Thread.sleep(2000);
	  
//	  driver.close();
  }  
  
  
}

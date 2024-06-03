package demoTestSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CRUD_ThuocTinh {
	
	@Test
	public void TC1_ThemThuocTinh_Success() throws InterruptedException {
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
		  	
		  // click vào trang quản lý thuộc tính
//		  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/aside[1]/div[2]/nav[1]/div[3]/ul[1]/li[1]/div[1]")).click();
		  driver.get("https://dynasty-admin.vtaan.id.vn/attributes");
		  
		  Thread.sleep(2000);
		  
		  // sau đó bấm nút thêm thuộc tính
		  driver.findElement(By.xpath("//button[contains(text(),'Thêm thuộc tính')]")).click();
		  
		  Thread.sleep(2000);
		  
		  // Nhập thông tin tên thuộc tính
		  driver.findElement(By.name("name")).sendKeys("Test");
		  
		  // click vào button thêm giá trị
		  driver.findElement(By.xpath("//button[contains(text(),'Thêm giá trị')]")).click();
		  
		  // Nhập thông tin tên thuộc tính
		  driver.findElement(By.name("attributeList.0.name")).sendKeys("Test1");
		  
		  // Nhập thông tin tên thuộc tính
		  driver.findElement(By.name("attributeList.0.value")).sendKeys("Test2");
		  
		  // click vào button thêm
		  driver.findElement(By.xpath("//button[normalize-space()='Thêm']")).click();
		  
		  Thread.sleep(2000);
		  
//		  driver.close();
		    
	  }
	
	@Test
	public void TC2_ThemThuocTinh_Empty() throws InterruptedException {
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
		  	
		  // click vào trang quản lý thuộc tính
//		  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/aside[1]/div[2]/nav[1]/div[3]/ul[1]/li[1]/div[1]")).click();
		  driver.get("https://dynasty-admin.vtaan.id.vn/attributes");
		  
		  Thread.sleep(2000);
		  
		  // sau đó bấm nút thêm thuộc tính
		  driver.findElement(By.xpath("//button[contains(text(),'Thêm thuộc tính')]")).click();
		  
		  Thread.sleep(2000);
		  
		  // Nhập thông tin tên thuộc tính
		  driver.findElement(By.name("name")).sendKeys("Test");
		  
		  // click vào button thêm giá trị
		  driver.findElement(By.xpath("//button[contains(text(),'Thêm giá trị')]")).click();
		  
		  // Nhập thông tin tên thuộc tính
		  driver.findElement(By.name("attributeList.0.name")).sendKeys("");
		  
		  // Nhập thông tin tên thuộc tính
		  driver.findElement(By.name("attributeList.0.value")).sendKeys("Test2");
		  
		  // click vào button thêm
		  driver.findElement(By.xpath("//button[normalize-space()='Thêm']")).click();
		  
		  Thread.sleep(2000);
		  
//		  driver.close();
		    
	  }
	
	@Test
	public void TC3_SuaThuocTinh_Success() throws InterruptedException {
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
		  	
		  // click vào trang quản lý thuộc tính
//		  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/aside[1]/div[2]/nav[1]/div[3]/ul[1]/li[1]/div[1]")).click();
		  driver.get("https://dynasty-admin.vtaan.id.vn/attributes");
		  
		  Thread.sleep(2000);
		  
		  // sau đó bấm vào icon sửa thuộc tính đã chọn
		  driver.findElement(By.xpath("//tbody/tr[4]/td[6]/div[1]/div[1]//*[name()='svg']")).click();
		  
		  Thread.sleep(2000);
		  
		  // Nhập thông tin tên thuộc tính
		  driver.findElement(By.name("name")).sendKeys("");
		  
		  // click vào button thêm giá trị
//		  driver.findElement(By.xpath("//button[contains(text(),'Thêm giá trị')]")).click();
		  
		  // Nhập thông tin tên thuộc tính
		  driver.findElement(By.name("attributeList.0.name")).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE), "Viền 1");
		  
		  // Nhập thông tin tên thuộc tính
		  driver.findElement(By.name("attributeList.0.value")).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE), "Viền 2");
		  
		  // click vào button thêm
		  driver.findElement(By.xpath("//button[contains(text(),'Lưu thay đổi')]")).click();
		  
		  Thread.sleep(2000);
		  
//		  driver.close();
		    
	  }
	
	@Test
	public void TC4_SuaThuocTinh_Empty() throws InterruptedException {
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
		  	
		  // click vào trang quản lý thuộc tính
//		  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/aside[1]/div[2]/nav[1]/div[3]/ul[1]/li[1]/div[1]")).click();
		  driver.get("https://dynasty-admin.vtaan.id.vn/attributes");
		  
		  Thread.sleep(2000);
		  
		  // sau đó bấm vào icon sửa thuộc tính đã chọn
		  driver.findElement(By.xpath("//tbody/tr[4]/td[6]/div[1]/div[1]//*[name()='svg']")).click();
		  
		  Thread.sleep(2000);
		  
		  // Nhập thông tin tên thuộc tính
		  driver.findElement(By.name("name")).sendKeys("");
		  
		  // click vào button thêm giá trị
		  driver.findElement(By.xpath("//button[contains(text(),'Thêm giá trị')]")).click();
		  
		  // Nhập thông tin tên thuộc tính
		  driver.findElement(By.name("attributeList.0.name")).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE), "Viền 1");
		  
		  // Nhập thông tin tên thuộc tính
		  driver.findElement(By.name("attributeList.0.value")).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE), "Viền 2");
		  
		  // click vào button thêm
		  driver.findElement(By.xpath("//button[contains(text(),'Lưu thay đổi')]")).click();
		  
		  Thread.sleep(2000);
		  
//		  driver.close();
		    
	  }
	
	@Test
	public void TC5_XoaThuocTinh_Success() throws InterruptedException {
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
		  	
		  // click vào trang quản lý thuộc tính
//		  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/aside[1]/div[2]/nav[1]/div[3]/ul[1]/li[1]/div[1]")).click();
		  driver.get("https://dynasty-admin.vtaan.id.vn/attributes");
		  
		  Thread.sleep(2000);
		  
		  // sau đó bấm vào icon xóa thuộc tính đã chọn
		  driver.findElement(By.xpath("//tbody/tr[4]/td[6]/div[1]/div[2]//*[name()='svg']")).click();
		  
		// sau đó bấm vào đồng ý xóa thuộc tính đã chọn
		  driver.findElement(By.xpath("//button[contains(text(),'Đồng ý')]")).click();
		  
//		  driver.close();
		    
	  }
	
		  
}

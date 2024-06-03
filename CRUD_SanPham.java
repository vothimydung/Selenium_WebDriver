package demoTestSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CRUD_SanPham {
	
	
	@Test
	public void TC1_ThemSanPham_Success() throws InterruptedException {
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
		  	
		  // click vào trang quản lý danh sách sản phẩm
//		  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/aside[1]/div[2]/nav[1]/div[3]/ul[1]/li[1]/div[1]")).click();
		  driver.get("https://dynasty-admin.vtaan.id.vn/products");
		  
		  Thread.sleep(2000);
		  
		  // sau đó bấm nút thêm sản phẩm
		  driver.findElement(By.xpath("//button[contains(text(),'Thêm sản phẩm')]")).click();
		  
		  Thread.sleep(2000);
		  
		  // Nhập thông tin tên sản phẩm
		  driver.findElement(By.name("name")).sendKeys("Pizza");
		  
		  Thread.sleep(2000);
		  
		  // click và icon hiển thị list danh mục sản phẩm
		  driver.findElement(By.xpath("(//*[name()='svg'][@role='presentation'])[3]")).click();
		  Thread.sleep(2000);
		  
		  // chọn danh mục cần thêm
		  List<WebElement> list =driver.findElements(By.xpath("//ul[@data-slot='listbox']/li/span"));
		
		  for (WebElement ele : list)
	       {

	          System.out.println("Values " + ele.getAttribute("innerHTML"));

	          if (ele.getAttribute("innerHTML").contains("Test")) {
	             ele.click();
				  break;
			  }
		  }
		  
		  Thread.sleep(2000);
		  
		// Nhập thông tin tên sản phẩm
		  driver.findElement(By.name("price")).sendKeys("200000");
		  
		// Nhập thông tin tên sản phẩm
		  driver.findElement(By.name("oldPrice")).sendKeys("230000");
		  
		  // click vào button thêm
		  driver.findElement(By.xpath("//button[contains(text(),'Thêm sản phẩm')]")).click();
		  
		  Thread.sleep(2000);
		  
//		  driver.close();
		    
	}
	
	@Test
	public void TC2_ThemSanPham_Empty() throws InterruptedException {
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
		  	
		  // click vào trang quản lý danh sách sản phẩm
//		  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/aside[1]/div[2]/nav[1]/div[3]/ul[1]/li[1]/div[1]")).click();
		  driver.get("https://dynasty-admin.vtaan.id.vn/products");
		  
		  Thread.sleep(2000);
		  
		  // sau đó bấm nút thêm sản phẩm
		  driver.findElement(By.xpath("//button[contains(text(),'Thêm sản phẩm')]")).click();
		  
		  Thread.sleep(2000);
		  
		  // để rỗng thông tin tên sản phẩm
		  driver.findElement(By.name("name")).sendKeys("");
		  
		  Thread.sleep(2000);
		  
		  // click và icon hiển thị list danh mục sản phẩm
		  driver.findElement(By.xpath("(//*[name()='svg'][@role='presentation'])[3]")).click();
		  Thread.sleep(2000);
		  
		  // Chọn danh mục cần thêm
		  List<WebElement> list =driver.findElements(By.xpath("//ul[@data-slot='listbox']/li/span"));
		
		  for (WebElement ele : list)
	       {

	          System.out.println("Values " + ele.getAttribute("innerHTML"));

	          if (ele.getAttribute("innerHTML").contains("Test")) {
	             ele.click();
				  break;
			  }
		  }
		  
		  Thread.sleep(2000);
		  
		// Nhập thông tin tên sản phẩm
		  driver.findElement(By.name("price")).sendKeys("200000");
		  
		// Nhập thông tin tên sản phẩm
		  driver.findElement(By.name("oldPrice")).sendKeys("230000");
		  
		  // click vào button thêm
		  driver.findElement(By.xpath("//button[contains(text(),'Thêm sản phẩm')]")).click();
		  
		  Thread.sleep(2000);
		  
//		  driver.close();
		    
	}
	
	@Test
	public void TC3_SuaSanPham_Success() throws InterruptedException {
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
		  	
		  // click vào trang quản lý danh sách sản phẩm
//		  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/aside[1]/div[2]/nav[1]/div[3]/ul[1]/li[1]/div[1]")).click();
		  driver.get("https://dynasty-admin.vtaan.id.vn/products");
		  
		  Thread.sleep(2000);
		  
		  // sau đó bấm nút sửa sản phẩm
		  driver.findElement(By.xpath("//tbody/tr[2]/td[7]/div[1]/div[1]//*[name()='svg']")).click();
		  
		  Thread.sleep(2000);
		  
		  // sửa thông tin tên sản phẩm
		  driver.findElement(By.name("name")).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE), "Pizza Hải Sản");
		  
		  Thread.sleep(2000);
		  
		  // click và icon hiển thị list danh mục sản phẩm
		  driver.findElement(By.xpath("(//*[name()='svg'][@role='presentation'])[3]")).click();
		  Thread.sleep(2000);
		  
		  // sửa danh mục cần thêm
		  List<WebElement> list =driver.findElements(By.xpath("//ul[@data-slot='listbox']/li/span"));
		
		  for (WebElement ele : list)
	       {

	          System.out.println("Values " + ele.getAttribute("innerHTML"));

	          if (ele.getAttribute("innerHTML").contains("")) {
	             ele.click();
				  break;
			  }
		  }
		  
		  Thread.sleep(2000);
		  
		// sửa thông tin giá sản phẩm
		  driver.findElement(By.name("price")).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE), "230000");
		  
		// sửa thông tin giá cũ sản phẩm
		  driver.findElement(By.name("oldPrice")).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE), "250000");
		  
		  // click vào button lưu thay đổi
		  driver.findElement(By.xpath("//button[contains(text(),'Lưu thay đổi')]")).click();
		  
		  Thread.sleep(2000);
		  
//		  driver.close();
		    
	}
	
	@Test
	public void TC4_SuaSanPham_Empty() throws InterruptedException {
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
		  	
		  // click vào trang quản lý danh sách sản phẩm
//		  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/aside[1]/div[2]/nav[1]/div[3]/ul[1]/li[1]/div[1]")).click();
		  driver.get("https://dynasty-admin.vtaan.id.vn/products");
		  
		  Thread.sleep(2000);
		  
		  // sau đó bấm nút sửa sản phẩm
		  driver.findElement(By.xpath("//tbody/tr[2]/td[7]/div[1]/div[1]//*[name()='svg']")).click();
		  
		  Thread.sleep(2000);
		  
		  // sửa thông tin tên sản phẩm
		  driver.findElement(By.name("name")).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE), "Pizza Hải Sản");
		  
		  Thread.sleep(2000);
		  
		  // click và icon hiển thị list danh mục sản phẩm
		  driver.findElement(By.xpath("(//*[name()='svg'][@role='presentation'])[3]")).click();
		  Thread.sleep(2000);
		  
		  // sửa danh mục cần thêm
		  List<WebElement> list =driver.findElements(By.xpath("//ul[@data-slot='listbox']/li/span"));
		
		  for (WebElement ele : list)
	       {

	          System.out.println("Values " + ele.getAttribute("innerHTML"));

	          if (ele.getAttribute("innerHTML").contains("")) {
	             ele.click();
				  break;
			  }
		  }
		  
		  Thread.sleep(2000);
		  
		// để rỗng thông tin giá sản phẩm
		  driver.findElement(By.name("price")).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE), "");
		  
		// Nhập thông tin giá cũ sản phẩm
		  driver.findElement(By.name("oldPrice")).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE), "250000");
		  
		  // click vào button lưu thay đổi
		  driver.findElement(By.xpath("//button[contains(text(),'Lưu thay đổi')]")).click();
		  
		  Thread.sleep(2000);
		  
//		  driver.close();
		    
	}
	
	@Test
	public void TC5_XoaSanPham_Success() throws InterruptedException {
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
		  	
		  // click vào trang quản lý danh sách sản phẩm
//		  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/aside[1]/div[2]/nav[1]/div[3]/ul[1]/li[1]/div[1]")).click();
		  driver.get("https://dynasty-admin.vtaan.id.vn/products");
		  
		  Thread.sleep(2000);
		  
		  // sau đó bấm nút sửa sản phẩm
		  driver.findElement(By.xpath("//tbody/tr[2]/td[7]/div[1]/div[2]//*[name()='svg']")).click();
		  
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//button[contains(text(),'Đồng ý')]")).click();
		  
//		  driver.close();
		    
	}
  

}

package demoTestSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class KhachHang {
  @Test
  public void XemThongTinKH() throws InterruptedException {
	  
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
	  
	  // di chuyển tới trang quản lý khách hàng
	  driver.get("https://dynasty-admin.vtaan.id.vn/customers");
	  
	  Thread.sleep(2000);
	  
	  // click vào icon xem thông tin KH được chọn
	  driver.findElement(By.xpath("(//*[name()='svg'][@class='w-5 h-5 text-current'])[1]")).click();
	  
	  Thread.sleep(2000);
	  
	// click vào icon xem thông tin KH được chọn
	  driver.findElement(By.xpath("//button[contains(text(),'Đóng')]")).click();
	  
	  
  }
}

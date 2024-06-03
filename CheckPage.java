package demoTestSelenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckPage {

@Test
  public void CheckPageDashboard() throws InterruptedException {
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
	  
       // Chờ cho phần tử "Dashboard" xuất hiện
      WebElement dashboardTitle =  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/aside[1]/div[2]/nav[1]/div[2]/ul[1]/li[1]/div[1]"));

          // Kiểm tra xem phần tử đã được tìm thấy hay không
          if (dashboardTitle.isDisplayed()) {
              System.out.println("Quản lý nhân viên đã được tải thành công sau khi đăng nhập!");
          } else {
              System.out.println("Quản lý nhân viên đã không được tải sau khi đăng nhập!");
          }
      
      
      // Đóng trình duyệt
      driver.quit();
  }
}

package demoTestSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class titlePage {
  @Test
  public void getTitle() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  // Mở trang web
	  driver.get("https://dynasty-admin.vtaan.id.vn/login");
	 
	  //Lấy tiêu đề của trang
	  String title = driver.getTitle();
	  System.out.println("Tiêu đề của trang là: " + title );
	  
//	  //Đóng trình duyệt
//      driver.quit();
	  
  }
}

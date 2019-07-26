import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class Example {
	static WebDriver driver;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {

	
	}


	@Test
	void test() {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\C-PN19\\Downloads\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("http://localhost:8020");
	 driver.manage().window().maximize();
	 driver.findElement(By.xpath("/html/body/div/nav/div/div/ul/li[2]/a")).click();
	 driver.findElement(By.xpath("//*[@id=\"productId\"]")).sendKeys("123");	
	 driver.findElement(By.xpath("//*[@id=\"description\"]")).sendKeys("Analysis");
	 driver.findElement(By.xpath("//*[@id=\"price\"]")).sendKeys("$23");
	 driver.findElement(By.xpath("//*[@id=\"imageUrl\"]")).sendKeys("image");
	 driver.findElement(By.xpath("/html/body/div/div[2]/form/div[5]/button").click();
	 driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	 driver.findElement(By.xpath("/html/body/div/div[1]/nav/div/div/a")).click();
	 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	 driver.close();
	 
	}
	@AfterAll
 public static void signout() {
		
		/*
		 * Select dropdown=new Select(driver.findElement(By.xpath(
		 * "/html/body/div[1]/header/div[8]/details/summary/img")));
		 * dropdown.deselectByVisibleText("Sign out");
		 */
		//driver.findElement(By.xpath("/html/body/div[1]/header/div[8]/details/summary/img")).click();
   // driver.findElement(By.xpath("/html/body/div[1]/header/div[8]/details/details-menu/form/button")).click();
    }
}

package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop_Reg {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("shreyas");
		driver.findElement(By.id("LastName")).sendKeys("rp");
		driver.findElement(By.id("Email")).sendKeys("shreyasrp@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("shre@2001");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("shre@2001");
		driver.findElement(By.id("register-button")).click();
		
		

	}

}

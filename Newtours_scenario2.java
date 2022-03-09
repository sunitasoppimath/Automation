package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Newtours_scenario2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.linkText("Flights")).click();
		driver.findElement(By.xpath("//input[@value='oneway']")).click();
		driver.findElement(By.xpath("(//option[@value='2'])[1]")).click();
		driver.findElement(By.xpath("(//option[@value='London'])[1]")).click();
		driver.findElement(By.xpath("(//option[@value='3'])[2]")).click();
		driver.findElement(By.xpath("(//option[@value='3'])[3]")).click();
		driver.findElement(By.xpath("(//option[@value='New York'])[2]")).click();
		driver.findElement(By.xpath("(//option[@value='4'])[4]")).click();
		driver.findElement(By.xpath("(//option[@value='4'])[5]")).click();
		driver.findElement(By.xpath("//input[@value='Business']")).click();
		driver.findElement(By.xpath("//option[text()='Unified Airlines']"));
		driver.findElement(By.name("findFlights")).click();
		
		
		
	}

}

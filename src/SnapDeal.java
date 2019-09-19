import java.io.File;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.snapdeal.com/");
	WebElement search = driver.findElement(By.id("inputValEnter"));
	search.sendKeys("iphonex");
	driver.findElement(By.xpath("//span[text()='Search']")).click();
	driver.findElement(By.xpath("(//p[contains(text(),'Apple')])[1]")).click();
	Set<String> all = driver.getWindowHandles();
	List<String> li=new ArrayList<>();
	li.addAll(all);
	driver.switchTo().window(li.get(1));
	WebElement e1 = driver.findElement(By.id("buy-button-id"));
	e1.click();
	TakesScreenshot tk=(TakesScreenshot)driver;
	File s = tk.getScreenshotAs(OutputType.FILE);
	System.out.println(s);
	
	
		
	}
	}

	
	
	
	
	
	
	
	



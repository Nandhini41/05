package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {

	public static void main(String[] args) throws Throwable {
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://www.selenium.dev/selenium/docs/api/java/index?overview-summary.html");
	    driver.switchTo().frame("packageListFrame");
	    driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).click();
	    driver.switchTo().defaultContent();
	    driver.switchTo().frame("packageFrame");
	    driver.findElement(By.xpath("//span[text()='WebDriver']")).click();
	    driver.switchTo().defaultContent();
	    driver.switchTo().frame("classFrame");
	    driver.findElement(By.xpath("//a[text()='Help'][1]")).click();
	    Thread.sleep(4000);
	    driver.close();
	    
	    
	}

}

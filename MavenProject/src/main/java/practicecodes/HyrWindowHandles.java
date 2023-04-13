package practicecodes;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyrWindowHandles {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("cookieChoiceDismiss")).click();
		Thread.sleep(2000);
		String h1 = driver.getWindowHandle();
		System.out.println("h1"+h1);
		Thread.sleep(2000);
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("window.scrollBy(0,300);");
		Thread.sleep(2000);
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> handles = driver.getWindowHandles();
		for (String h : handles) {
			System.out.println(h);
			driver.switchTo().window(h);
			if(!h.equals(h1)) {
				driver.findElement(By.id("firstName")).sendKeys("kalpana");
				Thread.sleep(2000);
				driver.close();
			}
		}
		driver.switchTo().window(h1);
		driver.findElement(By.id("name")).sendKeys("Madhu");
		
	}
}

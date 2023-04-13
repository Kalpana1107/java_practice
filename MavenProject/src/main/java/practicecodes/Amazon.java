package practicecodes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();
driver.findElement(By.id("glow-ingress-line1")).click();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
driver.findElement(By.id("GLUXZipUpdateInput")).sendKeys("606201");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.xpath("//input[@aria-labelledby='GLUXZipUpdate-announce']")).click();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("valentine's gift for husband", Keys.ENTER);
driver.findElement(By.xpath("//span[contains(text(), 'Paper Plane Design Valentines Day Gifts')]")).click();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.id("submit.add-to-cart")).click();

}    
	
}


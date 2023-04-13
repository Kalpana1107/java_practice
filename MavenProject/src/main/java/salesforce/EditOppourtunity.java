package salesforce;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditOppourtunity {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("India$321");
		driver.findElement(By.id("Login")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.className("slds-icon-waffle")).click();
		driver.findElement(By.xpath("//button[@class='slds-button']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		driver.findElement(By.xpath("//one-app-nav-bar-item-root[@data-id='0Qk5g0000079gY0CAI']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Salesforce Automation by Kalpana",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-aura-class='forceVirtualAction']")).click();
		Thread.sleep(2000);
		WebElement option = driver.findElement(By.xpath("//div[text()='Edit']"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", option);
		driver.findElement(By.xpath("//input[@name='CloseDate']")).sendKeys("08/13/2022");
		driver.findElement(By.xpath("//button[@aria-label='Stage, --None--']")).click();
		List<WebElement> StageDropDown = driver.findElements(By.xpath("(//span[@class='slds-media__body']//span)"));
		for (WebElement SDD1 : StageDropDown) {
			String Sddtxt = SDD1.getText();
			if (Sddtxt.equals("Perception Analysis"))
				SDD1.click();
		}
		driver.findElement(By.xpath("//button[@aria-label='Delivery/Installation Status, --None--']")).click();
		List<WebElement> DeliverStatus = driver.findElements(By.xpath("//span[@class='slds-media__body']//span"));
		for (WebElement DS : DeliverStatus) {
			String DSText = DS.getText();
			if (DSText.equals("In Progress"))
				DS.click();
		}
		driver.findElement(By.className("slds-textarea")).sendKeys("Salesforce");
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();

	}
}
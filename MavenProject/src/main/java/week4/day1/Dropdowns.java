package week4.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdowns {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		WebElement elementUsername = driver.findElement(By.xpath("//input[@id='username']"));
		elementUsername.sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create")).click();
		WebElement sourceDropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select a = new Select(sourceDropdown);
		a.selectByIndex(1);
		WebElement indusDropdown = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select b = new Select(indusDropdown);
		List<WebElement> options = b.getOptions();
		for (WebElement eachOption : options) {
			System.out.println(eachOption.getText());
		}
	}

}

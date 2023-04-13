package practicecodes;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WashingMachineBooking {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://qtadmin.se/qtbook3b/login.asp?code=1112");
		driver.manage().window().maximize();
		driver.findElement(By.id("user")).sendKeys("0149");
		driver.findElement(By.id("password")).sendKeys("0149");
		driver.findElement(By.xpath("//td[text()='Logga in']")).click();
		driver.findElement(By.xpath("//td[text()='Tvättstuga']")).click();
		driver.findElement(By.xpath("//td[text()='Sköntorpsv. 45 tvätt 1']")).click();
		String m1friday12 = driver.findElement(By.xpath("(//span[text()='12'])[5]")).getAttribute("class");
		String m1friday5 = driver.findElement(By.xpath("(//span[text()='17'])[5]")).getAttribute("class");
		String classN = "pass";
		boolean m1fri12 = m1friday12.equals(classN);
		boolean m1fri5 = m1friday5.equals(classN);
		Thread.sleep(3000);
		if (m1fri12 == true) {
			driver.findElement(By.xpath("(//span[text()='12'])[5]")).click();
			driver.findElement(By.xpath("(//td[text()='Boka'])[2]")).click();
			System.out.println("Fredag 12'o clock slot has been booked successfully in machine 1");
		} else if (m1fri5 == true) {
			driver.findElement(By.xpath("(//span[text()='17'])[5]")).click();
			driver.findElement(By.xpath("(//td[text()='Boka'])[3]")).click();
			System.out.println("Fredag 5PM slot has been booked successfully in machine 1");
		} else {
			System.out.println("No slots in fredag in machine 1");
			Thread.sleep(3000);
			driver.navigate().back();
			driver.findElement(By.xpath("//td[text()='Sköntorpsv. 45 tvätt 2']")).click();
			String m2friday12 = driver.findElement(By.xpath("(//span[text()='12'])[5]")).getAttribute("class");
			String m2friday5 = driver.findElement(By.xpath("(//span[text()='17'])[5]")).getAttribute("class");
			boolean m2fri12 = m2friday12.equals(classN);
			boolean m2fri5 = m2friday5.equals(classN);
			if (m2fri12 == true) {
				driver.findElement(By.xpath("(//span[text()='12'])[5]")).click();
				driver.findElement(By.xpath("(//td[text()='Boka'])[2]")).click();
				System.out.println("Fredag 12'o clock slot has been booked successfully in machine 2");
			} else if (m2fri5 == true) {
				driver.findElement(By.xpath("(//span[text()='17'])[5]")).click();
				driver.findElement(By.xpath("(//td[text()='Boka'])[3]")).click();
				System.out.println("Fredag 5PM slot has been booked successfully in machine 2");
			} else
				System.out.println("no available slots in machine 2");
		}

	}
}

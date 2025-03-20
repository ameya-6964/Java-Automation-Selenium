package AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabledMethodInstagram {
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);		
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");		
		Thread.sleep(3000);
		boolean result = driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
		if (result) {
			System.out.println("Button Is Enabled");
		} else {

			System.out.println("Button Is Not Enabled");
		}
		driver.close();
	}

}

package AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethodFacebook {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		boolean result = driver.findElement(By.name("login")).isEnabled();
		if (result) {
			System.out.println("Button Is Enabled");
		} else {

			System.out.println("Button Is Not Enabled");
		}
		driver.close();
	}

}

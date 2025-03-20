package AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://github.com/ameya-6964");
		Thread.sleep(3000);
		
		boolean result = driver.findElement(By.xpath("//img[@width='260']")).isDisplayed();
		
		if (result) {
			System.out.println("Logo Is Displayed");
		} else {

			System.out.println("Logo Is Not Displayed");
		}
		driver.close();
	}

}

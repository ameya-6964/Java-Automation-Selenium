package AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysMethodExample {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("belvalkar7@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Ameqwd12@12e31");
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		driver.close();

}
}

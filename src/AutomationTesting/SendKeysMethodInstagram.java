package AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysMethodInstagram {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.navigate().to("https://www.instagram.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("abc@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("Ameya@1212");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(., 'Log in')]")).click();
		Thread.sleep(3000);
		driver.close();

}
}

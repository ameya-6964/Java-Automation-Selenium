package AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassAndTagName {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/belwa/OneDrive/Desktop/index.html");
		driver.findElement(By.className("link")).click();
		Thread.sleep(5000);
		driver.close();
	}

}

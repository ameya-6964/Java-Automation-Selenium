package AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValueMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://github.com/ameya-6964");
		
		String value = driver.findElement(By.xpath("//img[@width='260']")).getCssValue("height");
		System.out.println(value);
		Thread.sleep(3000);
		driver.close();
	}

}

package AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://github.com/ameya-6964");
		
		int height = driver.findElement(By.xpath("//img[@width='260']")).getSize().getHeight();
		int width = driver.findElement(By.xpath("//img[@width='260']")).getSize().getWidth();
		System.out.println("Height Is " + height + " px");
		System.out.println("Width Is " + width + " px");
		Thread.sleep(3000);
		driver.close();
	}

}

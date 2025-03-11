package AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.navigate().to("https://www.facebook.com/");
	Thread.sleep(3000);
	driver.findElement(By.partialLinkText("Create a ")).click();
	Thread.sleep(3000);
	driver.close();
}
}

package AutomationTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	Thread.sleep(3000);
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.navigate().to("file:///C:/Users/belwa/OneDrive/Desktop/index.html");
	driver.findElement(By.id("yt")).click();
	Thread.sleep(3000);
 	driver.navigate().back();
	driver.findElement(By.id("fk")).click();
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().forward();
	Thread.sleep(3000);
	driver.navigate().refresh();
	Thread.sleep(5000);
	driver.quit();
	}
}

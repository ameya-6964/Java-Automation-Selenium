package AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://github.com/ameya-6964");
		
		int xAxis = driver.findElement(By.xpath("//img[@width='260']")).getRect().getX();
		int yAxis = driver.findElement(By.xpath("//img[@width='260']")).getRect().getY();
		int height =  driver.findElement(By.xpath("//img[@width='260']")).getRect().getHeight();
		int width =  driver.findElement(By.xpath("//img[@width='260']")).getRect().getWidth();
		
		
		System.out.println("Height : " + height);
		System.out.println("Width  : " + width);
		System.out.println("X Axis : " + xAxis);
		System.out.println("Y Axis : " + yAxis);
		Thread.sleep(3000);
		driver.close();
	}
}

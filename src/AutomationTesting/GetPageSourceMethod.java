package AutomationTesting;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceMethod {
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		String data = driver.getPageSource();
		System.out.println(data);
		Thread.sleep(5000);
		driver.close();	
	}
}

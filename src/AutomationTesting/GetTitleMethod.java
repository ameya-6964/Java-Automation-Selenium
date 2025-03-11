package AutomationTesting;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(5000);
		driver.close();
	}
}

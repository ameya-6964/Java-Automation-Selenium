package AutomationTesting;

import org.openqa.selenium.edge.EdgeDriver;

public class GetCurrentUrlMethod {

	public static void main(String[] args) throws InterruptedException {
		
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com");
		String url=driver.getCurrentUrl();
		System.out.println(url);
	
		Thread.sleep(5000);
		driver.close();
		
		
		
	}
}

package appweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebappTest {
	
	@Test
	public void loginTest() {
		WebDriver driver=new ChromeDriver();
		sleep(1);
		//open url
		String url="http://localhost:9090/webapp_1/";
		driver.get(url);
		sleep(1);
		driver.manage().window().maximize();
		sleep(1);
		
		
		//Username enter
		WebElement username=driver.findElement(By.name("userName"));
		username.sendKeys("admin");
		//Password enter
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("admin");
		//login button
		WebElement login=driver.findElement(By.xpath("/html/body/form/center/table/tbody/tr[3]/td[1]/input"));
		login.click();
		driver.close();
		System.out.println("Test Finished");
	}

	private void sleep(int seconds) {
		try {
			Thread.sleep(seconds*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

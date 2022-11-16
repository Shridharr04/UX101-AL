import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GoogleTest {

	
	@Test
	public void Homepage() throws MalformedURLException
	{
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com/");
		d.findElement(By.name("q")).click();
		
		d.findElement(By.name("q")).sendKeys("myntra",Keys.ENTER);
		System.out.println(d.getTitle());
		
		
	}
}

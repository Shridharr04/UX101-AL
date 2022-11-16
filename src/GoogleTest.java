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
		DesiredCapabilities  cap =new DesiredCapabilities();
		
		cap.setBrowserName("MicrosoftEdge");
		
		WebDriver d=new RemoteWebDriver(new URL("http://192.168.0.109:4444"),cap);
		d.get("https://www.google.com/");
		d.findElement(By.name("q")).click();
		
		d.findElement(By.name("q")).sendKeys("myntra",Keys.ENTER);
		System.out.println(d.getTitle());
		
		
	}
}

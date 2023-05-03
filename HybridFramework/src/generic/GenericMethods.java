package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class GenericMethods implements FrameworkConstant
{
	public WebDriver driver;
	@BeforeMethod
	public void OpenApp()
	{
		System.setProperty(gecko_key, gecko_value);
		driver=new FirefoxDriver();
		driver.get(URL);
	}
	
	@AfterMethod
	public void CloseApp()
	{
		driver.close();
	}
}

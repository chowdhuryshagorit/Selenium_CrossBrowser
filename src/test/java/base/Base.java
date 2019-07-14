package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;

public class Base {
	
	public WebDriver driver;
	
	public String url;
	private String bName;
	@Parameters("Browser")
	public  WebDriver getDriver() throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream ("C:\\Users\\chowd\\eclipse-workspace\\Selenium_CrossBrowser\\resources\\data.properties");
		prop.load(fis);
		bName = prop.getProperty("browser");
		url = prop.getProperty("url");
		System.out.println(bName);
		
		if(bName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			driver= new ChromeDriver();
			}
		
		else if (bName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./Brow/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		//else if (bName.equalsIgnoreCase("IE")) {
			////System.setProperty("webdriver.ie.driver", "");
			//driver=new InternetexplorerDriver();
		//}
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
		
		
		return driver;
		
		
		
	}
	

}

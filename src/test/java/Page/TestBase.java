package Page;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase 
{
	public static WebDriver driver;
	public Properties p;
	
	@BeforeClass
	@Parameters({"browser"})
	public void setUp(String browser) throws IOException
	{
		        //Loading config.properties file
				FileReader file=new FileReader("./src//test//resources//config.properties");
				p=new Properties();
				p.load(file);
				
				//browser
				switch(browser.toLowerCase())
				{
				case "chrome": 
					WebDriverManager.chromedriver().setup(); 
					driver = new ChromeDriver();
					break;
					
				case "edge": 
					WebDriverManager.edgedriver().setup(); 
					driver = new EdgeDriver(); 
					break;
					
				case "firefox": 
					WebDriverManager.firefoxdriver().setup(); 
					driver = new FirefoxDriver();
					
				default: 
					System.out.println("No matching browser"); return;
				}
				
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				driver.get(p.getProperty("appUrl"));                                    // reading url from properties file.
				driver.manage().window().maximize();
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}

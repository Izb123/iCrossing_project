package bridgestoneTires;


import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;



public class TireSizesPage {
	
	
	static By sizeone= By.xpath("//a [contains(text(),'275/40R22')]");
static WebDriver driver; 
	public static WebDriver init () {
		System.setProperty("webdriver.gecko.driver", "driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.bridgestonetire.com/size/");

		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_UP).build().perform();
		System.out.print(driver.getTitle()+ "  " + driver.getCurrentUrl());
		return driver;
	}
	
	
	public  void Size27540R22 () {
		
		driver.get("https://www.bridgestonetire.com/size/22-inch/");
		driver.manage().window().maximize();
		JavascriptExecutor Jse = (JavascriptExecutor)driver;
		driver.manage().window().maximize();
		
		Jse.executeScript("window(scrollBy(0,700);");
		driver.findElement(sizeone).click();
		
	}

}

package tiresdiameterpages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Inches_21 {
	WebDriver driver;

	 public Inches_21 (WebDriver driver) {
		 this.driver = driver ;
		 
		
	 }

	 @FindBy (how = How.XPATH, using= "//a [@href=\"/size/21-inch/\"]")WebElement TUENTY_ONE_INCHES;
	
	 
	@FindBy (how = How.XPATH, using= "//a [contains(text(),'275/30R21')]")WebElement size_275_30R21;
	@FindBy (how = How.XPATH, using= "//a [contains(text(),'275/35R21')]")WebElement size_275_35R21;
	@FindBy (how = How.XPATH, using= "//a [contains(text(),'275/40R21')]")WebElement size_275_40R21;
	@FindBy (how = How.XPATH, using= "/html/body/div[1]/div/div[2]/div/div/div[3]/ul/li[4]/a")WebElement size_275_45R21;
	@FindBy (how = How.XPATH, using= "//a [contains(text(),'265/35R21')]")WebElement size_265_35R21;
	@FindBy (how = How.XPATH, using= "//a [contains(text(),'265/40R21')]")WebElement size_265_40R21;
	@FindBy (how = How.XPATH, using= "//a [contains(text(),'255/40R21')]")WebElement size_255_40R21;
	@FindBy (how = How.XPATH, using= "//a [contains(text(),'245/35R21')]")WebElement size_245_35R21;
	@FindBy (how = How.XPATH, using= "//a [contains(text(),'325/30R21')]")WebElement size_325_30R21;
	@FindBy (how = How.XPATH, using= "//a [contains(text(),'315/35R21')]")WebElement size_315_35R21;
	@FindBy (how = How.XPATH, using= "//a [contains(text(),'295/35R21')]")WebElement size_295_35R21;
	@FindBy (how = How.XPATH, using= "//a [contains(text(),'295/40R21')]")WebElement size_295_40R21;
	@FindBy (how = How.XPATH, using= "//a [contains(text(),'285/30R21')]")WebElement size_285_30R21;
	@FindBy (how = How.XPATH, using= "//a [contains(text(),'285/40R21')]")WebElement size_285_40R21;
	 
	public void Clickc_on_21_Inches () {

		TUENTY_ONE_INCHES.click();	
		
		
		
	}
	public void clickon_size_275_30_R211() throws InterruptedException {
		JavascriptExecutor Jse = (JavascriptExecutor)driver;
		Jse.executeScript("window.scrollBy(0,700);");
		
		Thread.sleep(300);

		size_275_30R21.click();
	}

	public void clickon_size_275_35_R21() throws InterruptedException {
		JavascriptExecutor Jse = (JavascriptExecutor)driver;
		Jse.executeScript("window.scrollBy(0,700);");
		
		Thread.sleep(100);

		size_275_35R21.click();
	}
	public void clickon_size_275_40_R21() throws InterruptedException {
		JavascriptExecutor Jse = (JavascriptExecutor)driver;
		Jse.executeScript("window.scrollBy(0,700);");
		
		Thread.sleep(100);

		size_275_40R21.click();
	}
	public void clickon_size_275_45_R21() throws InterruptedException {
		JavascriptExecutor Jse = (JavascriptExecutor)driver;
		Jse.executeScript("window.scrollBy(0,700);");
		
		Thread.sleep(500);

		size_275_45R21.click();
	}
	public void clickon_size_265_35_R21() throws InterruptedException {
		JavascriptExecutor Jse = (JavascriptExecutor)driver;
		Jse.executeScript("window.scrollBy(0,700);");
		
		Thread.sleep(500);

		size_265_35R21.click();
		
	}
	public void clickon_size_265_40_R21() throws InterruptedException {
		JavascriptExecutor Jse = (JavascriptExecutor)driver;
		Jse.executeScript("window.scrollBy(0,700);");
		
		Thread.sleep(200);

		size_265_40R21.click();
	}
	public void clickon_size_255_40_R21() throws InterruptedException {
		JavascriptExecutor Jse = (JavascriptExecutor)driver;
		Jse.executeScript("window.scrollBy(0,700);");
		
		Thread.sleep(200);

		size_255_40R21.click();
	}
	

	public void clickon_size_245_35_R21() throws InterruptedException {
		JavascriptExecutor Jse = (JavascriptExecutor)driver;
		Jse.executeScript("window.scrollBy(0,700);");
		
		Thread.sleep(300);

		size_245_35R21.click();
	}

	public void clickon_size_325_30_R21() throws InterruptedException {
		JavascriptExecutor Jse = (JavascriptExecutor)driver;
		Jse.executeScript("window.scrollBy(0,900);");
		
		Thread.sleep(100);

		size_325_30R21.click();
	}
	public void clickon_size_315_35_R21() throws InterruptedException {
		JavascriptExecutor Jse = (JavascriptExecutor)driver;
		Jse.executeScript("window.scrollBy(0,900);");
		
		Thread.sleep(100);

		size_315_35R21.click();
	}
	public void clickon_size_295_35_R21() throws InterruptedException {
		JavascriptExecutor Jse = (JavascriptExecutor)driver;
		Jse.executeScript("window.scrollBy(0,700);");
		
		Thread.sleep(500);

		size_295_35R21.click();
	}
	public void clickon_size_295_40_R21() throws InterruptedException {
		JavascriptExecutor Jse = (JavascriptExecutor)driver;
		Jse.executeScript("window.scrollBy(0,700);");
		
		Thread.sleep(500);

		size_295_40R21.click();
	}
	public void clickon_size_285_30_R21() throws InterruptedException {
		JavascriptExecutor Jse = (JavascriptExecutor)driver;
		Jse.executeScript("window.scrollBy(0,900);");
		
		Thread.sleep(200);

		size_285_30R21.click();
	}
	public void clickon_size_285_40_R21() throws InterruptedException {
		JavascriptExecutor Jse = (JavascriptExecutor)driver;
		Jse.executeScript("window.scrollBy(0,700);");
		
		Thread.sleep(200);

		size_285_40R21.click();
	}
	


}

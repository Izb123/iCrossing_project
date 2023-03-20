package tiresdiameterpages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class Inches_22 {

WebDriver driver;

 public Inches_22 (WebDriver driver) {
	 this.driver = driver ;
	 
	
 }

 @FindBy (how = How.XPATH, using= "//a [@href=\"/size/22-inch/\"]")WebElement TUENTY_two;

@FindBy (how = How.XPATH, using= "//a [contains(text(),'275/40R22')]")WebElement size275_40R22;
@FindBy (how = How.XPATH, using= "//a [contains(text(),'275/45R22')]")WebElement size_275_45R22;
@FindBy (how = How.XPATH, using= "//a [contains(text(),'275/50R22')]")WebElement size_275_50R22;
@FindBy (how = How.XPATH, using= "//a [contains(text(),'265/40R22')]")WebElement size_265_40R22;
@FindBy (how = How.XPATH, using= "//a [contains(text(),'265/50R22')]")WebElement size_265_50R22;
@FindBy (how = How.XPATH, using= "//a [contains(text(),'285/35R22')]")WebElement size_285_35R22;
@FindBy (how = How.XPATH, using= "//a [contains(text(),'285/45R22')]")WebElement size_285_45R22;
 
public void Clickclickmontuenttwo () {

	TUENTY_two.click();	
	
	
	
}
public void clickon_size_275_40_R22() throws InterruptedException {
	JavascriptExecutor Jse = (JavascriptExecutor)driver;
	Jse.executeScript("window.scrollBy(0,700);");
	
	Thread.sleep(300);

	size275_40R22.click();
}

public void clickon_size_275_45_R22() throws InterruptedException {
	JavascriptExecutor Jse = (JavascriptExecutor)driver;
	Jse.executeScript("window.scrollBy(0,700);");
	
	Thread.sleep(100);

	size_275_45R22.click();
}
public void clickon_size_275_50_R22() throws InterruptedException {
	JavascriptExecutor Jse = (JavascriptExecutor)driver;
	Jse.executeScript("window.scrollBy(0,700);");
	
	Thread.sleep(100);

	size_275_50R22.click();
}
public void clickon_size_265_40_R22() throws InterruptedException {
	JavascriptExecutor Jse = (JavascriptExecutor)driver;
	Jse.executeScript("window.scrollBy(0,700);");
	
	Thread.sleep(500);

	size_265_40R22.click();
}
public void clickon_size_265_50_R22() throws InterruptedException {
	JavascriptExecutor Jse = (JavascriptExecutor)driver;
	Jse.executeScript("window.scrollBy(0,700);");
	
	Thread.sleep(500);

	size_265_50R22.click();
}
public void clickon_size_285_35_R22() throws InterruptedException {
	JavascriptExecutor Jse = (JavascriptExecutor)driver;
	Jse.executeScript("window.scrollBy(0,700);");
	
	Thread.sleep(200);

	size_285_35R22.click();
}
public void clickon_size_285_45_R22() throws InterruptedException {
	JavascriptExecutor Jse = (JavascriptExecutor)driver;
	Jse.executeScript("window.scrollBy(0,700);");
	
	Thread.sleep(200);

	size_285_45R22.click();
}

}
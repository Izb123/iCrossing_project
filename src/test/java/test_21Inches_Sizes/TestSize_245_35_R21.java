package test_21Inches_Sizes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import bridgestoneTires.TireSizesPage;
import tiresdiameterpages.Inches_21;

public class TestSize_245_35_R21 {
	WebDriver driver; 
	@BeforeTest
	public void UserSouldBeAbleToto_Click_on21_Inches() {
		driver= TireSizesPage.init();
		Inches_21 Tuenttwoinches = PageFactory.initElements(driver,Inches_21.class );
		Tuenttwoinches.Clickc_on_21_Inches();
	}

	@Test
public void UsershoudbeableToclickon_size_245_35_R21 () throws InterruptedException {

	
	Inches_21 size35R21 = PageFactory.initElements(driver,Inches_21.class );
	size35R21.clickon_size_245_35_R21();
	
	driver.close();
	}
}

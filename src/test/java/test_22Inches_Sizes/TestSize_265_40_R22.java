package test_22Inches_Sizes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import bridgestoneTires.TireSizesPage;
import tiresdiameterpages.Inches_22;

public class TestSize_265_40_R22 {
	WebDriver driver; 
	@BeforeTest
	public void UserSouldBeAbleToto_Click_on22_Inches() {
		driver= TireSizesPage.init();
		Inches_22 Tuenttwoinches = PageFactory.initElements(driver,Inches_22.class );
		Tuenttwoinches.Clickclickmontuenttwo();
	}

	@Test
public void UsershoudbeableToclickon_size_265_40_R22 () throws InterruptedException {

	
	Inches_22 size40R22 = PageFactory.initElements(driver,Inches_22.class );
	size40R22.clickon_size_265_40_R22();
	driver.close();
	}
}

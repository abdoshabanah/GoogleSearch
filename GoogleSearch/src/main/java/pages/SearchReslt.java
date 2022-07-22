package pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchReslt extends PageBase{

	public SearchReslt(WebDriver driver){
		super(driver);

	}


	@FindBy(xpath = "//*[@id=\"logo\"]/img")
	WebElement Logo;
	
	@FindBy(name = "q")
	WebElement Result_1;

	public void Results() throws InterruptedException {

		assertTrue(Logo.isDisplayed());
		
		
	}

}

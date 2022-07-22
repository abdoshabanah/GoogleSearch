package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{

	public HomePage(WebDriver driver){
		super(driver);
		
	}
	
	
	@FindBy(name  = "q")
	WebElement SearchBox;
	
	@FindBy(name = "btnK")
	WebElement SearchBTN;
	
	
	
	public void Search (String Data) throws InterruptedException {
		
		SearchBox.sendKeys(Data);
		Thread.sleep(200);
		SearchBTN.click();
		Thread.sleep(2000);
		
	}
	
}

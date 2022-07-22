package tests;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.ExcelReader;
import pages.HomePage;
import pages.SearchReslt;

public class SearchTest extends TestBase{
	@DataProvider(name = "SearchData")
	public Object [][] SearchData() throws IOException {

		ExcelReader ER = new ExcelReader();
		return ER.SearchData();
	}

	HomePage homeObject;
	SearchReslt SearchObject;

	@Test(dataProvider = "SearchData")
	public void Search(String Data) throws InterruptedException {
		homeObject = new HomePage(driver);
		homeObject.Search(Data);
		
		SearchObject = new SearchReslt(driver);
		SearchObject.Results();
		
	}
}

package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC003_Createlead";
		testCaseName = "TC003_Createlead";
		testDescription = "To Test Create Lead";
		category= "Smoke";
		authors	="";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void createLead(String userName, String passWord ,String firstName,String lastName,String companyName) {
		
		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCrmsfa()
		.clickLeadsTab()
		.clickCreateLead()
		.enterFirstName(firstName)
		.enterlastName(lastName)
		.entercompanyName(companyName)
		.clickCreateleadButton();
		
		
		
		
		
		
		
		
	}

}

package pages;


import org.openqa.selenium.remote.RemoteWebDriver;

import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods{
	
	public ViewLeadPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);		
		if(!verifyTitle("View Lead | opentaps CRM")) {
			reportStep("this is not View Lead Page", "FAIL");
		}		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

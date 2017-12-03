package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods{

	public CreateLeadPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;

		PageFactory.initElements(driver, this);		
		if(!verifyTitle("Create Lead | opentaps CRM")) {
			reportStep("this is not CreateLead Page", "FAIL");
		}		
	}
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCompanyName;
	public CreateLeadPage entercompanyName(String companyName) {
		type(eleCompanyName, companyName);
		return this;

	}
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFirstName;

	public CreateLeadPage enterFirstName(String firstName) {
		type(eleFirstName, firstName);
		return this;

	}

	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLastName;

	public CreateLeadPage enterlastName(String lastName) {
		type(eleLastName, lastName);
		return this;

	}
	@FindBy(how=How.ID,using="createLeadForm_firstNameLocal")
	private WebElement elefirstNameLocal;
	public CreateLeadPage enterFirstNameLocal(String firstNameLocal) {
		type(elefirstNameLocal,firstNameLocal);
		return this;

	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastNameLocal")
	private WebElement elelastNameLocal;
	public CreateLeadPage enterLastNameLocal(String lastNameLocal) {
		type(elelastNameLocal,lastNameLocal);
		return this;

	}

    @FindBy(how=How.ID,using="createLeadForm_dataSourceId")
    private WebElement elesource;
	public CreateLeadPage selectSource(String source) {
		selectDropDownUsingText(elesource, source);
		return this;
	
	}
	@FindBy(how=How.NAME,using="submitButton")
	private WebElement eleSubmitButton;
	public ViewLeadPage clickCreateleadButton() {
		click(eleSubmitButton);
		return new ViewLeadPage(driver, test);
	}


















}

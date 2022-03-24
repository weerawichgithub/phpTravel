package test;

import Driver.Driver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.ListernersTestNG;
import utilities.PropertiesReader;
import utilities.commonMethods;

@Listeners(ListernersTestNG.class)
public class PTV001_FrontEnd_LoginTesting extends commonMethods{

	@BeforeClass
	public void beforeTest() {
		//Go to phpTravel
		Driver.getDriver();

	}
	@Test
	public void test() {
		System.out.println("phpTravel testCase");
		//Login with valid username and password
		//commPage.customerLink.click();
		//waitForVisibility(custPage.usernameLoginInput);

		custPage.usernameLoginInput.sendKeys(PropertiesReader.getProperty("customerEmail"));
		custPage.passwordLoginInput.sendKeys(PropertiesReader.getProperty("customerPassword"));
		custPage.loginButton.click();

		//Web page should navigate to homepage ,The default page is Dashboard Tab ,
		//so user can view Dashboard information in this page (ie. Quick lauch bar)
//		Assert.assertEquals(dashTab.dashboardLabel.getText(),"Dashboard");
//		Assert.assertEquals(dashTab.quickLaunchLabel.getText(),"Quick Launch");

		//User should be able to click on Welcome user icon at the corner.
//		comPage.welcomeIcon.click();
//		Assert.assertEquals(comPage.welcomeIcon.getText().substring(0,7),"Welcome");
//		//Click on logout
//		comPage.logoutLink.click();

	}
}

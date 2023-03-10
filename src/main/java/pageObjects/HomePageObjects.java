package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class HomePageObjects extends TestBase {
	// only page objects + respective methods

	@CacheLookup
	@FindBy(id = "nav_automobile")
	WebElement link_automobile;

	@CacheLookup
	@FindBy(id = "nav_truck")
	WebElement link_truck;

	@CacheLookup
	@FindBy(id = "nav_camper")
	WebElement link_camper;

	@CacheLookup
	@FindBy(id = "nav_motorcycle")
	WebElement link_motorcycle;

	// constructor - to use initElement method
	public HomePageObjects() {
		PageFactory.initElements(driver, this);
	}

	// for click on motorcycle link on homepage
	public void clickOnMotorCycleLink() {
		System.out.println(driver);
		link_motorcycle.click();
	}
}

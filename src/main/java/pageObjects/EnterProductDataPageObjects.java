package pageObjects;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class EnterProductDataPageObjects extends TestBase {

	@CacheLookup
	@FindBy(id = "startdate")
	WebElement date_startdate;

	@CacheLookup
	@FindBy(id = "insurancesum")
	WebElement dd_insurancesum;

	@CacheLookup
	@FindBy(id = "damageinsurance")
	WebElement dd_damageinsurance;

	// optional products
	@CacheLookup
	@FindBy(xpath = "//input[@name='Optional Products[]']/parent::label")
	List<WebElement> chk_optionalProducts;

	@CacheLookup
	@FindBy(id = "nextselectpriceoption")
	WebElement btn_Next;

	// init
	public EnterProductDataPageObjects() {
		PageFactory.initElements(driver, this);
	}

	public void enterProductData(HashMap<String, String> testData) throws Exception {
		date_startdate.sendKeys(testData.get("Product_startdate").toString());
		cm.selectDropdownOption(dd_insurancesum, testData.get("Product_insurancesum"));
		cm.selectDropdownOption(dd_damageinsurance, testData.get("Product_damageinsurance"));
		cm.selectCheckBoxes(chk_optionalProducts, testData.get("Product_OptionalProducts"));

	}

	public void clickOnNextButton() {
		btn_Next.click();
	}
}

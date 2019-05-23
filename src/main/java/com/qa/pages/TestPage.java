package com.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.base.TestBase;
import com.qa.testUtils.TestUtils;

public class TestPage extends TestBase {

	@FindBy(xpath = "//input[@id='Email']")
	WebElement email;

	@FindBy(xpath = "//input[@id='Password']")
	WebElement password;

	@FindBy(xpath = "//input[@id='btnsubmit']")
	WebElement signIn;

	@FindBy(xpath = "//i[contains(@class,'fa fa-close fa-2x close-btn close-popUp')]")
	WebElement crossPopup;

	@FindBy(xpath = "//span[contains(text(),'Welcome Nikita Shah')]")
	WebElement welcomeText;

	@FindBy(xpath = "//span[contains(text(),'Personal Documents')]")
	WebElement personalDocuments;

	@FindBy(xpath = "//a[contains(text(),'License')]")
	WebElement license;

	@FindBy(xpath = "//span[contains(@id,'uploadImg')]")
	WebElement customImage;

	@FindBy(xpath = "//td[contains(text(),'Name:')]/input[@name='textbox']")
	WebElement name;

	@FindBy(xpath = "//span[contains(text(),' FADV Documents')]//parent::a[contains(@class,'data-expand')]")
	WebElement document;

	@FindBy(xpath = "//a[contains(text(),'Background Check Form (BGC)')]")
	WebElement bgc;

	@FindBy(xpath = "//td[contains(text(),'Last:')]/input[@name='textbox']")
	WebElement last;

	@FindBy(xpath = "//td[contains(text(),'Given:')]//following-sibling::td/input")
	WebElement given;

	@FindBy(xpath = "//td[contains(text(),'Date of Birth')]//following-sibling::td/input[@name='date']")
	WebElement dateOfBirth;

	@FindBy(xpath = "//select[@name='Gender']")
	WebElement gender;

	@FindBy(xpath = "//td[contains(text(),'Email Address')]//following-sibling::td/input")
	WebElement emailValue;

	@FindBy(xpath = "//td[contains(text(),'Identity Type')]//following-sibling::td/input")
	WebElement identityType;

	@FindBy(xpath = "//td[contains(text(),'Number:')]//following-sibling::td/input")
	WebElement number;

	@FindBy(xpath = "//td[contains(text(),'Photocopy attached:' )]/input[@name='checkbox']")
	WebElement photoCopy;

	@FindBy(xpath = "//td[contains(text(),'Position applied for:' )]//following-sibling::td/input")
	WebElement positionApplied;

	@FindBy(xpath = "//td[contains(text(),'City/Country:' )]//following-sibling::td/input")
	WebElement city;

	@FindBy(xpath = "//strong[contains(text(),'Candidate name:')]//following-sibling::input")
	WebElement candidateName;

	@FindBy(xpath = "//strong[contains(text(),'Candidate name:')]//parent::td//following-sibling::td/input")
	WebElement candidateDate;

	@FindBy(xpath = "//strong[contains(text(),'Supplier contact name:')]//following-sibling::input")
	WebElement supplierContact;

	@FindBy(xpath = "//strong[contains(text(),'Supplier contact name:')]//parent::td//following-sibling::td/input")
	WebElement supplierContactDate;

	@FindBy(xpath = "//strong[contains(text(),'Supplier Company Name: ')]//parent::td//following-sibling::td/input")
	WebElement supplierCompanyname;

	@FindBy(xpath = "//input[contains(@value,' Click Here to Submit')]")
	WebElement submit;

	@FindBy(xpath = "//div[contains(@class,'avatar-container')]")
	WebElement profileButton;

	@FindBy(xpath = "//a[@id='editProfile']/i")
	WebElement profilePic;

	@FindBy(xpath = "//select[contains(@data-handler,'selectMonth')]")
	WebElement selectMonth;

	@FindBy(xpath = "//select[contains(@data-handler,'selectYear')]")
	WebElement selectYear;

	@FindBy(xpath = "//a[contains(text(),'16')]")
	WebElement selectDate;

	@FindBy(xpath = "//span[contains(text(),'Choose File')]")
	WebElement uploadFile;

	@FindBy(xpath = "//input[@id='UploadProfileBtn']")
	WebElement uploadProfile;

	public TestPage() {
		PageFactory.initElements(driver, this);
	}

	public void login() {
		TestUtils.waitForElementToBeDisplayed(email, 30);
		email.sendKeys(prop.getProperty("email"));

		TestUtils.waitForElementToBeDisplayed(password, 30);
		password.sendKeys(prop.getProperty("password"));

		TestUtils.waitForElementToBeClickable(signIn, 30);
		signIn.click();

	}

	public void getTitle() {
		TestUtils.waitForElementToBeClickable(crossPopup, 60);
		crossPopup.click();

		try {
			welcomeText.isDisplayed();
			System.out.println("User is on home page");
		} catch (Exception e) {
			Assert.fail("user is not on home page");
		}
	}

	public void openBgcForm() {
		TestUtils.waitForElementToBeClickable(document, 60);
		Actions action = new Actions(driver);
		Action click = action.click(document).build();
		click.perform();
		TestUtils.waitForElementToBeClickable(bgc, 60);
		bgc.click();
	}

	public void enterDetails() {
		TestUtils.waitForElementToBeDisplayed(name, 60);
		name.clear();
		name.sendKeys("Sourabh");
		last.clear();
		last.sendKeys("Agrawal");
		given.clear();
		given.sendKeys("Yes");
		dateOfBirth.click();

		Select dobmonth = new Select(selectMonth);
		dobmonth.selectByVisibleText("Jul");

		Select dobYear = new Select(selectYear);
		dobYear.selectByVisibleText("1995");

		selectDate.click();

		Select value = new Select(gender);
		value.selectByVisibleText("Male");

		emailValue.clear();
		emailValue.sendKeys("sourabh.agrawal200.sa@gmail.com");

		identityType.clear();
		identityType.sendKeys("Aadhar");

		number.clear();
		number.sendKeys("470067548956");

		photoCopy.click();
		photoCopy.click();

		positionApplied.clear();
		positionApplied.sendKeys("Associate Consultant");

		city.clear();
		city.sendKeys("Pune");

		candidateName.clear();
		candidateName.sendKeys("Sourabh Agrawal");

		candidateDate.click();

		Select canmonth = new Select(selectMonth);
		canmonth.selectByVisibleText("May");

		Select canYear = new Select(selectYear);
		canYear.selectByVisibleText("2019");

		selectDate.click();

		supplierContact.clear();
		supplierContact.sendKeys("Annwesa Basu");

		supplierContactDate.click();

		Select supmonth = new Select(selectMonth);
		supmonth.selectByVisibleText("May");

		Select supYear = new Select(selectYear);
		supYear.selectByVisibleText("2019");

		selectDate.click();

		supplierCompanyname.clear();
		supplierCompanyname.sendKeys("Capgemini");

		submit.click();

	}

	public void clickProfile() {
		TestUtils.waitForElementToBeClickable(profileButton, 60);
		profileButton.click();
	}

	public void uploadProfile() throws AWTException, InterruptedException {
		TestUtils.waitForElementToBeClickable(profilePic, 300);

		profilePic.click();

		TestUtils.waitForElementToBeClickable(uploadFile, 60);

		uploadFile.click();

		StringSelection sel = new StringSelection("D:\\Camera\\IMG_20161021_093302.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);

		Robot robo = new Robot();

		robo.delay(250);
		robo.keyPress(KeyEvent.VK_ENTER);

		robo.keyRelease(KeyEvent.VK_ENTER);
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_CONTROL);

		robo.keyPress(KeyEvent.VK_ENTER);

		robo.delay(150);

		robo.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(5000);

		TestUtils.waitForElementToBeClickable(uploadProfile, 60);
		uploadProfile.click();

	}

}

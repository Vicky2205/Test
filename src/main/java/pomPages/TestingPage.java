package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {

	@FindBy(xpath="(//a[text()='Selenium Training'])[2]")
	private WebElement seleniumtrainning;
	
	@FindBy(id="cartArea")
	private WebElement cartarea;
	
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement facebookicon;
	
	
	public TestingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getSeleniumtrainning() {
		return seleniumtrainning;
	}

	public WebElement getCartarea() {
		return cartarea;
	}

	public WebElement getFacebookicon() {
		return facebookicon;
	}

	public void Seleniumtrainingbtn() {
		seleniumtrainning.click();
	}
	
	public void cartAreabtn() {
		cartarea.click();
	}
	 
	public void facebookiconbtn() {
		facebookicon.click();
	}
	
}

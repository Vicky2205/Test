package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Whishlistpage {
	@FindBy(xpath="//div[@class='play-icon']")
	private WebElement playbtn;
	
	
	@FindBy(xpath="//div[@class='pause-icon']")
	private WebElement pausebtn;
	
	@FindBy(xpath="//span[text()='Add To Wishlist']")
	private WebElement addtowhishlist;
	
	
	
	public Whishlistpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void playvideobtn() {
		playbtn.click();
	}
	
	public void pausevideobtn() {
		pausebtn.click();
	}
	
	public void addtowhishlishbtn() {
		addtowhishlist.click();
	}
	
}

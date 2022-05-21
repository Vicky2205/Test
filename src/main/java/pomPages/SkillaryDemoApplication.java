package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillaryDemoApplication 
{
   @FindBy(id="course")
   private WebElement coursebtn; 
   
   public WebElement getCourseadd() {
	return courseadd;
}

@FindBy(name="addresstype")
   private WebElement courseadd;
   
   @FindBy(xpath="//a[text()='Selenium Training']")
   private WebElement seleniumtrainingbtn;
   
   
   public SkillaryDemoApplication(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }


public WebElement getCoursebtn() {
	return coursebtn;
}

public void seleniumtraining() {
	   seleniumtrainingbtn.click();
}
}
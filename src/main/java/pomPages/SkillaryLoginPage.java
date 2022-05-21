package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillaryLoginPage 
{
    @FindBy(xpath="//a[text()=' GEARS ']")
    private WebElement gerbtn;
    
    @FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
    private WebElement skillarydemoappbtn;
    
    public SkillaryLoginPage(WebDriver driver) {
    	PageFactory.initElements(driver,this);
    }
    
    
    public void gearsbtn() {
    	gerbtn.click();
    }
    
    public void SkillaryDemoApplication() {
    	skillarydemoappbtn.click();
    }
    
}

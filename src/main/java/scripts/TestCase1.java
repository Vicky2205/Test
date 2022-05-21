package scripts;

import org.testng.annotations.Test;

import genericlibrary.BaseClass;
import pomPages.AddToCart;
import pomPages.SkillaryDemoApplication;
import pomPages.SkillaryLoginPage;

public class TestCase1 extends BaseClass{
	
	@Test
	public void tc1() {
		SkillaryLoginPage s =new SkillaryLoginPage(driver);
		s.gearsbtn();
		s.SkillaryDemoApplication();
		
		SkillaryDemoApplication d= new SkillaryDemoApplication(driver);
		
		driverutilities.switchTabs(driver);
		driverutilities.mousehover(driver, d.getCoursebtn());
		d.seleniumtraining();
		
		AddToCart a=new AddToCart(driver);
		driverutilities.doubleClick(driver, a.getAddbtn());
		a.Addtocartbutton();
		driverutilities.alertPopup(driver);
		
	}

}

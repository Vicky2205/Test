package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericlibrary.BaseClass;
import pomPages.SkillaryDemoApplication;
import pomPages.SkillaryLoginPage;
import pomPages.TestingPage;

public class TestCase2 extends BaseClass {

	
	@Test
	private void tc2() throws IOException, InterruptedException {
	
		SkillaryLoginPage s =new SkillaryLoginPage(driver);
		s.gearsbtn();
		s.SkillaryDemoApplication();
		
		
		SkillaryDemoApplication sd=new SkillaryDemoApplication(driver);
		driverutilities.switchTabs(driver);
		driverutilities.dropDown(sd.getCourseadd(),p.getPropertyFileData("courseadd"));
		
		
		TestingPage t=new TestingPage(driver);{
			driverutilities.dragAndDrop(driver, t.getSeleniumtrainning(), t.getCartarea());
			Point fb = t.getFacebookicon().getLocation();
			int x=fb.getX();
			int y=fb.getY();
			
			Thread.sleep(3000);
			
			driverutilities.scrollbar(driver, x, y);
			t.facebookiconbtn();
			
		}
	
	}
}

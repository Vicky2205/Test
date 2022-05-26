package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericlibrary.BaseClass;
import pomPages.CorejavaforSeleniumpage;
import pomPages.SkillaryDemoApplication;
import pomPages.SkillaryLoginPage;
import pomPages.Whishlistpage;

public class TestCase3 extends BaseClass{
	
	@Test
	public void tc3() throws IOException, InterruptedException {
		
		SkillaryLoginPage s=new SkillaryLoginPage(driver);
		s.searchforcoursebutton(p.getPropertyFileData("name"));
		s.searchbutton();
		
		CorejavaforSeleniumpage cj=new CorejavaforSeleniumpage(driver);
		
		cj.corejavapage();
	
		Whishlistpage w=new Whishlistpage(driver);
		driverutilities.switchFrames(driver);
		
		Thread.sleep(3000);
		
		w.playvideobtn();
		
		Thread.sleep(3000);
		
		
		w.pausevideobtn();
		driverutilities.switchbackframe(driver);
		
		w.addtowhishlishbtn();
		
		
		
		
	}

}

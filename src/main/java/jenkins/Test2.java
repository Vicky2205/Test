package jenkins;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
	
	@Test
	public void tc4() {
		Reporter.log("Hello SQL",true);
	}

}

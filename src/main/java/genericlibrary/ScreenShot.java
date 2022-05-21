package genericlibrary;

import java.io.File;
import java.util.Date;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot 
{
    public void getScreenShot(WebDriver driver, String name) throws IOException 
    {
    	Date d= new Date();
    	String currentdate = d.toString().replaceAll(":","-");
    	
    	TakesScreenshot ts =(TakesScreenshot) driver;
    	 File src = ts.getScreenshotAs(OutputType.FILE);
    	
    	 File dest=new File(Autoconstant.photoPath + currentdate+ name + ".png");
    	 FileUtils.copyFile(src, dest);
    }
}

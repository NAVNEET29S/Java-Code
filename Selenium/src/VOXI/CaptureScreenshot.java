package VOXI;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshot {
	
	public void Screenshot(WebDriver driver)
	{
		
		//CaptureScreenshot x = new CaptureScreenshot();
		
	File srcFile  =	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	try {
		
		FileUtils.copyFile(srcFile, new File("C:/Users/SinghN3/eclipse-workspace/Selenium1/Screenshot"+"_"+System.currentTimeMillis()+".png"));
		}
	catch (IOException e) {
		
		e.printStackTrace();
	} 
	}
	
	
	public String FormatDate()
	{
		Date date = new Date();
//		System.out.println("Date object" + "="+ date);
//		System.out.println("date.getTime"+ "="+ date.getTime());
		SimpleDateFormat formatter = new SimpleDateFormat("DD-MM-YY HH:MM:SS");
	String currentDateTimeFormat=	formatter.format(date);
	System.out.println("currentDateTimeInFormat ="+ currentDateTimeFormat);
	return currentDateTimeFormat;
		
	}
}

	
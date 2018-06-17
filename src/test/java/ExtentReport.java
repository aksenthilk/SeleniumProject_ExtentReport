

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {
	//Author is Senthil
	//invoking TestNG from pom in Maven
	//Download and Add the "maven-surefire-plugin" and "maven-compiler-plugin" inside the <build> tag in pom.xml
	//Check if the "<suiteXmlFile>testng.xml</suiteXmlFile>" is present in Surefire plugin code
	//run the pom.xml as Maven test.
	@Test
	public static void Extent_Reporting() throws IOException{
		ExtentHtmlReporter report = new ExtentHtmlReporter("./Reporter/SenExtentReport.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(report);
        ExtentTest logger = extent.createTest("LoginTest");
        logger.log(Status.INFO, "Login to Senthil");
        logger.log(Status.PASS, "Verified");
        
       extent.flush();//flush the report.write the report that we wrote.
    	System.out.println( "Hello World! to test Extent report" );
    	
    	ExtentTest logger2 = extent.createTest("JustTest");
    	logger2.log(Status.FAIL,"Title verified");
    	
    	//screenshot attached manually
    	
			logger2.addScreenCaptureFromPath("G:\\Elementmage.png");
		
    	
    	extent.flush();
   }
		
	}



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClassTwo {
	//created to execute the test parallelly
		//includes classOne also
	// <suite><Test><classes><methods>
	//<classes>
	//<methods>
	//<include name = "firstTestCase"></include>
	//<include name = "SEcondTestCAse"></nclude>
	//</Methods>
	
	
	
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("I am in beforemethod - class2");
	}
	
	
	@Test
	public void testone(){
		System.out.println("I am in testone - class2");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("I am in beforemethod - class2");
	}

}

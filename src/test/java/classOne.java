import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class classOne {
	//created to execute the test parallelly
	//includes ClassTwo also
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("I am in beforemethod - class1");
	}
	
	
	@Test
	public void testone(){
		System.out.println("I am in testone  - class1");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("I am in beforemethod  - class1");
	}

}

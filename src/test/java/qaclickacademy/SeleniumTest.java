package qaclickacademy;

import org.testng.annotations.Test;

public class SeleniumTest {

	//testng xml file from Maven
	// how to execute all test cases from Test folder  - mvn test
	@Test
	public void BrowserAUtomation()
	{
		System.out.println("BrowserAUtomation");
		System.out.println("Web AUtomation");	
		System.out.println("UI AUtomation");	
	}
	@Test
	public void elementsUi()
	{
		System.out.println("elementsUi");	
	}
	
	@Test
	public void images()
	{
		System.out.println("images");	
	}
	
}

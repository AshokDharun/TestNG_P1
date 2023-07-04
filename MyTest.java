package listners;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyListnerClass.class)
public class MyTest 
{
	@Test
public void test1()
{
	System.out.println("test sucessfully");
}
	@Test(enabled = false)
public void test2()
{
	WebDriver driver = null;
	driver.get("www.google.com");
		System.out.println("test 2 sucessfully");
}
}

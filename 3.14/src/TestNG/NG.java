package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NG 
{
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("this is Ram");
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("this is Ram method");
	}
	@Test(priority=2,invocationCount=2)
	public void testa()
	{
		System.out.println("this is test1");
	}
	@Test(priority=1,dependsOnMethods = {"testa"})
	public void testA()
	{
		System.out.println("this is test2");
	}
	@AfterMethod
	public void aftermetho()
	{
		System.out.println("this is after hava");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("this is the End for new START");
	}

}

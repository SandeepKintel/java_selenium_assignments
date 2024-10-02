package assignments;

import org.testng.annotations.Test;

public class Asg119_InvocationCountandPriority 
{
	@Test(priority=2)
	void TC01()
	{
		System.out.println("TestCase One");
		
	}
	
	@Test(priority=1)
	void TC04()
	{
		System.out.println("TestCase Four");
		
	}
	
	@Test(invocationCount=3, priority=3)
	void TC02()
	{
		System.out.println("TestCase Two");
		
	}
	
	@Test(invocationCount=2, priority=4)
	void TC03()
	{
		System.out.println("TestCase Three");
		
	}

}

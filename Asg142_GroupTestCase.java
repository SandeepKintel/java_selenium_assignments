package assignments;

import org.testng.annotations.Test;

public class Asg142_GroupTestCase 
{
	@Test(groups= {"smoke"})
	public void Tcaseone()
	{
		System.out.println("Test case smoke one");
	}
	
	@Test(groups= {"smoke"})
	public void Tcase2()
	{
		System.out.println("Test case smoke two");
	}
	
	@Test(groups= {"smoke"})
	public void Tcase3()
	{
		System.out.println("Test case smoke third");
	}
	
	@Test(groups= {"smoke"})
	public void Tcase1()
	{
		System.out.println("Test case one");
	}
	
	@Test(groups= {"regression"})
	public void Tcase4()
	{
		System.out.println("Test case regression one");
	}
	
	@Test(groups= {"regression"})
	public void Tcase5()
	{
		System.out.println("Test case regression two");
	}
	
	@Test(groups= {"system"})
	public void Tcase6()
	{
		System.out.println("Test case system one");
	}
	
	@Test(groups= {"system"})
	public void Tcase7()
	{
		System.out.println("Test case system one");
	}
	


}

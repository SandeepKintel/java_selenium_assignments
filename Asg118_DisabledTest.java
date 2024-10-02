package assignments;

import org.testng.annotations.Test;

public class Asg118_DisabledTest 
{
	@Test
	void Tescase01()
	{
		System.out.println("test case one");
	}
	
	@Test(enabled=false)
	void Tescase02()
	{
		System.out.println("test case two");
	}
	
	@Test
	void Tescase03()
	{
		System.out.println("test case three");
	}

}

package it.unical.ingsw.MavenFirstTestingsw;

import static org.junit.Assert.assertEquals;

import org.junit.*;
//import org.junit.Assert.assertEquals;
import org.junit.Test;

public class MyMathTest 
{
	private MyMath math = new MyMath();

	/*@Test
	public void simpleFibonacciTest()
	{
		MyMath math = new MyMath();
		assertEquals(5, math.fibonacci(4));
	}*/
	//ogni test case sarà eseguita su una istanza separata.. se metti static a mymathtest crea soo 1 istanza
	@Test
	public void exitConditionsFibonacciTest()
	{
		assertEquals(1, math.fibonacci(0));
		assertEquals(1, math.fibonacci(1));
		System.out.println("aaaaaaa");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void illegalArgumentTest()
	{
		System.out.println("bbbbbbb");
		math.fibonacci(-1);
		
	}
	
	@Before
	public void prepare()
	{
		System.out.println("before");
	}
	
	@AfterClass
	public static void cleanUp() // deve essere di tipo statico
	{
		System.out.println("afterrrr");
	}
	
}

package it.unical.ingsw.MavenFirstTestingsw;

import org.junit.Test;

public class MyMathPerformanceTest {

	private MyMath m = new MyMath();
	
	@Test(timeout = 1) // passi il timeout in millisecondi
	public void performanceTest1()
	{
		m.fibonacci(10);
	}
}

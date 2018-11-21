package it.unical.ingsw.MavenFirstTestingsw;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class) //per dirgli che è una suite
@SuiteClasses({MyMathTest.class, MyMathPerformanceTest.class}) //classi che ne fanno parte
public class MyMathTestSuite {

	
}

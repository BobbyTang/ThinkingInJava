package com.github.bobby.junit;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ NormalTest.class })
public class AllTests {
	
	/*public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());
		// $JUnit-BEGIN$
		suite.addTestSuite(NormalTest.class);//��Ӳ��Ե��� ,������TestCase������
		// $JUnit-END$
		return suite;
	}*/

}

package com.github.bobby.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class NormalTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("ִֻ��һ��");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("ִֻ��һ��");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("ÿ�ε���test������ִ��һ��");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("ÿ�ε���test������ִ��һ��");
	}
	
	@Test(timeout=1000)
	public void testTimeout(){
		try {
			Thread.sleep(1200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("NormalTest.normalTest()");
	}

	@Test(expected=Exception.class)
	public void testExpectedException() throws Exception{
		System.out.println("NormalTest.expectedExceptionTest()");
		throw new Exception();
	}
	
}

package com.vj.test.test3;

import mockit.Mock;
import mockit.MockUp;
import mockit.Mockit;

import org.junit.After;
import org.junit.Test;

public class TestCase {
	
	@Test
	public void testMockStaticMethod() throws Exception{
		System.out.println(Utils.getFormatStr());
		new MockUp<Utils>(){
			@Mock
			public String getFormatStr() throws Exception {
				return "Other Format: dd-mm-YYYY";
			}
		};
		System.out.println(Utils.getFormatStr());
	}
	
	@After
	public void tearDown(){
		Mockit.tearDownMocks();
	}

}

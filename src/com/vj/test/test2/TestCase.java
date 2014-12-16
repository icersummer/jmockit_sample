package com.vj.test.test2;

import org.junit.Test;
import mockit.MockUp;
import mockit.Mock;
import mockit.Mockit;
public class TestCase {

	@Test
	public void testSth() throws Exception{
		IService service = new MockUp<IService>(){
			// 需要mock哪个方法就只写哪个方法的mock实现，其它方法都可以忽略
			@Mock
			public void doSth(){
				System.out.println("this is mock implement");
			}
		}.getMockInstance();
		// 调用mock方法
		service.doSth();
		// 最后做还原动作，确保用例之间不相互影响，也可以放到test case的teardown方法中
		Mockit.tearDownMocks();
	}
}

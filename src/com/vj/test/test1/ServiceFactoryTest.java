package com.vj.test.test1;

import mockit.Mock;
import mockit.MockClass;
import mockit.Mockit;

import org.junit.Assert;
import org.junit.Test;

public class ServiceFactoryTest {

	@Test
	public void should_return_mock_service() {
		Mockit.setUpMock(ServiceFactory.class, ServiceFactoryStub.class);
		Assert.assertEquals("mock service", ServiceFactory.getAService());
	}

	@MockClass(realClass = ServiceFactory.class)
	private static class ServiceFactoryStub {
		@Mock
		public static String getAService() {
			return "mock service";
		}
	}
}

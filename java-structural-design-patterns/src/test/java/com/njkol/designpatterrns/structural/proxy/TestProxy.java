package com.njkol.designpatterrns.structural.proxy;

import org.junit.jupiter.api.Test;

public class TestProxy {

	@Test
	public void testProxy() {
		Internet intConn = new InternetProxy();
		try {
			intConn.connectTo("java2novice.com");
			intConn.connectTo("adult-site.com");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

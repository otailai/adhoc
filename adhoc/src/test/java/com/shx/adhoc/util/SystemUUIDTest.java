package com.shx.adhoc.util;

import org.junit.Test;

public class SystemUUIDTest {
	
	@Test
	public void createUuidX16() {
		for (int i = 0; i < 10; i++) {
			String uuid = SystemUUIDUtil.createUUId();
			System.out.println(uuid);
		}
	}
}

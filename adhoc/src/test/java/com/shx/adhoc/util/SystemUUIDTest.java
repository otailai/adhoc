package com.shx.adhoc.util;

import org.junit.Test;

import com.shx.adhoc.util.impl.SystemUUIDUtilImpl;

public class SystemUUIDTest {
	
	@Test
	public void createUuidX16() {
		SystemUUIDUtilImpl uuidImpl = new SystemUUIDUtilImpl();
		for (int i = 0; i < 10; i++) {
			String uuid = uuidImpl.createUuidX16().toString();
			System.out.println(uuid);
		}
	}
}

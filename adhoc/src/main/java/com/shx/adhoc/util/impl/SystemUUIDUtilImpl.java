package com.shx.adhoc.util.impl;

import java.util.UUID;

import com.shx.adhoc.util.SystemUUIDUtil;

public class SystemUUIDUtilImpl implements SystemUUIDUtil{

	public String createUuidX16() {
			UUID uuid = UUID.randomUUID();
			return uuid.toString();
	}
}

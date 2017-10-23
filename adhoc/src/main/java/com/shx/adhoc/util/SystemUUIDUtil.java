package com.shx.adhoc.util;

import java.util.Random;
import java.util.UUID;

public class SystemUUIDUtil {
	//创建16位纯数字的UUID
	public static String createUUId() {
		  int first = new Random(10).nextInt(8) + 1;
		  int hashCodeV = UUID.randomUUID().toString().hashCode();
		  if (hashCodeV < 0) {
			  //有可能是负数
			  hashCodeV = -hashCodeV;
		  }
		  return first + String.format("%015d", hashCodeV);
	}
}

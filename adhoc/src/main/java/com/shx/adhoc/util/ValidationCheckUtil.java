package com.shx.adhoc.util;

import java.sql.Timestamp;

public interface ValidationCheckUtil {

	//check the validation of country
	public boolean checkCountry(String country); 
		
	//check the validation of region
	public boolean checkRegion(String region);
	
	//check the validation of city
	public boolean checkCity(String city);
	
	//check the validation of datbi
	public boolean checkDatbi(Timestamp datbi);
}

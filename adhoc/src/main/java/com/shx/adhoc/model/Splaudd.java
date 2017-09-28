package com.shx.adhoc.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "SPLAUDD")
@Entity
public class Splaudd {
	
	@Id
	private String guid_splaudd;
	
	private String guid_splaud;
	
	private String guid_tspl;

	public String getGuid_splaudd() {
		return guid_splaudd;
	}

	public void setGuid_splaudd(String guid_splaudd) {
		this.guid_splaudd = guid_splaudd;
	}

	public String getGuid_splaud() {
		return guid_splaud;
	}

	public void setGuid_splaud(String guid_splaud) {
		this.guid_splaud = guid_splaud;
	}

	public String getGuid_tspl() {
		return guid_tspl;
	}

	public void setGuid_tspl(String guid_tspl) {
		this.guid_tspl = guid_tspl;
	}

	@Override
	public String toString() {
		return "Splaudd [guid_splaudd=" + guid_splaudd + ", guid_splaud=" + guid_splaud + ", guid_tspl=" + guid_tspl
				+ "]";
	}
	
}

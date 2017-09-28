package com.shx.adhoc.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "SPLAUDK")
@Entity
public class Splaudk {

	@Id
	private String guid_splaudk;
	
	private String guid_splaud;
	
	private String ernam;
	
	private Timestamp crtsp;
	
	private BigDecimal sequence;
	
	private String comment;

	public String getGuid_splaudk() {
		return guid_splaudk;
	}

	public void setGuid_splaudk(String guid_splaudk) {
		this.guid_splaudk = guid_splaudk;
	}

	public String getGuid_splaud() {
		return guid_splaud;
	}

	public void setGuid_splaud(String guid_splaud) {
		this.guid_splaud = guid_splaud;
	}

	public String getErnam() {
		return ernam;
	}

	public void setErnam(String ernam) {
		this.ernam = ernam;
	}

	public Timestamp getCrtsp() {
		return crtsp;
	}

	public void setCrtsp(Timestamp crtsp) {
		this.crtsp = crtsp;
	}

	public BigDecimal getSequence() {
		return sequence;
	}

	public void setSequence(BigDecimal sequence) {
		this.sequence = sequence;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "Splaudk [guid_splaudk=" + guid_splaudk + ", guid_splaud=" + guid_splaud + ", ernam=" + ernam
				+ ", crtsp=" + crtsp + ", sequence=" + sequence + ", comment=" + comment + "]";
	}
	
}

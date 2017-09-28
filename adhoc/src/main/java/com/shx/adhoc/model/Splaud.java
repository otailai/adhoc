package com.shx.adhoc.model;

import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "SPLAUD")
@Entity
public class Splaud {
	@Id
	private String guid_splaud;
	
	private String ernam;
	
	private Timestamp crtsp;
	
	private String aenam;
	
	private Timestamp chtsp;
	
	private Date spl_chk_date;
	
	private String partner;
	
	private BigDecimal sequence;
	
	private String spl_res_system;
	
	private String spl_res_user;
	
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



	public String getAenam() {
		return aenam;
	}



	public void setAenam(String aenam) {
		this.aenam = aenam;
	}



	public Timestamp getChtsp() {
		return chtsp;
	}



	public void setChtsp(Timestamp chtsp) {
		this.chtsp = chtsp;
	}



	public Date getSpl_chk_date() {
		return spl_chk_date;
	}



	public void setSpl_chk_date(Date spl_chk_date) {
		this.spl_chk_date = spl_chk_date;
	}



	public String getPartner() {
		return partner;
	}



	public void setPartner(String partner) {
		this.partner = partner;
	}



	public BigDecimal getSequence() {
		return sequence;
	}



	public void setSequence(BigDecimal sequence) {
		this.sequence = sequence;
	}



	public String getSpl_res_system() {
		return spl_res_system;
	}



	public void setSpl_res_system(String spl_res_system) {
		this.spl_res_system = spl_res_system;
	}



	public String getSpl_res_user() {
		return spl_res_user;
	}



	public void setSpl_res_user(String spl_res_user) {
		this.spl_res_user = spl_res_user;
	}

	@Override
	public String toString() {
		return "But [guid_splaud=" + guid_splaud + ", ernam=" + ernam + ", crtsp=" + crtsp + ", aenam=" + aenam
				+ ", chtsp=" + chtsp + ", spl_chk_date=" + spl_chk_date + ", partner=" + partner + ", sequence="
				+ sequence + ", spl_res_system=" + spl_res_system + ", spl_res_user=" + spl_res_user + "]";
	}
}

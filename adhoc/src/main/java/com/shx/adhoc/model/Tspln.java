package com.shx.adhoc.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "TSPLN")
@Entity
public class Tspln {

	@Id
	private String guid_tspln;
	
	private String guid_tspl;
	
	private BigDecimal launr;
	
	private String ernam;
	
	private Timestamp crtsp;
	
	private String aenam;
	
	private Timestamp chtsp;
	
	private Timestamp datbi;
	
	private Timestamp datab;
	
	private String spl_name;
	
	private String spl_pass_country;
	
	private String spl_pass_name;

	public String getGuid_tspln() {
		return guid_tspln;
	}

	public void setGuid_tspln(String guid_tspln) {
		this.guid_tspln = guid_tspln;
	}

	public String getGuid_tspl() {
		return guid_tspl;
	}

	public void setGuid_tspl(String guid_tspl) {
		this.guid_tspl = guid_tspl;
	}

	public BigDecimal getLaunr() {
		return launr;
	}

	public void setLaunr(BigDecimal launr) {
		this.launr = launr;
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

	public Timestamp getDatbi() {
		return datbi;
	}

	public void setDatbi(Timestamp datbi) {
		this.datbi = datbi;
	}

	public Timestamp getDatab() {
		return datab;
	}

	public void setDatab(Timestamp datab) {
		this.datab = datab;
	}

	public String getSpl_name() {
		return spl_name;
	}

	public void setSpl_name(String spl_name) {
		this.spl_name = spl_name;
	}

	public String getSpl_pass_country() {
		return spl_pass_country;
	}

	public void setSpl_pass_country(String spl_pass_country) {
		this.spl_pass_country = spl_pass_country;
	}

	public String getSpl_pass_name() {
		return spl_pass_name;
	}

	public void setSpl_pass_name(String spl_pass_name) {
		this.spl_pass_name = spl_pass_name;
	}

	@Override
	public String toString() {
		return "Tspln [guid_tspln=" + guid_tspln + ", guid_tspl=" + guid_tspl + ", launr=" + launr + ", ernam=" + ernam
				+ ", crtsp=" + crtsp + ", aenam=" + aenam + ", chtsp=" + chtsp + ", datbi=" + datbi + ", datab=" + datab
				+ ", spl_name=" + spl_name + ", spl_pass_country=" + spl_pass_country + ", spl_pass_name="
				+ spl_pass_name + "]";
	}
	
}

package com.shx.adhoc.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "TSPLA")
@Entity
public class Tspla {

	@Id
	private String guid_tspla;
	
	private String guid_tspl;
	
	private BigDecimal launr;
	
	private String ernam;
	
	private Timestamp crtsp;
	
	private String aenam;
	
	private Timestamp chtsp;
	
	private Timestamp datbi;
	
	private Timestamp datab;
	
	private String spl_country;
	
	private String spl_region;
	
	private String spl_city;
	
	private String spl_street;
	
	private String spl_building;
	
	private String spl_housenumber;
	
	private String spl_roomnumber;
	
	private String spl_post_code;
	
	private String spl_po_country;
	
	private String spl_po_region;
	
	private String spl_po_city;

	public String getGuid_tspla() {
		return guid_tspla;
	}

	public void setGuid_tspla(String guid_tspla) {
		this.guid_tspla = guid_tspla;
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

	public String getSpl_country() {
		return spl_country;
	}

	public void setSpl_country(String spl_country) {
		this.spl_country = spl_country;
	}

	public String getSpl_region() {
		return spl_region;
	}

	public void setSpl_region(String spl_region) {
		this.spl_region = spl_region;
	}

	public String getSpl_city() {
		return spl_city;
	}

	public void setSpl_city(String spl_city) {
		this.spl_city = spl_city;
	}

	public String getSpl_street() {
		return spl_street;
	}

	public void setSpl_street(String spl_street) {
		this.spl_street = spl_street;
	}

	public String getSpl_building() {
		return spl_building;
	}

	public void setSpl_building(String spl_building) {
		this.spl_building = spl_building;
	}

	public String getSpl_housenumber() {
		return spl_housenumber;
	}

	public void setSpl_housenumber(String spl_housenumber) {
		this.spl_housenumber = spl_housenumber;
	}

	public String getSpl_roomnumber() {
		return spl_roomnumber;
	}

	public void setSpl_roomnumber(String spl_roomnumber) {
		this.spl_roomnumber = spl_roomnumber;
	}

	public String getSpl_post_code() {
		return spl_post_code;
	}

	public void setSpl_post_code(String spl_post_code) {
		this.spl_post_code = spl_post_code;
	}

	public String getSpl_po_country() {
		return spl_po_country;
	}

	public void setSpl_po_country(String spl_po_country) {
		this.spl_po_country = spl_po_country;
	}

	public String getSpl_po_region() {
		return spl_po_region;
	}

	public void setSpl_po_region(String spl_po_region) {
		this.spl_po_region = spl_po_region;
	}

	public String getSpl_po_city() {
		return spl_po_city;
	}

	public void setSpl_po_city(String spl_po_city) {
		this.spl_po_city = spl_po_city;
	}

	@Override
	public String toString() {
		return "Tspla [guid_tspla=" + guid_tspla + ", guid_tspl=" + guid_tspl + ", launr=" + launr + ", ernam=" + ernam
				+ ", crtsp=" + crtsp + ", aenam=" + aenam + ", chtsp=" + chtsp + ", datbi=" + datbi + ", datab=" + datab
				+ ", spl_country=" + spl_country + ", spl_region=" + spl_region + ", spl_city=" + spl_city
				+ ", spl_street=" + spl_street + ", spl_building=" + spl_building + ", spl_housenumber="
				+ spl_housenumber + ", spl_roomnumber=" + spl_roomnumber + ", spl_post_code=" + spl_post_code
				+ ", spl_po_country=" + spl_po_country + ", spl_po_region=" + spl_po_region + ", spl_po_city="
				+ spl_po_city + "]";
	}
	
}

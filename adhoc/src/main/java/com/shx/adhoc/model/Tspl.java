package com.shx.adhoc.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "TSPL")
@Entity
public class Tspl {

	@Id
	private String guid_tspl;
	
	private String ernam;
	
	private Timestamp crtsp;
	
	private String aenam;
	
	private Timestamp chtsp;
	
	private String lgreg;
	
	private String spl_list_type;
	
	private String spl_provider;
	
	private String spl_data_ref_id;
	
	private Timestamp datbi;
	
	private Timestamp datab;
	
	private String spl_entity_type;

	public String getGuid_tspl() {
		return guid_tspl;
	}

	public void setGuid_tspl(String guid_tspl) {
		this.guid_tspl = guid_tspl;
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

	public String getLgreg() {
		return lgreg;
	}

	public void setLgreg(String lgreg) {
		this.lgreg = lgreg;
	}

	public String getSpl_list_type() {
		return spl_list_type;
	}

	public void setSpl_list_type(String spl_list_type) {
		this.spl_list_type = spl_list_type;
	}

	public String getSpl_provider() {
		return spl_provider;
	}

	public void setSpl_provider(String spl_provider) {
		this.spl_provider = spl_provider;
	}

	public String getSpl_data_ref_id() {
		return spl_data_ref_id;
	}

	public void setSpl_data_ref_id(String spl_data_ref_id) {
		this.spl_data_ref_id = spl_data_ref_id;
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

	public String getSpl_entity_type() {
		return spl_entity_type;
	}

	public void setSpl_entity_type(String spl_entity_type) {
		this.spl_entity_type = spl_entity_type;
	}

	@Override
	public String toString() {
		return "Tspl [guid_tspl=" + guid_tspl + ", ernam=" + ernam + ", crtsp=" + crtsp + ", aenam=" + aenam
				+ ", chtsp=" + chtsp + ", lgreg=" + lgreg + ", spl_list_type=" + spl_list_type + ", spl_provider="
				+ spl_provider + ", spl_data_ref_id=" + spl_data_ref_id + ", datbi=" + datbi + ", datab=" + datab
				+ ", spl_entity_type=" + spl_entity_type + "]";
	}
	
}

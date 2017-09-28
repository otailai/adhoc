package com.shx.adhoc.model;

public class MasterCriteria {

	private String lgreg;
	
	private String spl_list_type;
	
	private String spl_provider;
	
	private String spl_data_ref_id;

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

	public MasterCriteria(String lgreg, String spl_list_type, String spl_provider, String spl_data_ref_id) {
		super();
		this.lgreg = lgreg;
		this.spl_list_type = spl_list_type;
		this.spl_provider = spl_provider;
		this.spl_data_ref_id = spl_data_ref_id;
	}
	
	
}

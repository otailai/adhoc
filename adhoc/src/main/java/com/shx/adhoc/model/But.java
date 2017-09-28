package com.shx.adhoc.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "BUT")
@Entity
public class But {
	
	@Id
	private String partner;
	
	private String title;
	
	private String name;
	
	private String country;
	
	private String region;
	
	private String city;
	
	private String street;
	
	private String building;
	
	private String housenumber;
	
	private String roomnumber;
	
	private String language;
	
	private String post_code;
	
	private String po_country;
	
	private String po_region;
	
	private String po_city;

	public String getPartner() {
		return partner;
	}

	public void setPartner(String partner) {
		this.partner = partner;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public String getHousenumber() {
		return housenumber;
	}

	public void setHousenumber(String housenumber) {
		this.housenumber = housenumber;
	}

	public String getRoomnumber() {
		return roomnumber;
	}

	public void setRoomnumber(String roomnumber) {
		this.roomnumber = roomnumber;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getPost_code() {
		return post_code;
	}

	public void setPost_code(String post_code) {
		this.post_code = post_code;
	}

	public String getPo_country() {
		return po_country;
	}

	public void setPo_country(String po_country) {
		this.po_country = po_country;
	}

	public String getPo_region() {
		return po_region;
	}

	public void setPo_region(String po_region) {
		this.po_region = po_region;
	}

	public String getPo_city() {
		return po_city;
	}

	public void setPo_city(String po_city) {
		this.po_city = po_city;
	}

	@Override
	public String toString() {
		return "But [partner=" + partner + ", title=" + title + ", name=" + name + ", country=" + country + ", region="
				+ region + ", city=" + city + ", street=" + street + ", building=" + building + ", housenumber="
				+ housenumber + ", roomnumber=" + roomnumber + ", language=" + language + ", post_code=" + post_code
				+ ", po_country=" + po_country + ", po_region=" + po_region + ", po_city=" + po_city + "]";
	}
	
	
}

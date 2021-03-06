package com.paypal.donation.models;

// Generated Dec 9, 2011 10:53:44 AM by Hibernate Tools 3.4.0.CR1


/**
 * Location generated by hbm2java
 */
public class Location implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String payerid;
	private String country;
	private String ipaddress;
	private String host;
	private String locale;
	private String language;

	public Location() {
	}

	public Location(String payerid, String country, String ipaddress, String host,
			String locale, String language) {
		this.payerid = payerid;
		this.country = country;
		this.ipaddress = ipaddress;
		this.host = host;
		this.locale = locale;
		this.language = language;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPayerid() {
		return this.payerid;
	}

	public void setPayerid(String payerid) {
		this.payerid = payerid;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getIpaddress() {
		return this.ipaddress;
	}

	public void setIpaddress(String ipaddress) {
		this.ipaddress = ipaddress;
	}

	public String getLocale() {
		return this.locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
}

package com.paypal.donation.models;

// Generated Dec 9, 2011 10:53:44 AM by Hibernate Tools 3.4.0.CR1

/**
 * Currency generated by hbm2java
 */
public class Currency implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private Character symbol;
	private String units;

	public Currency() {
	}

	public Currency(String name, Character symbol, String units) {
		this.name = name;
		this.symbol = symbol;
		this.units = units;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Character getSymbol() {
		return this.symbol;
	}

	public void setSymbol(Character symbol) {
		this.symbol = symbol;
	}

	public String getUnits() {
		return this.units;
	}

	public void setUnits(String units) {
		this.units = units;
	}

}
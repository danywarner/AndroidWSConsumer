package com.dany.pruebaws;

public class Usuario {
	
	private String addressline1;
	private String addressline2;
	private String city;
	private String creditLimit;
	private String customerId;
	private String email;
	private String fax;
	private String name;
	private String phone;
	private String state;
	
	public Usuario(String linea){
		super();
		String[] data = linea.split("\\*");
		addressline1 = data[0];
		addressline2 = data[1];
		city = data[2];
		creditLimit = data[3];
		customerId = data[4];
		email = data[5];
		fax = data[6];
		name = data[7];
		phone = data[8];
		state = data[9];
		
	}

	public String getAddressline1() {
		return addressline1;
	}

	public void setAddressline1(String addressline1) {
		this.addressline1 = addressline1;
	}

	public String getAddressline2() {
		return addressline2;
	}

	public void setAddressline2(String addressline2) {
		this.addressline2 = addressline2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(String creditLimit) {
		this.creditLimit = creditLimit;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	

}

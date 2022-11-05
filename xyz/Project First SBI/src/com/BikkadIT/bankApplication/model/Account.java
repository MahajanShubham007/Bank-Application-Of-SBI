package com.BikkadIT.bankApplication.model;

public class Account {
	
	long Accno;
	String FirstName;
	String LastName;
	String Email;
	String Address;
	String Phone;
	Double balance;
	public long getAccno() {
		return Accno;
	}
	public void setAccno(long accno) {
		Accno = accno;
	}
	public String getFistName() {
		return FirstName;
	}
	public void setFistName(String fistName) {
		FirstName = fistName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [Accno=" + Accno + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Email=" + Email
				+ ", Address=" + Address + ", Phone=" + Phone + ", balance=" + balance + "]";
	}
	 
	
	}

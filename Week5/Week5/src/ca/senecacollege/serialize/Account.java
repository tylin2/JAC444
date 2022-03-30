package ca.senecacollege.serialize;

import java.io.Serializable;

public class Account implements Serializable {
	
	private transient int accNumber = 0;
	private String fname = "";
	private String lname = "";
	private static double balance = 0;
	
	public Account(int accNumber, String fname, String lname, double balance) {
		super();
		this.accNumber = accNumber;
		this.fname = fname;
		this.lname = lname;
		this.balance = balance;
	}
	public int getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	

}

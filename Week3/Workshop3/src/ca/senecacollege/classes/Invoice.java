/**********************************************
Workshop 3
Course:JAV444 - Winter
Last Name:Ting-Yeh
First Name:Lin
ID:141726182
Section:NEE
This assignment represents my own work in accordance with Seneca Academic Policy.
TING-YEH LIN
Date:2021/2/11
**********************************************/
package ca.senecacollege.classes;

public class Invoice implements Payable {
	
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double pricePerItem;	

	public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {		
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPricePerItem() {
		return pricePerItem;
	}

	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}
	
	
	public String toString() {
		return "Invoice [getPartNumber()=" + getPartNumber() + ", getPartDescription()=" + getPartDescription()
				+ ", getQuantity()=" + getQuantity() + ", getPricePerItem()=" + getPricePerItem()
				+ ", getPaymentAmount()=" + getPaymentAmount() + "]";
	}

	@Override
	public double getPaymentAmount() {
		double cost = 0;
		cost = this.getPricePerItem() * this.getQuantity();
		return cost;
	}
	

}

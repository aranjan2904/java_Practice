package com.kodewala.payment.pojo;

public class Payment {
	private String paymentRefNo;
	private String status;
	
	
	public String getPaymentRefNo() {
		return paymentRefNo;
	}
	public void setPaymentRefNo(String paymentRefNo) {
		this.paymentRefNo = paymentRefNo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public void printPaymentDetails() {
		
		System.out.println("Ref: " + "payment Ref No: " + paymentRefNo + " Status: " +status);
	}
	
	
}

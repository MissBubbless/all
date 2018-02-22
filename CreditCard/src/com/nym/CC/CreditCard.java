package com.nym.CC;

public class CreditCard {

	private long cardNo;
	private int pin;
	private double amount;
	
	public CreditCard() {
		
	}
	
	public CreditCard(long cardNo, int pin, double amount) {
		super();
		this.cardNo = cardNo;
		this.pin = pin;
		this.amount = amount;
	}

	public long getCardNo() {
		return cardNo;
	}

	public void setCardNo(long cardNo) {
		this.cardNo = cardNo;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
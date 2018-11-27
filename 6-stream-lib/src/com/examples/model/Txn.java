package com.examples.model;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Txn {

	private int id;
	private double amount;
	private LocalDate localDate;
	private TxnType type;

	public Txn(int id, double amount, LocalDate LocalDate, TxnType type) {
		super();
		this.id = id;
		this.amount = amount;
		this.localDate = LocalDate;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Txn [id=" + id + ", amount=" + amount + ", LocalDate=" + localDate + ", type=" + type + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public LocalDate getLocalDate() {
		return localDate;
	}

	public void setLocalDate(LocalDate LocalDate) {
		this.localDate = LocalDate;
	}

	public TxnType getType() {
		return type;
	}

	public void setType(TxnType type) {
		this.type = type;
	}

}

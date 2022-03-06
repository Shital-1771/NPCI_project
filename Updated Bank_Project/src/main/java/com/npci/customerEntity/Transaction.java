package com.npci.customerEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import lombok.Data;
//
//@Data
@Entity
@Table(name = "transaction")
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "serial_id")
	private int serialId;

	
	@Column(name = "trans_amount")
	private float tamount;

	@Column(name = "from_c_id")
	private int fromCId;

	@Column(name = "to_c_id")
	private int toCId;

	@Column(name = "trans_id")
	private String transId;

	public int getSerialId() {
		return serialId;
	}

	public void setSerialId(int serialId) {
		this.serialId = serialId;
	}

	public float getTamount() {
		return tamount;
	}

	public void setTamount(float tamount) {
		this.tamount = tamount;
	}

	public int getFromCId() {
		return fromCId;
	}

	public void setFromCId(int fromCId) {
		this.fromCId = fromCId;
	}

	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getToCId() {
		return toCId;
	}

	public void setToCId(int toCId) {
		this.toCId = toCId;
	}

	public String getTransId() {
		return transId;
	}

	public void setTransId(String transId) {
		this.transId = transId;
	}

	public Transaction(int serialId, float tamount, int fromCId, int toCId, String transId) {
		super();
		this.serialId = serialId;
		this.tamount = tamount;
		this.fromCId = fromCId;
		this.toCId = toCId;
		this.transId = transId;
	}

	@Override
	public String toString() {
		return "Transaction [serialId=" + serialId + ", tamount=" + tamount + ", fromCId=" + fromCId + ", toCId="
				+ toCId + ", transId=" + transId + "]";
	}
	
	
	

	

}
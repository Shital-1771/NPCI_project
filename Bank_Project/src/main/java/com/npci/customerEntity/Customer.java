package com.npci.customerEntity;

import javax.persistence.Column;






import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;



@Entity
@Table(name="customer")
public class Customer 

 {
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="c_id")
	private int custId;
	
	@Column(name="account")
	private  long accountNo;
	
	@Column(name="name")
	private String cname;
   
	@Column(name="age")
	private float age; 
	
	@Column(name="email")
	private String cEmail;
	
	@Column(name="phone")
	private long cPhone;
	
	@Column(name="identity")
	private long identity;
	
	@Column(name="address")
	private String address;
	
	@Column(name = "acc_balance")
	private float ABalance;

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public float getAge() {
		return age;
	}

	public void setAge(float age) {
		this.age = age;
	}

	public String getcEmail() {
		return cEmail;
	}

	public void setcEmail(String cEmail) {
		this.cEmail = cEmail;
	}

	public long getcPhone() {
		return cPhone;
	}

	public void setcPhone(long cPhone) {
		this.cPhone = cPhone;
	}

	public long getIdentity() {
		return identity;
	}

	public void setIdentity(long identity) {
		this.identity = identity;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public float getABalance() {
		return ABalance;
	}

	public void setABalance(float aBalance) {
		ABalance = aBalance;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int custId, long accountNo, String cname, float age, String cEmail, long cPhone, long identity,
			String address, float aBalance) {
		super();
		this.custId = custId;
		this.accountNo = accountNo;
		this.cname = cname;
		this.age = age;
		this.cEmail = cEmail;
		this.cPhone = cPhone;
		this.identity = identity;
		this.address = address;
		ABalance = aBalance;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", accountNo=" + accountNo + ", cname=" + cname + ", age=" + age
				+ ", cEmail=" + cEmail + ", cPhone=" + cPhone + ", identity=" + identity + ", address=" + address
				+ ", ABalance=" + ABalance + "]";
	}

	

	
	

	

 }
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
	private int Id;
	
	@Column(name="account")
	private  long account;
	
	@Column(name="name")
	private String name;
   
	@Column(name="age")
	private int age; 
	
	@Column(name="email")
	private String email;
	
	@Column(name="phone")
	private long phone;
	
	@Column(name="identity")
	private long identity;
	
	@Column(name="address")
	private String address;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public long getAccount() {
		return account;
	}

	public void setAccount(long account) {
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
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

	public Customer(int id, long account, String name, int age, String email, long phone, long identity,
			String address) {
		super();
		Id = id;
		this.account = account;
		this.name = name;
		this.age = age;
		this.email = email;
		this.phone = phone;
		this.identity = identity;
		this.address = address;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Customer [Id=" + Id + ", account=" + account + ", name=" + name + ", age=" + age + ", email=" + email
				+ ", phone=" + phone + ", identity=" + identity + ", address=" + address + "]";
	}

	
	
	
}
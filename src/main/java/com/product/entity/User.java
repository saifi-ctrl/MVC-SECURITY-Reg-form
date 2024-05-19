package com.product.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class User {

 @Id
	
	  @Column(name = "email",length=50)
	  
//	  @Email
	 
	private String email;
	
//	  @NotBlank
	  
//	  @Size(min=3, max=30)
	 
	
	private String userName;
//	 @Size(min=3,max=10) 
	private String mobileNo;
//	 @Size(min=4,max=10) 
	private String passWord;
//	 @NotBlank 
	private String address;
	
	private String Role;
	
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public User() {
		super();
		
	}
	@Override
	public String toString() {
		return "User [email=" + email + ", userName=" + userName + ", mobileNo=" + mobileNo + ", passWord=" + passWord
				+ ", address=" + address + ", Role=" + Role + "]";
	}
	
	
}

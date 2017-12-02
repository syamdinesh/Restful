package com.java.model_entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int eNo;
	private String eName;
	private String email;
	private long eMobileNo;
	private int eSal;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Employee_No", unique=true,nullable=false)
	public int geteNo() throws InterruptedException {
		return eNo;
	}
	public void seteNo(int eNo) {
		this.eNo = eNo;
	}
	
	@Column(name="Employee_Name"/*, nullable=false*/)
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	
	@Column(name="Employee_Email"/*, nullable=false*/)
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Column(name="Employee_MobileNumber"/*, nullable=false*/)
	public long geteMobileNo() {
		return eMobileNo;
	}
	public void seteMobileNo(long eMobileNo) {
		this.eMobileNo = eMobileNo;
	}
	
	@Column(name="Employee_Sal"/*, nullable=false*/)
	public int geteSal() {
		return eSal;
	}
	public void seteSal(int eSal) {
		this.eSal = eSal;
	}
	
	@Override
	public String toString() {
		return "Employee [eNo=" + eNo + ", eName=" + eName + ", email=" + email
				+ ", eMobileNo=" + eMobileNo + ", eSal=" + eSal + "]";
	}
}

package main.com.hibernate;

import java.io.Serializable;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@javax.persistence.Entity
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
@Table(name="Employee")
public class Employee implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 101877406480841924L;
	private int eid;
	private String ename;
	private Long mobilenumber;
	private long sal;
	
	@Id
	@GeneratedValue
	@Column(name="EmployeeId")
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	
	@Column(name="EmployeeName", nullable=false)
	public String getEname() {
		return ename;
	}
	
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	
	@Column(name="EmployeeMobileNumber")
	public Long getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(Long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	
	@Column(name="EmployeeSal", nullable=false)
	public long getSal() {
		return sal;
	}
	public void setSal(long sal) {
		this.sal = sal;
	}
}

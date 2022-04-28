package com.edu;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="hiberstudent")
public class Student {
	
	@Id
	
	@GeneratedValue(strategy=javax.persistence.GenerationType.AUTO)
	private int sid;
	@Column(name="stname", length=30)
	private String sname;
	@Column(name="stscource",length=30)
	private String scource;
	@OneToOne
	 private Address No;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getScource() {
		return scource;
	}
	public void setScource(String scource) {
		this.scource = scource;
	}
	public Address getNo() {
		return No;
	}
	public void setNo(Address no) {
		No = no;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", scource=" + scource + ", No=" + No + "]";
	}
	
	
}
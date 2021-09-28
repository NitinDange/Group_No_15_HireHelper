package com.app.springbackenddemo.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="booking")
public class Booking extends BaseEntity{
	
	
	@Column
	private String fname;
	@Column
	private String lname;

	@Column
	private String email;
	@Column
	private String cont_num;
	@Column
	private String start_date;
	@Column
	private String end_date;
	@Column
	private String city;
	@Column
	private String address;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="user_id")
    private User user;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="employee_id")
    private Employee employee;
//
//	@ManyToMany
//	@JoinTable(name = "booking_driver", 
//	joinColumns = @JoinColumn(name = "booking_id"), 
//	inverseJoinColumns = @JoinColumn(name = "driver_id"))
//	private Set<Role> roles = new HashSet<>();
	
  public Booking() {
	  
  }

public Booking(String fname, String lname, String email, String cont_num, String start_date, String end_date,
		String city, String address, User user, Employee employee) {
	super();
	this.fname = fname;
	this.lname = lname;
	this.email = email;
	this.cont_num = cont_num;
	this.start_date = start_date;
	this.end_date = end_date;
	this.city = city;
	this.address = address;
	this.user = user;
	this.employee = employee;
}

public String getFname() {
	return fname;
}

public void setFname(String fname) {
	this.fname = fname;
}

public String getLname() {
	return lname;
}

public void setLname(String lname) {
	this.lname = lname;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getCont_num() {
	return cont_num;
}

public void setCont_num(String cont_num) {
	this.cont_num = cont_num;
}

public String getStart_date() {
	return start_date;
}

public void setStart_date(String start_date) {
	this.start_date = start_date;
}

public String getEnd_date() {
	return end_date;
}

public void setEnd_date(String end_date) {
	this.end_date = end_date;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}

public Employee getEmployee() {
	return employee;
}

public void setEmployee(Employee employee) {
	this.employee = employee;
}

@Override
public String toString() {
	return "Booking [fname=" + fname + ", lname=" + lname + ", email=" + email + ", cont_num=" + cont_num
			+ ", start_date=" + start_date + ", end_date=" + end_date + ", city=" + city + ", address=" + address
			+ ", user=" + user + ", employee=" + employee + "]";
}





}

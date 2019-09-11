package com.rab3.entities;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customerSignup")
public class DriverSignUpEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private String mobileno;
	@Column
	private String email;
	@Column
	private String dateofbirth;
	@Column
	private Date created_atdatetime;
	@Column
	private Date updated_atdatetime;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public Date getCreated_atdatetime() {
		return created_atdatetime;
	}

	public void setCreated_atdatetime(Date created_atdatetime) {
		this.created_atdatetime = created_atdatetime;
	}

	public Date getUpdated_atdatetime() {
		return updated_atdatetime;
	}

	public void setUpdated_atdatetime(Date updated_atdatetime) {
		this.updated_atdatetime = updated_atdatetime;
	}

}

package com.rab3.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "customerLogin")
public class DriverLoginEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column
	private String userName;
	@Column
	private String password;
	@Column
	private String password2;
	@Column
	private Date last_signedon;
	@Column
	private Date created_atdatetime;
	@Column
	private Date updated_atdatetime;

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "customerSignup")
	private long custId;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword2() {
		return password2;
	}

	public void setPassword2(String password2) {
		this.password2 = password2;
	}

	public Date getLast_signedon() {
		return last_signedon;
	}

	public void setLast_signedon(Date last_signedon) {
		this.last_signedon = last_signedon;
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

	public long getCustId() {
		return custId;
	}

	public void setCustId(long custId) {
		this.custId = custId;
	}

}

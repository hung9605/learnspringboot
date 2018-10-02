package com.example.demo.Model.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="accounts")
public class Account implements Serializable {
	@Id
	@GeneratedValue
	@Column(name="iD")
	private int id;
	@Column(name="username")
	private String userName;
	@Column(name="password")
	private String passWord;
	@Column(name="quyen")
	private int quyen;
	@Column(name="create_up")
	private String createUp;
	@Column(name="update_up")
	private String updateUp;
	public Account(int id, String userName, String passWord, int quyen, String createUp, String updateUp) {
		super();
		this.id = id;
		this.userName = userName;
		this.passWord = passWord;
		this.quyen = quyen;
		this.createUp = createUp;
		this.updateUp = updateUp;
	}
	public Account() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public int isQuyen() {
		return quyen;
	}
	public void setQuyen(int quyen) {
		this.quyen = quyen;
	}
	public String getCreateUp() {
		return createUp;
	}
	public void setCreateUp(String createUp) {
		this.createUp = createUp;
	}
	public String getUpdateUp() {
		return updateUp;
	}
	public void setUpdateUp(String updateUp) {
		this.updateUp = updateUp;
	}
	

}

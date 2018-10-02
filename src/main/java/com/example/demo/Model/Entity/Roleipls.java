package com.example.demo.Model.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="roleipls")
public class Roleipls {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	@Column(name="nametable")
	private String nametable;
	@Column(name="action")
	private String action;
	@Column(name="idq")
	private int idq;
	public Roleipls(int id, String nametable, String action, int idq) {
		super();
		this.id = id;
		this.nametable = nametable;
		this.action = action;
		this.idq = idq;
	}
	public Roleipls() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNametable() {
		return nametable;
	}
	public void setNametable(String nametable) {
		this.nametable = nametable;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public int getIdq() {
		return idq;
	}
	public void setIdq(int idq) {
		this.idq = idq;
	}
	
	
	
}

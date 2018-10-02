package com.example.demo.Model.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="roles")
public class Roles {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	@Column(name="quyen")
	private String quyen;
	@Column(name="description")
	private String description;
	public Roles(int id, String quyen, String description) {
		super();
		this.id = id;
		this.quyen = quyen;
		this.description = description;
	}
	public Roles() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuyen() {
		return quyen;
	}
	public void setQuyen(String quyen) {
		this.quyen = quyen;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}

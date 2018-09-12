package com.example.demo.Model.Entity;

import javax.persistence.*;

@Entity
@Table(name="Menus")
public class Menu {
	
	@Id
	@GeneratedValue
	@Column(name="iD")
	private int iD;
	@Column(name="link")
	private String link;
	@Column(name="title")
	private String title;

	public Menu() {
		
	}
	public int getiD() {
		return iD;
	}
	public void setiD(int iD) {
		this.iD = iD;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
}

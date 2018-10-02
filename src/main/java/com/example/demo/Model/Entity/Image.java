package com.example.demo.Model.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="image")
public class Image {
	@Id
	@GeneratedValue
	@Column(name="iD")
	private String iD;
	@Column(name="linkimage")
	private String linkImage;
	@Column(name="createup")
	private String createUp;
	@Column(name="updateup")
	private String updateUp;
	public Image(String iD, String linkImage, String createUp, String updateUp) {
		super();
		this.iD = iD;
		this.linkImage = linkImage;

		this.createUp = createUp;
		this.updateUp = updateUp;
	}
	public Image() {
		super();
	}
	public String getiD() {
		return iD;
	}
	public void setiD(String iD) {
		this.iD = iD;
	}
	public String getLinkImage() {
		return linkImage;
	}
	public void setLinkImage(String linkImage) {
		this.linkImage = linkImage;
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

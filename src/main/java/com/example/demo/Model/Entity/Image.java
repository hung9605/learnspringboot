package com.example.demo.Model.Entity;

public class Image {
	private String iD;
	private String linkImage;
	private String idd;
	private String idp;
	private String createUp;
	private String updateUp;
	public Image(String iD, String linkImage, String idd, String idp, String createUp, String updateUp) {
		super();
		this.iD = iD;
		this.linkImage = linkImage;
		this.idd = idd;
		this.idp = idp;
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
	public String getIdd() {
		return idd;
	}
	public void setIdd(String idd) {
		this.idd = idd;
	}
	public String getIdp() {
		return idp;
	}
	public void setIdp(String idp) {
		this.idp = idp;
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

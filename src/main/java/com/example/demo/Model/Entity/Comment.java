package com.example.demo.Model.Entity;

public class Comment {
	private String iD;
	private String content;
	private String linkImage;
	private String time;
	private String idcparent;
	private String idbd;
	private String idtk;
	private String createUp;
	private String updateUp;
	public Comment(String iD, String content, String linkImage, String time, String idcparent, String idbd, String idtk,
			String createUp, String updateUp) {
		super();
		this.iD = iD;
		this.content = content;
		this.linkImage = linkImage;
		this.time = time;
		this.idcparent = idcparent;
		this.idbd = idbd;
		this.idtk = idtk;
		this.createUp = createUp;
		this.updateUp = updateUp;
	}
	public Comment() {
		super();
	}
	public String getiD() {
		return iD;
	}
	public void setiD(String iD) {
		this.iD = iD;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getLinkImage() {
		return linkImage;
	}
	public void setLinkImage(String linkImage) {
		this.linkImage = linkImage;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getIdcparent() {
		return idcparent;
	}
	public void setIdcparent(String idcparent) {
		this.idcparent = idcparent;
	}
	public String getIdbd() {
		return idbd;
	}
	public void setIdbd(String idbd) {
		this.idbd = idbd;
	}
	public String getIdtk() {
		return idtk;
	}
	public void setIdtk(String idtk) {
		this.idtk = idtk;
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

package com.example.demo.Model.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="comments")
public class Comment {
	@Id
	@GeneratedValue
	@Column(name="id")
	private String iD;
	@Column(name="content")
	private String content;
	@Column(name="idimage")
	private String idImage;
	@Column(name="time")
	private String time;
	@Column(name="idcparent")
	private String idcparent;
	@Column(name="idbd")
	private String idbd;
	@Column(name="idtk")
	private String idtk;
	@Column(name="createup")
	private String createUp;
	@Column(name="updateup")
	private String updateUp;
	public Comment(String iD, String content, String idImage, String time, String idcparent, String idbd, String idtk,
			String createUp, String updateUp) {
		super();
		this.iD = iD;
		this.content = content;
		this.idImage = idImage;
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
		return idImage;
	}
	public void setLinkImage(String idImage) {
		this.idImage = idImage;
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

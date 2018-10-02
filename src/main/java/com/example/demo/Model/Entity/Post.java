package com.example.demo.Model.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="posts")
public class Post {
	@Id
	@GeneratedValue
	@Column(name="iD")
	private String iD;
	@Column(name="content")
	private String content;
	@Column(name="idimage")
	private String idImage;
	@Column(name="numberlike")
	private String numberLike;
	@Column(name="timepost")
	private String timePost;
	@Column(name="idtk")
	private String idtk;
	@Column(name="createup")
	private String createUp;
	@Column(name="updateup")
	private String updateUp;
	public Post(String iD, String content, String idImage, String numberLike, String timePost, String idtk,
			String createUp, String updateUp) {
		super();
		this.iD = iD;
		this.content = content;
		this.idImage = idImage;
		this.numberLike = numberLike;
		this.timePost = timePost;
		this.idtk = idtk;
		this.createUp = createUp;
		this.updateUp = updateUp;
	}
	
	public Post() {
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
	public String getNumberLike() {
		return numberLike;
	}
	public void setNumberLike(String numberLike) {
		this.numberLike = numberLike;
	}
	public String getTimePost() {
		return timePost;
	}
	public void setTimePost(String timePost) {
		this.timePost = timePost;
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

package com.example.demo.Model.Entity;

public class Post {
	private String iD;
	private String content;
	private String linkImage;
	private String numberLike;
	private String timePost;
	private String idtk;
	private String createUp;
	private String updateUp;
	public Post(String iD, String content, String linkImage, String numberLike, String timePost, String idtk,
			String createUp, String updateUp) {
		super();
		this.iD = iD;
		this.content = content;
		this.linkImage = linkImage;
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
		return linkImage;
	}
	public void setLinkImage(String linkImage) {
		this.linkImage = linkImage;
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

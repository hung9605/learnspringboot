package com.example.demo.Model.Entity;

public class InformationAccount {
	private String iD;
	private String ho;
	private String ten;
	private String email;
	private String queQuan;
	private String tuoi;
	private String sdt;
	private String linkImage;
	private String createUp;
	private String updateUp;
	private String idTk;
	
	public InformationAccount(String iD, String ho, String ten, String email, String queQuan, String tuoi, String sdt,
			String linkImage, String createUp, String updateUp, String idTk) {
		super();
		this.iD = iD;
		this.ho = ho;
		this.ten = ten;
		this.email = email;
		this.queQuan = queQuan;
		this.tuoi = tuoi;
		this.sdt = sdt;
		this.linkImage = linkImage;
		this.createUp = createUp;
		this.updateUp = updateUp;
		this.idTk = idTk;
	}

	public InformationAccount() {
		super();
	}

	public String getiD() {
		return iD;
	}

	public void setiD(String iD) {
		this.iD = iD;
	}

	public String getHo() {
		return ho;
	}

	public void setHo(String ho) {
		this.ho = ho;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getQueQuan() {
		return queQuan;
	}

	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}

	public String getTuoi() {
		return tuoi;
	}

	public void setTuoi(String tuoi) {
		this.tuoi = tuoi;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
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

	public String getIdTk() {
		return idTk;
	}

	public void setIdTk(String idTk) {
		this.idTk = idTk;
	}
	
	
}

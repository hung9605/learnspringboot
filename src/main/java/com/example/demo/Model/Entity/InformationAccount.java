package com.example.demo.Model.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="infomationuser")
public class InformationAccount {
	@Id
	@GeneratedValue
	@Column(name="iD")
	private int iD;
	@Column(name="ho")
	private String ho;
	@Column(name="ten")
	private String ten;
	@Column(name="email")
	private String email;
	@Column(name="quequan")
	private String queQuan;
	@Column(name="tuoi")
	private String tuoi;
	@Column(name="sdt")
	private String sdt;
	@Column(name="image")
	private String linkImage;
	@Column(name="create_up")
	private String createUp;
	@Column(name="update_up")
	private String updateUp;
	@Column(name="idtk")
	private int idTk;
	
	public InformationAccount(int iD, String ho, String ten, String email, String queQuan, String tuoi, String sdt,
			String linkImage, String createUp, String updateUp, int idTk) {
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

	public int getiD() {
		return iD;
	}

	public void setiD(int iD) {
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

	public int getIdTk() {
		return idTk;
	}

	public void setIdTk(int idTk) {
		this.idTk = idTk;
	}
	
	
}

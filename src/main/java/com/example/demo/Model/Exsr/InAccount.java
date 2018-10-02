package com.example.demo.Model.Exsr;

import java.util.ArrayList;

import com.example.demo.Model.Entity.Account;

public interface InAccount {
	Account getAcc(String username,String password);
	Account getAcc(int id);
	int getAcc(String email);
	ArrayList<Account> getAll();
	int InsertAcc(Account a);
	int UpdateAcc(Account a);
	int DeleteAcc(int id);
	Account getAccEmail(String email);
	int updatePass(String pass,String id);
}

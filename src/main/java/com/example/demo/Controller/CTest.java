package com.example.demo.Controller;

import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.Model.Entity.Account;
import com.example.demo.Model.Exsr.ExsrAccount;

@Controller
public class CTest {

	@Autowired
	private EntityManagerFactory entityManagerFactory;	
	@GetMapping("/test")
	void Test()
	{
		ExsrAccount ex=new ExsrAccount(entityManagerFactory);
		System.out.println(ex.getAcc("a"));
	}
}

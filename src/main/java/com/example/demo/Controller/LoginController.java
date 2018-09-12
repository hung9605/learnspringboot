package com.example.demo.Controller;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.persistence.EntityManagerFactory;
import javax.servlet.http.HttpSession;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.apache.tomcat.util.security.MD5Encoder;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.internal.SessionFactoryBuilderImpl;
import org.hibernate.query.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Model.Entity.Account;

@Controller
public class LoginController {
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	@Autowired
	private HttpSession se;
	@GetMapping(value= {"/","/login"})
	String Login()
	{
		String iD=(String) se.getAttribute("id");
		if(iD != null)
				return "homepage";
		else
				return "login";
	}
	
	@PostMapping("/login")
	String SbLogin(@RequestParam("username") String username,@RequestParam("password") String password) {
		password=MD5(password);
		Session s = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		String hql="from Account a where a.userName=:user and a.passWord=:pass";
		Query q=s.createQuery(hql);
		q.setParameter("user", username);
		q.setParameter("pass", password);
		Account a=null;
		try {
		a=(Account)q.list().get(0);
		se.setAttribute("id", a.getId());
		se.setAttribute("username", a.getUserName());
		}
		catch(Exception ex)
		{
		}
		return "redirect:/";
	}
	
	@GetMapping(value="/register")
	String Register()
	{
		return "register";
	}
	
	private String MD5(String input) {
		
		StringBuffer sb = new StringBuffer();
		try {
			MessageDigest md5 = MessageDigest.getInstance("md5");
			md5.update(input.getBytes());
			byte[] arr = md5.digest();
			
			for (int i = 0; i < arr.length; i++)
				sb.append(Integer.toString((arr[i] & 0xff) + 0x100, 16).substring(1));
			
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sb.toString();
	}
	
	

}

package com.example.demo.Controller;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.persistence.EntityManagerFactory;
import javax.servlet.http.HttpSession;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.demo.Model.Entity.Account;
import com.example.demo.Model.Exsr.ExsrAccount;

@Controller
public class LoginController {

	@Autowired
	private EntityManagerFactory entityManagerFactory;
	@Autowired
	private HttpSession se;

	public ExsrAccount ex;

	
	@GetMapping(value = { "/" })
	String Login(Model model) {
		try {
			int iD = (int) se.getAttribute("id");
		
			return "homepage";
		} catch (Exception ex) {
			return "login";
		}
	}

	@GetMapping(value = { "logout" })
	String Logout() {
		se.invalidate();
		return "redirect:/";
	}

	@PostMapping("/login")
	String SbLogin(@RequestParam("username") String username, @RequestParam("password") String password) {
		password = MD5(password);
		ex=new ExsrAccount(entityManagerFactory);
		try {
			Account a = ex.getAcc(username, password);
			se.setAttribute("id", a.getId());
			se.setAttribute("username", a.getUserName());
		} catch (Exception e) {
		}
		return "redirect:/";
	}

	@PostMapping("/register")
	String SbRegiter(@ModelAttribute(value = "register") Account a) {
		Session s = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		String pass = a.getPassWord();
		Transaction tr = s.beginTransaction();
		a.setPassWord(MD5(a.getPassWord()));
		a.setCreateUp("2018-08-29");
		a.setUpdateUp("2018-08-29");
		int result = (int) s.save(a);
		tr.commit();
		System.out.println(result);
		if (result > 0) {
			return SbLogin(a.getUserName(), pass);
		} else {
			return Register();
		}
	}

	@GetMapping(value = "/register")
	String Register() {
		return "register";
	}
	
	@GetMapping(value = "/changepass")
	String ChangPass() {
		return "changepass";
	}
	
	@PostMapping("/changepass")
	String SBChangePass(@RequestParam("email") String email, @RequestParam("password") String password)
	{
		ex=new ExsrAccount(entityManagerFactory);
		int idtk=ex.getAcc(email);
		if(idtk > 0)
		{
			idtk=ex.updatePass(password, idtk+"");
		}
		if(idtk >0)
		{
			return "homepage";
		}
		return "/";
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

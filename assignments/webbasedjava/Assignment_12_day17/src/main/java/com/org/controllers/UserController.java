package com.org.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.org.daos.Credentials;
import com.org.entities.User;
import com.org.services.UserServiceImpl;

@Controller
public class UserController {
	
	private UserServiceImpl userServiceimpl;

	public UserController(UserServiceImpl userServiceimpl) {
		this.userServiceimpl = userServiceimpl;
	}
	
	@RequestMapping({"/", "/index"})
	public String index() {
		return "index";
	}
	
	@RequestMapping("/login")
	public String login(Model model) {
		
		Credentials cred = new Credentials("","");
		
		model.addAttribute("command", cred);
		
		return "login";
	}
	
	@RequestMapping("/validate")
	public String validate(@ModelAttribute Credentials cred, HttpSession session) {
		
		User user = userServiceimpl.authenticateUser(cred.getEmail(), cred.getPassword());
		
		if(user == null)
			return "failed";
		
		session.setAttribute("user", user);
		
		if(user.getRole().equals("admin"))
			return "forward:manage";
		
		return "forward:topicsurl";
	}
	
	@RequestMapping("/logout")
	public String logout(Model model, HttpSession session) {
		
		model.addAttribute("user", session.getAttribute("user"));
		
		return "logout";
	}

}

package com.sunbeam;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	
	@RequestMapping("/welcome")
	public String home(Model model) {
		//Date now = new Date();
		model.addAttribute("currentTime", new Date());
		return "index";
	}

}

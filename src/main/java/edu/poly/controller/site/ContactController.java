package edu.poly.controller.site;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("home")
public class ContactController {
	
	@RequestMapping("contact")
	public String index() {
		return "home/contact";
	}
}

package com.example.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MvcController {
	
	@RequestMapping("/")
	public String entryPoint() {
		return "index.html";
	}
	@RequestMapping("/show")
	public String m1() {
		return "ShowData.html";
	}
	@RequestMapping("/del")
	public String m2() {
		return "DeleteData.html";
	}
	
}

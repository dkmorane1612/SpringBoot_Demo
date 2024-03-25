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
	
	@RequestMapping("/upd")
	public String m3() {
		return "UpdateData.html";
	}
	
	@RequestMapping("/add")
	public String m4() {
		return "AddData.html";
	}
	
	@RequestMapping("/recupd")
	public String r1() {
		return "RecordUpd.html";
	}
	
	@RequestMapping("/recdel")
	public String r2() {
		return "RecordDel.html";
	}
	
}

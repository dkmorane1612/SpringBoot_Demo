package com.boot.control;

import java.sql.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.boot.dao.StudentRepo;
import com.boot.entity.Student;

@Controller
public class StudentController {
	
	@Autowired
	StudentRepo repo;
	
	@RequestMapping("/")
	public String entryPoint()
	{
		return "index.html";
	}
	
	
	@RequestMapping("/show")
	public ModelAndView getDataByName()
	{
		ModelAndView mv = new ModelAndView();
		List<Student> lstStud = repo.findByStudName("Durgadas");
		
		String nextPage ="showData.jsp";
		mv.addObject("list",lstStud);
		mv.setViewName(nextPage);
		
		return mv;
	}
	
	@RequestMapping("/addData")
	public String m2() 
	{
		return "addData.html";
	}
	
	@RequestMapping("/addRecord")
	public String m3(HttpServletRequest req) 
	{
		int rollNo =Integer.parseInt(req.getParameter("rollNo"));
		String studName =req.getParameter("studName");
		String dob =req.getParameter("dob");
		String addr =req.getParameter("studadd");
		
		System.out.println("Student RollNo :"+rollNo+" Student Name :"+studName+" BirthDate :"+dob+" Student Address :"+addr);
		repo.save(new Student(rollNo,studName, Date.valueOf(dob), addr));
		System.out.println("Record Added");
		
		return "index.html";
	}
	
	//for update data
	@RequestMapping("/updData")
	public String up1() 
	{
		return "updateData.html";
	}
	
	@RequestMapping("/updRecord")
	public String up2(HttpServletRequest req) 
	{
		int rollNo =Integer.parseInt(req.getParameter("roll"));
		String studName =req.getParameter("sName");
		Student s1 = repo.findById(rollNo).get();
		s1.setStudName(studName);
		repo.save(s1);
		
		return "index.html";
	}
	
	
	//for delete data
	@RequestMapping("/delData")
	public String deldata() 
	{
		return "deleteData.html";
	}
	
	@RequestMapping("/delRecord")
	public String deldata2(HttpServletRequest req) 
	{
		int rollNo =Integer.parseInt(req.getParameter("rollId"));
		repo.deleteById(rollNo);
		System.out.println("Records Deleted Successufully..!");
		
		return "index.html";
	}
	
}

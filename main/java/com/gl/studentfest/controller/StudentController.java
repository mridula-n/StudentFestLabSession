package com.gl.studentfest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gl.studentfest.dao.StudentFestDao;
import com.gl.studentfest.entity.studentEntity;
import com.gl.studentfest.service.StudentFestService;
import com.gl.studentfest.service.StudentFestServiceImpl;

@Controller
@RequestMapping("/")
public class StudentController {

	public StudentController() {
		super();
		// TODO Auto-generated constructor stub
	}

	 
	  @Autowired 
	  StudentFestService studentFestService ;//= new
	 /* 
	@Autowired
	private StudentFestDao studentFestDao ;
	*/
	
@RequestMapping("hello")	
public String helloworld()
{
return "demo";
	
}

  @RequestMapping("registeredStudentList") public void
  RegisterdStudentsList(Model model) {
  
  List<studentEntity> students = new ArrayList<studentEntity>();
  
  students = studentFestService.RegisterdStudentsList(); }
  
  @RequestMapping("registerNewStudent") public String RegisterStudent(Model
  model) {
  
  studentEntity studentEntityO = new studentEntity();
  
  model.addAttribute("studentEntityO", studentEntityO);
  
  return("CreateStudentForm");
  
  }
  
  @RequestMapping("saveRegistration") public String SaveRegistration(
  
  @RequestParam("studentid") int studentid,
  
  @RequestParam("name") String name ,
  
  @RequestParam("department") String department ,
  
  @RequestParam("country") String country ) {
  
  System.out.println("hello11");
  
  studentEntity studentEntityO = new studentEntity(name,department,country);
  
  System.out.println("hello"+studentEntityO.toString());
  studentFestService.RegisterStudent(studentEntityO);  
  return "demo";
  
  }
  
 }

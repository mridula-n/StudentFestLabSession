package com.gl.studentfest.service;

import java.util.List;

import com.gl.studentfest.entity.studentEntity;



public interface StudentFestService {
	
	public List<studentEntity> RegisterdStudentsList();
	
	public void RegisterStudent(studentEntity studentEntityO);

}

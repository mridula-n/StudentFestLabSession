package com.gl.studentfest.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.gl.studentfest.entity.studentEntity;

public interface StudentFestDao {

	public List<studentEntity> RegisterdStudentsList();
	
	void RegisterStudent(studentEntity studentEntityO);
	
}

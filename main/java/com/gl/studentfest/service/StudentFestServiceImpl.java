package com.gl.studentfest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.studentfest.dao.StudentFestDao;
import com.gl.studentfest.entity.studentEntity;

@Service
public class StudentFestServiceImpl implements StudentFestDao {
	
	@Autowired
	StudentFestDao studentFestDao ;
	
	public StudentFestServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

 
	@Override
	public List<studentEntity> RegisterdStudentsList() {
		
		return studentFestDao.RegisterdStudentsList();
	}

	@Override
	public void RegisterStudent(studentEntity studentEntityO) {
		// TODO Auto-generated method stub
		
		  studentFestDao.RegisterStudent(studentEntityO);
		
	}

}

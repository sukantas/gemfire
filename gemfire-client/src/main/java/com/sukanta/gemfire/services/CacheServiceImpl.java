package com.sukanta.gemfire.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sukanta.gemfire.models.Student;
import com.sukanta.gemfire.repositories.StudentRepository;

@Service
public class CacheServiceImpl  implements CacheService{

	@Autowired
	StudentRepository studentRepo;
	public void saveToGemfire(Student student) {
		studentRepo.save(student);
		
	}
	public Student findOne(String studentId) {
		return studentRepo.findOne(studentId);
		
	}

}

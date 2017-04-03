package com.sukanta.gemfire.services;

import org.springframework.stereotype.Service;

import com.sukanta.gemfire.models.Student;

@Service
public interface CacheService {
	public void saveToGemfire(Student student);
	public Student findOne(String studentId);

}

package com.sukanta.gemfire.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sukanta.gemfire.models.Student;
import com.sukanta.gemfire.models.SubjectMarks;
import com.sukanta.gemfire.services.CacheService;

@RestController
public class StudentController {
	
	@Autowired
	CacheService cache;
	
	@RequestMapping(method = RequestMethod.GET, path="/stored")
	@ResponseBody
	public String storeToGemfire(){
		
		Student s = new Student();
		s.setDepartmentName("IT");
		s.setEmail("abc@iit.in");
		s.setName("ABN");
		s.setStudentId("AAATTTT023");
		List<SubjectMarks> sulist = new ArrayList<SubjectMarks>();
		SubjectMarks sm = new SubjectMarks();
		sm.setGrade("A");
		sm.setSubjectCode("CSC");
		sulist.add(sm);
		
		s.setMarks(sulist);
		
		cache.saveToGemfire(s);
		
		return "Successfully stored into gemfire";
	}

}

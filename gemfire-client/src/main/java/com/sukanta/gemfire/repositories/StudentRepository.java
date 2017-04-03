package com.sukanta.gemfire.repositories;

import org.springframework.data.gemfire.repository.GemfireRepository;
import org.springframework.stereotype.Repository;

import com.sukanta.gemfire.models.Student;

@Repository
public interface StudentRepository  extends GemfireRepository<Student, String>{

}

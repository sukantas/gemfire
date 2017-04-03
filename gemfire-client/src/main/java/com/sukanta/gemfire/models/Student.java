package com.sukanta.gemfire.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.gemfire.mapping.Region;

import com.gemstone.gemfire.pdx.PdxReader;
import com.gemstone.gemfire.pdx.PdxSerializable;
import com.gemstone.gemfire.pdx.PdxWriter;

@Region("Student")
public class Student implements PdxSerializable {

	@Id
	private String studentId;
	private String name;
	private String email;
	private String departmentName;
	private List<SubjectMarks> marks;

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public List<SubjectMarks> getMarks() {
		return marks;
	}

	public void setMarks(List<SubjectMarks> marks) {
		this.marks = marks;
	}

	public void fromData(PdxReader pr) {
		studentId = pr.readString("studentId");
		name = pr.readString("name");
		email = pr.readString("email");

		departmentName = pr.readString("departmentName");
		marks = (List<SubjectMarks>) pr.readObject("marks");

	}

	public void toData(PdxWriter pw) {
		pw.writeString("studentId", studentId);
		pw.writeString("name", name);
		pw.writeString("email", email);
		pw.writeString("departmentName", departmentName);
		pw.writeObject("marks", marks);

	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", email=" + email + ", departmentName="
				+ departmentName + ", marks=" + marks.toString() + "]";
	}
	
	

}

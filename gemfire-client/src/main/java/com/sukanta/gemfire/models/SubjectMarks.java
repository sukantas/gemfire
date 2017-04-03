package com.sukanta.gemfire.models;

import com.gemstone.gemfire.pdx.PdxReader;
import com.gemstone.gemfire.pdx.PdxSerializable;
import com.gemstone.gemfire.pdx.PdxWriter;

public class SubjectMarks implements PdxSerializable {

	String subjectCode;
	String grade;

	public String getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "SubjectMarks [subjectCode=" + subjectCode + ", grade=" + grade + "]";
	}

	public void fromData(PdxReader pr) {
		subjectCode = pr.readString("subjectCode");
		grade = pr.readString("grade");

	}

	public void toData(PdxWriter pw) {
		pw.writeString("subjectCode",subjectCode );
		pw.writeString("grade",grade );
	}

}

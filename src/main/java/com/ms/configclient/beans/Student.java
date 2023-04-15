package com.ms.configclient.beans;

import org.springframework.stereotype.Service;

@Service
public class Student {

	private String studentName;
	private String studentRollNo;
	private String studentEmail;
	private String phone;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentRollNo() {
		return studentRollNo;
	}
	public void setStudentRollNo(String studentRollNo) {
		this.studentRollNo = studentRollNo;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentRollNo=" + studentRollNo + ", studentEmail="
				+ studentEmail + ", phone=" + phone + "]";
	}
}

package com.payments.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@Data
@AllArgsConstructor
@NoArgsConstructor

public class StudentDetailsEntity {

	private int studentId;
	private String studentName;
	private String gender;
	private String dateOfBirth;
	private String groupName;
	private String courseTrack;
	private String section;
	private String addmissionStatus;
	private String addmissionType;
	private String studentType;
	private int aadharNumber;
	private String motherName;
	private String fatherName;
	private String address;
}

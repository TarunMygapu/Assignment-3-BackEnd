package com.payments.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CardsEntity {
	private int studentId;
	private int ipeMarks;
	private int recentMarks;
	private int emcetMockTest;
	private String attendence;
}

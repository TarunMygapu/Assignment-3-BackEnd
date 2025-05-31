package com.payments.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@Data
@AllArgsConstructor
@NoArgsConstructor

public class FeeDetailsViewEntity {
	private int studentId;
	private  String courseFee;
	private String addiAmount;
	private int concession;
	private String netFee;
	private String serviceTaxPaid;
	private String feePaid;
	private String feeEducation;
	private String feeRefund;
	private String overAlldue;
	private String serviceTaxToBePaid;
}

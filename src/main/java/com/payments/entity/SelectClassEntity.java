package com.payments.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
 
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SelectClassEntity {
	private String course;
	private String courseFee;
	private String addionalAmount;
	private int  concession;
	private String netFee;
	private String serviceTaxPaid;
	private String feePaid;
	private String feeRefund;
	private String overAllDue;
 
}
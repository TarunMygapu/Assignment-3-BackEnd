package com.payments.entity;

import java.time.LocalDateTime;
import java.util.Date;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@Data
@AllArgsConstructor
@NoArgsConstructor

public class PaymentEntity {
	private int studentId;
	private int cheque;
	private Date feePaymentYear;
	private int totalDue;
	private int pocketMoney;
	private int akashBooks;
	private String organization;
	private String description;
	private String bankName;
	private String cityName;
	private String ifscCode;
	
	private LocalDateTime payDate;
	private String feeHeads;
	private int depositedAmount;
	private int prePrintReceiptNo;
}

package com.payments.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
 
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PmIssueEntity {
	private String cardNo;
	private int payAmount;
	private LocalDateTime issueDate;
	private String description;
	private String paymentMode;
	private int depositedAmount;
	private int issueAmount;
	private int pocketMoneyBalance;

 
}
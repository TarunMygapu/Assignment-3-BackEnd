package com.payments.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@Data
@AllArgsConstructor
@NoArgsConstructor

public class FeeInstallmentsEntity {
	private String cardNo;
	private int depositedAmount;
	private int issueAmout;
	private int pocketMoneyAmount;
	private int payAmount;
	private String paymentMode;
	private LocalDateTime issueDate;
	private String description;
}

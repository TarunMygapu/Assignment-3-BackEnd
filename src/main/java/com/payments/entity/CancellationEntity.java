package com.payments.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CancellationEntity {
	private int recieptNo;
	private int prePrintRecieptNo;
	private int paidAmount;
	private String notes;
}

package com.payments.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@Data
@AllArgsConstructor
@NoArgsConstructor

@Table(name="payments")
public class PaymentHistoryEntity {
	
	
	private String className;
	private String acedemicYear;
	private String paymentHead;
	private String paymentMode;
	private String payHeads;
	private int amount;
	private String paymentCampus;
	private Date date;
	private int installmentNo;

}

package com.payments.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
 
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UniformPrintEntity {
	private int paidRecieptNo;
	private int prePrintRecieptNo;
	private int note;
 
}
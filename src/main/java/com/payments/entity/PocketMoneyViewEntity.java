package com.payments.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
 
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PocketMoneyViewEntity {
	private int studentId;
	private int pocketRefund;
	private int depositedAmount;
	private int takenAmount;
 
}
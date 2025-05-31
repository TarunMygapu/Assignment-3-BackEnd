package com.payments.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@Data
@AllArgsConstructor
@NoArgsConstructor

public class OtherFeeHeadsViewEntity {
	private int studentId;
	private double akashBooks;
	private double busPss;
	private double cautionDeposits;
	private double crdBooks;
	private double miscellaneous;
	private double stdWelfareFund;
	private double material;
	private double eamcetAppFee;
}

package com.payments.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@Data
@AllArgsConstructor
@NoArgsConstructor

public class AkashBooksEntity {

	int paymentStatus;
	String booksForClass;
	int paidReceiptNo;
	String description;
}

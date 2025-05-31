package com.payments.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ConcessionEntity {
	private String joinInto;
	private int cancessionAmount;
	private int enterRecieptNo;
	private String description;
	private String approvedBy;
}

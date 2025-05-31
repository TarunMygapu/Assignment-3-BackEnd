package com.payments.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@Data
@AllArgsConstructor
@NoArgsConstructor

public class AdditionalDetailsViewEntity {

	private int studentId;
	private String language1;
	private String language2;
	private String language3;
}

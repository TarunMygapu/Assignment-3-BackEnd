package com.payments.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
 
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransportEntity {
	private int studentId;
	private String  acadamicYear;
	private String transportRouteNo;
	private String transportStatus;
	private String stage;
	private int routeNo;
	private String startForm;
	private String toDestination;
	private String busDriverName;
	private String driverContactNo;
 
 
}
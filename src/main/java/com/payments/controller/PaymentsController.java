package com.payments.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.payments.entity.PaymentHistoryEntity;
import com.payments.service.PaymentsService;

@RestController
public class PaymentsController {
	
	@Autowired
	PaymentsService paymentsService;
	
	public List<PaymentHistoryEntity> getAll()
	{
		return paymentsService.getAll();
	}

}

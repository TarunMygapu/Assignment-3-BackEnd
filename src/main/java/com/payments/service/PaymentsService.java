package com.payments.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payments.entity.PaymentHistoryEntity;
import com.payments.repository.PaymentsHistoryRepository;

@Service
public class PaymentsService {
	
	@Autowired
	PaymentsHistoryRepository paymentsRepository;
	
	public List<PaymentHistoryEntity> getAll()
	{
		return paymentsRepository.findAll();
	}

	
}

package com.payments.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.payments.entity.PaymentHistoryEntity;

@Repository
public interface PaymentsHistoryRepository extends JpaRepository <PaymentHistoryEntity, Integer>{


}

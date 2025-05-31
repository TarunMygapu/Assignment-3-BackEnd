package com.payments.repository;

import com.payments.entity.PaymentHistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentHistoryRepository extends JpaRepository<PaymentHistoryEntity, Integer> {
}

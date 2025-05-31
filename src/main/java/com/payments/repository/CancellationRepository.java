package com.payments.repository;

import com.payments.entity.CancellationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CancellationRepository extends JpaRepository<CancellationEntity, Integer> {
}

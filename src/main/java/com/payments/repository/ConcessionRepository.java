package com.payments.repository;

import com.payments.entity.ConcessionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConcessionRepository extends JpaRepository<ConcessionEntity, Integer> {
}

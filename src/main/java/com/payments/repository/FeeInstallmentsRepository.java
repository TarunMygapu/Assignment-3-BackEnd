package com.payments.repository;

import com.payments.entity.FeeInstallmentsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeeInstallmentsRepository extends JpaRepository<FeeInstallmentsEntity, String> {
}

package com.payments.repository;

import com.payments.entity.CampusDetailsVeiwEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampusDetailsViewRepository extends JpaRepository<CampusDetailsVeiwEntity, Integer> {
}

package com.payments.repository;

import com.payments.entity.CardsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardsRepository extends JpaRepository<CardsEntity, Integer> {
}

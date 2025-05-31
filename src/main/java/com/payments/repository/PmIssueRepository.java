package com.payments.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 

 
@Repository
public interface PmIssueRepository extends JpaRepository<PmIssue, String> {
 
}
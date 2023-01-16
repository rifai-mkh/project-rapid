package com.rapidtech.rapidproject.repository;

import com.rapidtech.rapidproject.model.Audit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuditRepository extends JpaRepository<Audit, Long> {
}

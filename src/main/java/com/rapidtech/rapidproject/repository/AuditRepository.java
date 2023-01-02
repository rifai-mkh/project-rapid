package com.rapidtech.rapidproject.repository;

import com.rapidtech.rapidproject.entity.AuditEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuditRepository extends JpaRepository<AuditEntity, Long> {
}

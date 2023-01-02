package com.rapidtech.rapidproject.repository;

import com.rapidtech.rapidproject.entity.AssetEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssetRepository extends JpaRepository<AssetEntity, Long> {
}

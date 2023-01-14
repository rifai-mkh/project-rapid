package com.rapidtech.rapidproject.repository;

import com.rapidtech.rapidproject.model.Asset;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssetRepository extends JpaRepository<Asset, Long> {
}

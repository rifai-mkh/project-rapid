package com.rapidtech.rapidproject.repository;

import com.rapidtech.rapidproject.entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<UsersEntity, Long> {
}

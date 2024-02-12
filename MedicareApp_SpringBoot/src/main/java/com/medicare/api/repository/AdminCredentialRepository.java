package com.medicare.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medicare.api.entity.AdminCredential;

@Repository
public interface AdminCredentialRepository extends JpaRepository<AdminCredential, Integer>{

}

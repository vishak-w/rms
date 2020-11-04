package com.rms.RetailManagementSystem.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rms.RetailManagementSystem.entity.Product;

@Repository
public interface RmsRepository extends JpaRepository<Product, Integer>{

}

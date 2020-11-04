package com.rms.RetailManagementSystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rms.RetailManagementSystem.entity.Product;
import com.rms.RetailManagementSystem.entity.repository.RmsRepository;

@Service
public class RmsService {
	
	@Autowired
	RmsRepository repo;
	
	public void addProduct(Product product)
	{
		System.out.println(product.toString());
		repo.save(product);
	}
	
	public Optional<Product> search(int product_id)
	{
		return repo.findById(product_id);
	}
	 
	public List<Product> viewWholeProduct()
	{
		List<Product> list=repo.findAll();
		return list;
	}
	public void removeProduct(int product_id) {
		repo.deleteById(product_id);
	}
	
	
	public void updateProduct(Product product,int productid)
	{
		repo.save(product);
	}
}

package com.rms.RetailManagementSystem.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rms.RetailManagementSystem.entity.Product;
import com.rms.RetailManagementSystem.service.RmsService;
@CrossOrigin("*")
@RestController
@RequestMapping("api/v1/rms")
public class RmsController {
	
	@Autowired
	RmsService service;
	
	@PostMapping("/addProduct")
	public void addProducts(@RequestBody Product product)
	{
		service.addProduct(product);
		
	}
	@GetMapping("/searchProduct/{id}")
	
	public Optional<Product> getProduct(@PathVariable("id") int id)
	{
		return service.search(id);
	}
	@GetMapping("/showAllProducts")
	public List<Product> showAllProducts()
	{
		return service.viewWholeProduct();
	}
	@PutMapping("/editProduct/{id}")
	public void updateProduct( @RequestBody  @PathVariable("id") int id,Product product)
	{
		service.updateProduct(product, id);
	}
	@DeleteMapping("delete/{id}")
	public void removeProdut(@PathVariable("id") int id)
	{
		service.removeProduct(id);
	}

}

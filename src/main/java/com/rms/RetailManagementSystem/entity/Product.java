package com.rms.RetailManagementSystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Product {
	
	@Id

	@Column
	private Integer productId;

	@Column
	private String categoryName;
	@Column
	private String typeofproduct;
	@Column
	
	private String expirydate;
	@Column
	private double price;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(Integer productId, String categoryName, String typeofproduct, String expirydate, double price) {
		super();
		this.productId = productId;
		this.categoryName = categoryName;
		this.typeofproduct = typeofproduct;
		this.expirydate = expirydate;
		this.price = price;
	}
	
	
	
	
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getTypeofproduct() {
		return typeofproduct;
	}
	public void setTypeofproduct(String typeofproduct) {
		this.typeofproduct = typeofproduct;
	}
	public String getExpirydate() {
		return expirydate;
	}
	public void setExpirydate(String expirydate) {
		this.expirydate = expirydate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return String.format("Product [productId=%s, CategoryName=%s, typeofproduct=%s, expirydate=%s, price=%s]",
				productId, categoryName, typeofproduct, expirydate, price);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categoryName == null) ? 0 : categoryName.hashCode());
		result = prime * result + ((expirydate == null) ? 0 : expirydate.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((productId == null) ? 0 : productId.hashCode());
		result = prime * result + ((typeofproduct == null) ? 0 : typeofproduct.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (categoryName == null) {
			if (other.categoryName != null)
				return false;
		} else if (!categoryName.equals(other.categoryName))
			return false;
		if (expirydate == null) {
			if (other.expirydate != null)
				return false;
		} else if (!expirydate.equals(other.expirydate))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (productId == null) {
			if (other.productId != null)
				return false;
		} else if (!productId.equals(other.productId))
			return false;
		if (typeofproduct == null) {
			if (other.typeofproduct != null)
				return false;
		} else if (!typeofproduct.equals(other.typeofproduct))
			return false;
		return true;
	}
	

}

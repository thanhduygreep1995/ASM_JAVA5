package edu.poly.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data

public class ProductReport implements Serializable{
	@Id
	int productid;
	String name;
	String image;
	Integer price;
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public ProductReport(int productid, String name, String image, Integer price) {
		
		this.productid = productid;
		this.name = name;
		this.image = image;
		this.price = price;
	}
	public ProductReport() {
		
	}
	
}

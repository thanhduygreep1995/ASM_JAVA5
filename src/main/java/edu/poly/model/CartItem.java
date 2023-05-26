package edu.poly.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

public class CartItem {
	Integer id;
	String name;
	double price;
	String image;
	int qty = 1;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public CartItem(Integer id, String name, double price, String image, int qty) {
	
		this.id = id;
		this.name = name;
		this.price = price;
		this.image = image;
		this.qty = qty;
	}
	public CartItem() {
		
	}
	
}

package edu.poly.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@Entity
public class Top10 implements Serializable{
	@Id
	Product product;
	long sum;
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public long getSum() {
		return sum;
	}
	public void setSum(long sum) {
		this.sum = sum;
	}
	public Top10(Product product, long sum) {
		
		this.product = product;
		this.sum = sum;
	}
	public Top10() {
		
	}
	
	
}

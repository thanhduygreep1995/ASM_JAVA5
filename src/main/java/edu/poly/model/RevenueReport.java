package edu.poly.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@Entity
public class RevenueReport implements Serializable{
	@Id
	Category category;
	double revenue;
	long count;
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public double getRevenue() {
		return revenue;
	}
	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}
	public long getCount() {
		return count;
	}
	public void setCount(long count) {
		this.count = count;
	}
	public RevenueReport(Category category, double revenue, long count) {
		
		this.category = category;
		this.revenue = revenue;
		this.count = count;
	}
	public RevenueReport() {
		
	}
	
}	

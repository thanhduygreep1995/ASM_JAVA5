package edu.poly.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data

public class ReportCategory implements Serializable  {
	@Id
	Serializable group;
	long sum;
	long count;
	public Serializable getGroup() {
		return group;
	}
	public void setGroup(Serializable group) {
		this.group = group;
	}
	public long getSum() {
		return sum;
	}
	public void setSum(long sum) {
		this.sum = sum;
	}
	public long getCount() {
		return count;
	}
	public void setCount(long count) {
		this.count = count;
	}
	public ReportCategory(Serializable group, long sum, long count) {
		super();
		this.group = group;
		this.sum = sum;
		this.count = count;
	}
	public ReportCategory() {
		
	}
	
}

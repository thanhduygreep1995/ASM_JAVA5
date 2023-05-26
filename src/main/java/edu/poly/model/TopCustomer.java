package edu.poly.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@Entity
public class TopCustomer {
	@Id
	Account account;
	long count;
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public long getCount() {
		return count;
	}
	public void setCount(long count) {
		this.count = count;
	}
	public TopCustomer(Account account, long count) {
		
		this.account = account;
		this.count = count;
	}
	public TopCustomer() {
		
	}
	
	
}	

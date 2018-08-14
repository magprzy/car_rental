package com.capgemini.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "Rental")
public class RentalEntity {

	@Id
	@GeneratedValue  (strategy = GenerationType.AUTO)
	private Long id;
	

	private Date rentalDate;
	private Date returnDate;
	private Long cost;
	
	@ManyToOne
	private BranchEntity rentalBranch;
	
	@ManyToOne
	private BranchEntity returnBranch;
	
	@ManyToOne
	private ClientEntity client;
	
	@ManyToOne
	private CarEntity car;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Date getRentalDate() {
		return rentalDate;
	}
	public void setRentalDate(Date rentalDate) {
		this.rentalDate = rentalDate;
	}
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public Long getCost() {
		return cost;
	}
	public void setCost(Long cost) {
		this.cost = cost;
	}
	
}

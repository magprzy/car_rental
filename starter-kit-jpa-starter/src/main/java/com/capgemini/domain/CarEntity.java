package com.capgemini.domain;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.capgemini.enums.CarBrand;
import com.capgemini.enums.CarType;
import com.capgemini.enums.Color;

@Entity
@Table (name = "Car")
public class CarEntity {

	@Id 
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long id;
	
	private CarType type;
	private CarBrand brand;
	private Date manufactureYear;
	private Color color; 
	private long engineSize;
	private long power;
	private long mileage;
	
	@ManyToMany 
	@JoinTable (name = "WORKER_CAR",
				joinColumns = {@JoinColumn (name="CAR_ID")},
				inverseJoinColumns = {@JoinColumn(name="WORKER_ID")})
	 private Set<WorkerEntity> workers;

	
	@OneToMany (mappedBy="car")
	private Set<RentalEntity> rentals;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public CarType getType() {
		return type;
	}
	public void setType(CarType type) {
		this.type = type;
	}
	public CarBrand getBrand() {
		return brand;
	}
	public void setBrand(CarBrand brand) {
		this.brand = brand;
	}
	public Date getManufactureYear() {
		return manufactureYear;
	}
	public void setManufactureYear(Date manufactureYear) {
		this.manufactureYear = manufactureYear;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public long getEngineSize() {
		return engineSize;
	}
	public void setEngineSize(long engineSize) {
		this.engineSize = engineSize;
	}
	public long getPower() {
		return power;
	}
	public void setPower(long power) {
		this.power = power;
	}
	public long getMileage() {
		return mileage;
	}
	public void setMileage(long mileage) {
		this.mileage = mileage;
	}
	public Set<WorkerEntity> getWorkers() {
		return workers;
	}
	public void setWorkers(Set<WorkerEntity> workers) {
		this.workers = workers;
	}
	public Set<RentalEntity> getRentals() {
		return rentals;
	}
	public void setRentals(Set<RentalEntity> rentals) {
		this.rentals = rentals;
	}
	

	
}

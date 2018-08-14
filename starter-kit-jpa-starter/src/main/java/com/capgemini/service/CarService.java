package com.capgemini.service;

import java.util.List;

import com.capgemini.domain.CarEntity;
import com.capgemini.domain.WorkerEntity;
import com.capgemini.enums.CarBrand;
import com.capgemini.enums.CarType;

public interface CarService {

	/*void addCar(CarTO car);
	void removeCar(CarTO car);
	CarTO changeInformation(CarTO car);
	void assignWorker(CarTO car, WorkerEntity worker);
	List<CarEntity> findCarByType(CarType type, CarBrand brand);
	List<CarEntity> findByWorker(WorkerEntity worker);
	*/
	void addCar(CarEntity car);

	void removeCar(CarEntity car);

	CarEntity changeInformation(CarEntity car);

	void assignWorker(CarEntity car, WorkerEntity worker);

	List<CarEntity> findCarByTypeAndBrand(CarType type, CarBrand brand);

	List<CarEntity> findByWorker(Long workerId);
}

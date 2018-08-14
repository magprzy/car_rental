package com.capgemini.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.capgemini.domain.CarEntity;
import com.capgemini.domain.WorkerEntity;
import com.capgemini.enums.CarBrand;
import com.capgemini.enums.CarType;


public interface CarDao extends Dao <CarEntity, Long> {

	void assignWorker(CarEntity car, WorkerEntity worker);
	
	List<CarEntity> findCarsByTypeAndBrand(CarType type, CarBrand brand);
	
	List<CarEntity> findCarsByWorker (Long workerId);
	
	
	
}

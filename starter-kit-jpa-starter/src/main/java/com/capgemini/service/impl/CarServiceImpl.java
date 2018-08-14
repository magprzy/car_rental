package com.capgemini.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.dao.CarDao;
import com.capgemini.domain.CarEntity;
import com.capgemini.domain.WorkerEntity;
import com.capgemini.enums.CarBrand;
import com.capgemini.enums.CarType;
import com.capgemini.service.CarService;

@Service
public class CarServiceImpl implements CarService {
	
	@Autowired
	private CarDao carDao;

	@Override
	public void addCar(CarEntity car) {
		//carDao.save(CarMapper.toCarEntity(car));
		carDao.save(car);

	}

	@Override
	public void removeCar(CarEntity car) {
		//carDao.delete(CarMapper.toCarEntity(car));
		carDao.delete(car);
	}

	@Override
	public CarEntity changeInformation(CarEntity car) {
		//CarEntity carEntity = carDao.update(CarMapper.toCarEntity(car));
		//return CarMapper.toCarTO(carEntity);
		return carDao.update(car);
	}

	@Override
	public void assignWorker(CarEntity car, WorkerEntity worker) {
		carDao.assignWorker(car, worker);
	}

	@Override
	public List<CarEntity> findCarByTypeAndBrand(CarType type, CarBrand brand) {
		List<CarEntity> cars = carDao.findCarsByTypeAndBrand(type, brand);
 		return cars;
	}

	@Override
	public List<CarEntity> findByWorker(Long workerId) {
		List<CarEntity> cars = carDao.findCarsByWorker(workerId);
		return cars;
	}

}

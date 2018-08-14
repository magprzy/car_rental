package com.capgemini.dao.impl;

import java.util.List;
import java.util.Set;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capgemini.dao.CarDao;
import com.capgemini.domain.CarEntity;
import com.capgemini.domain.WorkerEntity;
import com.capgemini.enums.CarBrand;
import com.capgemini.enums.CarType;

@Repository
public class CarDaoImpl extends AbstractDao<CarEntity, Long> implements CarDao {


	@Override
	public void assignWorker(CarEntity car, WorkerEntity worker) {
	 Set<WorkerEntity> workers = car.getWorkers();
	 workers.add(worker);
	 car.setWorkers(workers);
	 
	 Set<CarEntity> cars = worker.getCars();
	 cars.add(car);
	 worker.setCars(cars);

	}

	@Override
	public List<CarEntity> findCarsByTypeAndBrand(CarType type, CarBrand brand) {
		TypedQuery<CarEntity> query = entityManager.createQuery(
				"select car from CarEntity car where upper(car.type) = upper(:type) AND upper(car.brand) = upper(:brand)", CarEntity.class);
		query.setParameter("type", type);
		return query.getResultList();
	}

	@Override
	public List<CarEntity> findCarsByWorker(Long workerId) {
		TypedQuery<CarEntity> query = entityManager.createNamedQuery("cars.findCarsByWorker", CarEntity.class);
		query.setParameter("workerId", workerId);
		return query.getResultList();
				
	}
	

}

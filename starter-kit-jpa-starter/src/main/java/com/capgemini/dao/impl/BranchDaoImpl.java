package com.capgemini.dao.impl;

import java.util.List;
import java.util.Set;

import com.capgemini.dao.BranchDao;
import com.capgemini.domain.BranchEntity;
import com.capgemini.domain.WorkerEntity;

public class BranchDaoImpl extends AbstractDao<BranchEntity, Long> implements BranchDao {



	@Override
	public void addWorkerToBranch(WorkerEntity worker, BranchEntity branch) {
		Set<WorkerEntity> workers = branch.getWorkers();
		workers.add(worker);
		branch.setWorkers(workers);

	}

	@Override
	public List<WorkerEntity> findAllWorkersByBranch(Long branchId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<WorkerEntity> findAllWorkersByBranchAndByCar(Long branchId, Long carId) {
		// TODO Auto-generated method stub
		return null;
	}

}

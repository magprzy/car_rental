package com.capgemini.dao;

import java.util.List;

import com.capgemini.domain.BranchEntity;
import com.capgemini.domain.WorkerEntity;

public interface BranchDao extends Dao<BranchEntity, Long> {
	
	
	void addWorkerToBranch(WorkerEntity worker, BranchEntity branch);
	

	
	List<WorkerEntity> findAllWorkersByBranch (Long branchId);
	
	List<WorkerEntity> findAllWorkersByBranchAndByCar (Long branchId, Long carId);
	

}

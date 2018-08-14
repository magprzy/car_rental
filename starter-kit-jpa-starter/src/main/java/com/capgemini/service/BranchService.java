package com.capgemini.service;

import java.util.List;

import com.capgemini.types.BranchTO;
import com.capgemini.types.CarTO;
import com.capgemini.types.WorkerTO;

public interface BranchService {

	void addBranch(BranchTO branch);

	void removeBranch(BranchTO branch);

	CarTO changeInformation(BranchTO branch);

	void addWorkerToBranch(Long workerId, Long branchId);

	List<WorkerTO> findAllWorkersByBranch(Long branchId);

	List<WorkerTO> findAllWorkersByBranchAndByCar(Long branchId, Long carId);

}

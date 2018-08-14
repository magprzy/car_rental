package com.capgemini.service.impl;

import java.util.List;

import com.capgemini.service.BranchService;
import com.capgemini.types.BranchTO;
import com.capgemini.types.CarTO;
import com.capgemini.types.WorkerTO;

public class BranchServiceImpl implements BranchService {

	@Override
	public void addBranch(BranchTO branch) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeBranch(BranchTO branch) {
		// TODO Auto-generated method stub

	}

	@Override
	public CarTO changeInformation(BranchTO branch) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addWorkerToBranch(Long workerId, Long branchId) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<WorkerTO> findAllWorkersByBranch(Long branchId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<WorkerTO> findAllWorkersByBranchAndByCar(Long branchId, Long carId) {
		// TODO Auto-generated method stub
		return null;
	}

}

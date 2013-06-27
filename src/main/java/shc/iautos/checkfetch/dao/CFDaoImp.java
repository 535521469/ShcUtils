package shc.iautos.checkfetch.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import shc.iautos.domain.IautosCarInfo;

@Repository
public class CFDaoImp implements CFDao {

	@Override
	public List<IautosCarInfo> listIncompletedCars() {
		return null;
	}

}

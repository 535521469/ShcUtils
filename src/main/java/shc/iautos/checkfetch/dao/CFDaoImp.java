package shc.iautos.checkfetch.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import shc.iautos.domain.IautosCarInfo;

@Repository
public class CFDaoImp implements CFDao {

	public List<IautosCarInfo> listIncompletedCars() {

		List<IautosCarInfo> i = new ArrayList<IautosCarInfo>();
		i.add(new IautosCarInfo());

		return i;
	}
}
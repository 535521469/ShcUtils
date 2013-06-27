package shc.iautos.checkfetch.dao;

import java.util.List;

import shc.iautos.domain.IautosCarInfo;

public interface CFDao {

	public List<IautosCarInfo> listIncompletedCars();
}

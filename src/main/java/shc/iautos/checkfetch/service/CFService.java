package shc.iautos.checkfetch.service;

import java.util.List;

import shc.iautos.domain.IautosCarInfo;

public interface CFService  {
	public List<IautosCarInfo> listIncompletedCars();
}

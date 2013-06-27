package shc.iautos.checkfetch.service;

import java.util.List;

import org.springframework.stereotype.Service;

import shc.iautos.checkfetch.dao.CFDao;
import shc.iautos.domain.IautosCarInfo;

@Service
public class CFServiceImp implements CFService {

	private CFDao cfDao;

	public CFDao getCfDao() {
		return cfDao;
	}

	public void setCfDao(CFDao cfDao) {
		this.cfDao = cfDao;
	}

	@Override
	public List<IautosCarInfo> listIncompletedCars() {
		return this.getCfDao().listIncompletedCars();
	}

}

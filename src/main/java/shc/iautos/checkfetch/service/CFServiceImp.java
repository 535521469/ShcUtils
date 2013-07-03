package shc.iautos.checkfetch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import shc.iautos.checkfetch.dao.CFDao;
import shc.iautos.domain.IautosSellerInfo;

@Service("cfService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class CFServiceImp implements CFService {

	@Autowired
	private CFDao cfDao;

	public CFDao getCfDao() {
		return cfDao;
	}

	@Autowired
	public void setCfDao(CFDao cfDao) {
		this.cfDao = cfDao;
	}

	@Override
	public List<IautosSellerInfo> listIncompletedSellers() {
		return this.getCfDao().listIncompletedSellers();
	}

	@Override
	public IautosSellerInfo getIncompletedSeller(String seqID) {
		return this.getCfDao().getIncompletedSeller(seqID);
	}

	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public void saveIncompletedSeller(IautosSellerInfo iautosSellerInfo) {
		this.getCfDao().saveIncompletedSeller(iautosSellerInfo);
	}

}

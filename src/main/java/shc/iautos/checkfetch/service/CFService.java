package shc.iautos.checkfetch.service;

import java.util.List;

import shc.iautos.domain.IautosSellerInfo;

public interface CFService {
	public List<IautosSellerInfo> listIncompletedSellers();
	public IautosSellerInfo getIncompletedSeller(String seqID);
	public void saveIncompletedSeller(IautosSellerInfo iautosSellerInfo);
}

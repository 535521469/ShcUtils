package shc.iautos.checkfetch.dao;

import java.util.List;

import shc.iautos.domain.IautosSellerInfo;

public interface CFDao {

	public List<IautosSellerInfo> listIncompletedSellers();
	public IautosSellerInfo getIncompletedSeller(String seqID);
	public void saveIncompletedSeller(IautosSellerInfo iautosSellerInfo);
}

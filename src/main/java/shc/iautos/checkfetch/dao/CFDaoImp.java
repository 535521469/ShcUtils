package shc.iautos.checkfetch.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import shc.iautos.domain.IautosSellerInfo;

@Repository("cfDao")
public class CFDaoImp implements CFDao {

	private EntityManager entityManager;

	// private EntityManagerFactory entityManagerFactory;
	// public EntityManager getEntityManager() {
	// if (null == this.entityManager) {
	// this.entityManager = this.entityManagerFactory
	// .createEntityManager();
	// }
	// return entityManager;
	// }
	// public void setEntityManagerFactory(
	// EntityManagerFactory entityManagerFactory) {
	// this.entityManagerFactory = entityManagerFactory;
	// }

	public EntityManager getEntityManager() {
		return entityManager;
	}

	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public List<IautosSellerInfo> listIncompletedSellers() {

		EntityManager em = this.getEntityManager();
		Query query = em
				.createQuery("from IautosSellerInfo as s where s.shopName is null or s.shopAddress is null or s.shopPhone is null");

		@SuppressWarnings("unchecked")
		List<IautosSellerInfo> i = (List<IautosSellerInfo>) query
				.getResultList();
		return i;
	}

	@Override
	public IautosSellerInfo getIncompletedSeller(String seqID) {
		EntityManager em = this.getEntityManager();
		return em.find(IautosSellerInfo.class, seqID);
	}

	@Override
	public void saveIncompletedSeller(IautosSellerInfo iautosSellerInfo) {
		EntityManager em = this.getEntityManager();
		IautosSellerInfo isi = em.find(IautosSellerInfo.class,
				iautosSellerInfo.getSeqID());
		// em.merge(iautosSellerInfo);
		isi.setShopAddress(iautosSellerInfo.getShopAddress());
		isi.setShopPhone(iautosSellerInfo.getShopPhone());
		isi.setShopName(iautosSellerInfo.getShopName());
		System.out.println(isi);
		em.flush();
	}
}
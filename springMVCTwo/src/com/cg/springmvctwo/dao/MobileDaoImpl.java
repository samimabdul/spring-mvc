package com.cg.springmvctwo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.springmvctwo.dto.Mobile;
@Repository("mobiledao")
public class MobileDaoImpl implements MobileDao{
	@PersistenceContext
 EntityManager em;
	@Override
	public void addMobile(Mobile mobile) {
		// TODO Auto-generated method stub
		em.persist(mobile);//use for make data enter into table
		em.flush();//use to exit from persist
	}

	@Override
	public List<Mobile> showAllmobile() {
		Query query= em.createQuery("FROM Mobile");
		@SuppressWarnings("unchecked")
		List<Mobile> myAll=query.getResultList();
		// TODO Auto-generated method stub
		return myAll;
	}

	@Override
	public void deleteMobile(int mobId) {
		
		Query queryDelete=em.createQuery("DELETE FROM Mobile WHERE mobId=:mo");
		queryDelete.setParameter("mo", mobId);
		
	
	queryDelete.executeUpdate();
	
	 
		// TODO Auto-generated method stub
		
	}

	@Override
	public Mobile searchMobile(int mobId) {
		Query querySerach=em.createQuery("FROM Mobile WHERE mobId=:mobdata");
		querySerach.setParameter("mobdata", mobId);
		Mobile mob=(Mobile) querySerach.getResultList().get(0);
return mob;		
	}

	@Override
	public void updateMobile(int mobId) {
		// TODO Auto-generated method stub
		
	}
	

}

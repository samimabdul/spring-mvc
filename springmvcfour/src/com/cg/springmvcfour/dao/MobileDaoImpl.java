package com.cg.springmvcfour.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.springmvcfour.dto.Mobile;
@Repository("mobiledao")
public class MobileDaoImpl implements MobileDao {
@PersistenceContext
EntityManager em;
	
	
	@Override
	public List<Mobile> getAllDetails() {
		Query query= em.createQuery("FROM Mobile");
		@SuppressWarnings("unchecked")
		List<Mobile> myAll=query.getResultList();
		// TODO Auto-generated method stub
		return myAll;
	}


}

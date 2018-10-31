package com.cg.springmvctwo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.springmvctwo.dao.MobileDao;
import com.cg.springmvctwo.dto.Mobile;
@Service("mobileservice")
@Transactional
//this annotation enabels transaction<tx:annotation-driven transaction-manager="transactionManager"/>  
public class MobileServiceImpl implements MobileService {
@Autowired//use to connect two bins here dao and service
MobileDao mobiledao;
	@Override
	public void addMobile(Mobile mobile) {
		// TODO Auto-generated method stub
		mobiledao.addMobile(mobile);
	}

	@Override
	public List<Mobile> showAllmobile() {
		return mobiledao.showAllmobile();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMobile(int mobId) {
		// TODO Auto-generated method stub
		mobiledao.deleteMobile(mobId);
	}

	@Override
	public Mobile searchMobile(int mobId) {
		// TODO Auto-generated method stub
		return mobiledao.searchMobile(mobId);
	}

	@Override
	public void updateMobile(int mobId) {
		// TODO Auto-generated method stub
		
	}

}

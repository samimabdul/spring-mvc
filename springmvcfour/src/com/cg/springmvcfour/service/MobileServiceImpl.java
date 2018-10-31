package com.cg.springmvcfour.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.springmvcfour.dao.MobileDao;
import com.cg.springmvcfour.dto.Mobile;
@Service
@Transactional
public class MobileServiceImpl implements MobileService {

	@Autowired
	MobileDao mobiledao;
	@Override
	public List<Mobile> getAllDetails() {
		// TODO Auto-generated method stub
		return mobiledao.getAllDetails();
	}

}

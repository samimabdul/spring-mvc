package com.cg.springmvctwo.dao;

import java.util.List;

import com.cg.springmvctwo.dto.Mobile;

public interface MobileDao {
	public void addMobile(Mobile mobile);
	public List<Mobile> showAllmobile();
	public void deleteMobile(int mobId);
	public Mobile searchMobile(int mobId);
	public void updateMobile(int mobId);

}

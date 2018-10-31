package com.cg.springmvctwo.service;



import java.util.List;

import com.cg.springmvctwo.dto.Mobile;

public interface MobileService {
	public void addMobile(Mobile mobile);
	public List<Mobile> showAllmobile();
	public void deleteMobile(int mobId);
	public Mobile searchMobile(int mobId);
	public void updateMobile(int mobId);

}

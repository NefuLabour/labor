package com.oracle.labor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oracle.labor.dao.ZjGrqzdjbMapper;
import com.oracle.labor.po.ZjGrqzdjb;

//个人求职冻结解冻模块用到的ZjGrqzdjd表相关
@Service
public class ZjGrqzdjdService {
	
	@Autowired
	ZjGrqzdjbMapper djDao;
	
	public void updateDjjdInfo(String bip_id,String sfdj){
		djDao.updateDjjdInfo(bip_id, sfdj);
	}
	
	public ZjGrqzdjb getZjGrqzdjbByBipId(String bip_id){
		return djDao.selectByBipId(bip_id);
	}
}

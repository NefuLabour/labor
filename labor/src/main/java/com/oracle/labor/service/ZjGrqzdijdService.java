package com.oracle.labor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oracle.labor.dao.ZjGrqzdjbMapper;
import com.oracle.labor.dao.ZjGrqzdjjdbMapper;
import com.oracle.labor.po.ZjGrqzdjb;
import com.oracle.labor.po.ZjGrqzdjjdb;

//个人求职冻结解冻模块用到的ZjGrqzdijd表相关
@Service
public class ZjGrqzdijdService {

	@Autowired
	ZjGrqzdjjdbMapper djjdDao;
	
	@Autowired
	ZjGrqzdjbMapper djDao;
	
	@Transactional
	public void executeQzdjjd(ZjGrqzdjjdb zjGrqzdjjdb,String bip_id,String sfdj){
		djDao.updateDjjdInfo(bip_id,sfdj);
		djjdDao.insert(zjGrqzdjjdb);
	}
	
	
}

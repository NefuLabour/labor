package com.oracle.labor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oracle.labor.dao.BipMapper;
import com.oracle.labor.po.Bip;
import com.oracle.labor.po.ZjGrqzdjjdb;

//与bip表相关的service

@Service
public class BipService {

	@Autowired
	BipMapper dao;
	
	public Bip getBipInfoByCitizenid(String citizenid){
	
		return dao.selectByCitizenid(citizenid);
	}
	
	public String getBipNameByCitizenid(String citizenid){
		
		return dao.selectByCitizenid(citizenid).getBipName();
	}
	
	public Bip getBipById(String bipId){
		
		return dao.selectByPrimaryKey(bipId);
	}
	
}

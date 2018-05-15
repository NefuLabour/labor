package com.oracle.labor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oracle.labor.dao.QzgdMapper;
import com.oracle.labor.vo.QzgdQueryVO;
import com.oracle.labor.vo.QzgdVO;

//求职归档模块相关Service
@Service
public class QzgdService {
	
	@Autowired
	QzgdMapper qzgdDao;

	public List<QzgdVO> queryOne(QzgdQueryVO qzgdQueryVo){

		return qzgdDao.queryOne(qzgdQueryVo);
	}
	
	public void executeGd(String qzbh){
		
		qzgdDao.executeGd(qzbh);
	}
}

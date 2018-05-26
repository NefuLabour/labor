package com.oracle.labor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oracle.labor.dao.TuijianMapper;
import com.oracle.labor.vo.TjcxQueryVO;
import com.oracle.labor.vo.TjcxVO;

@Service
public class TjcxService {

	@Autowired
	TuijianMapper dao;
	
	public List<TjcxVO> queryTuijian(TjcxQueryVO tjcxQueryVO){
		return dao.queryTuijian(tjcxQueryVO);
	}
}

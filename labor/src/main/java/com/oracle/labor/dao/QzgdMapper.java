package com.oracle.labor.dao;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.oracle.labor.vo.QzgdQueryVO;
import com.oracle.labor.vo.QzgdVO;

//求职归档模块相关Dao
@Repository
public interface QzgdMapper {

	public List<QzgdVO> queryOne(QzgdQueryVO qzgdQueryVo);
	
	public void executeGd(String qzbh);
}

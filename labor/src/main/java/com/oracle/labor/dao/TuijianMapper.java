package com.oracle.labor.dao;

import java.util.List;

import com.oracle.labor.vo.TjcxQueryVO;
import com.oracle.labor.vo.TjcxVO;

public interface TuijianMapper {
	
	public List<TjcxVO> queryTuijian(TjcxQueryVO tjcxQueryVOss);
	
}

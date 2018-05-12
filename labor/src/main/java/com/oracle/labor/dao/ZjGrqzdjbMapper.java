package com.oracle.labor.dao;

import com.oracle.labor.po.ZjGrqzdjb;
import com.oracle.labor.po.ZjGrqzdjbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

//个人求职冻结解冻模块用到的ZjGrqzdjd表相关
public interface ZjGrqzdjbMapper {
    long countByExample(ZjGrqzdjbExample example);

    int deleteByExample(ZjGrqzdjbExample example);

    int deleteByPrimaryKey(String qzbh);

    int insert(ZjGrqzdjb record);

    int insertSelective(ZjGrqzdjb record);

    List<ZjGrqzdjb> selectByExample(ZjGrqzdjbExample example);

    ZjGrqzdjb selectByPrimaryKey(String qzbh);
    
    ZjGrqzdjb selectByBipId(String bip_id);

    int updateByExampleSelective(@Param("record") ZjGrqzdjb record, @Param("example") ZjGrqzdjbExample example);

    int updateByExample(@Param("record") ZjGrqzdjb record, @Param("example") ZjGrqzdjbExample example);

    int updateByPrimaryKeySelective(ZjGrqzdjb record);

    int updateByPrimaryKey(ZjGrqzdjb record);
    
    int updateDjjdInfo(@Param("bip_id")String bip_id,@Param("sfdj")String sfdj);
}
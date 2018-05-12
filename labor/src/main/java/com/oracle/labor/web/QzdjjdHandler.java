package com.oracle.labor.web;



import java.sql.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oracle.labor.common.util.GenerateID;
import com.oracle.labor.po.Bip;
import com.oracle.labor.po.ZjGrqzdjb;
import com.oracle.labor.po.ZjGrqzdjjdb;
import com.oracle.labor.service.BipService;
import com.oracle.labor.service.ZjGrqzdijdService;
import com.oracle.labor.service.ZjGrqzdjdService;

//个人求职冻结解冻模块
@RequestMapping("/qzdjjd")
@Controller
public class QzdjjdHandler {

	@Autowired
	BipService bipService;
	
	@Autowired
	ZjGrqzdjdService zjGrqzddbService;
	
	@Autowired
	ZjGrqzdijdService zjGrqzdijdService;
	
	@RequestMapping("/qzdjjd1")
	public String qzdjjd1(String bip_citizenid,Model model){
		Bip jddj_user = bipService.getBipInfoByCitizenid(bip_citizenid);
		model.addAttribute("jddj_user", jddj_user);
		ZjGrqzdjb jddj = zjGrqzddbService.getZjGrqzdjbByBipId(jddj_user.getBipId());
		model.addAttribute("SFDJ", jddj.getSfdj());
		return "grqz/qzdjjd_2";
	}
	
	@ResponseBody
	@RequestMapping(value="/getName")
	public String getNameByCitizenid(String bip_citizenid) {
		
		return bipService.getBipNameByCitizenid(bip_citizenid);
	}
	
	@RequestMapping("/qzdjjd2/{bipId}")
	public String qzdjjd2(@PathVariable("bipId")String bipId,Model model,String djreason){
		Bip djjd_user = bipService.getBipById(bipId);
		ZjGrqzdjb dj_user = zjGrqzddbService.getZjGrqzdjbByBipId(bipId);
		//是否冻结标志，1未冻结，进行冻结操作；2已冻结，进行解冻操作
		String sfdj = dj_user.getSfdj();
		String qzbh = dj_user.getQzbh();
		ZjGrqzdjjdb djjd = new ZjGrqzdjjdb();
		if(sfdj.equals("1")){
			djjd.setGrdjjdbh(GenerateID.getGenerateId());
			djjd.setQzbh(qzbh);
			djjd.setDojyy(djreason);
			djjd.setDojsj(new Date(System.currentTimeMillis()).toString());
			zjGrqzdijdService.executeQzdjjd(djjd,bipId,"2");
		}else{
			djjd.setGrdjjdbh(GenerateID.getGenerateId());
			djjd.setQzbh(qzbh);
			djjd.setJidyy(djreason);
			djjd.setJidsj(new Date(System.currentTimeMillis()).toString());
			zjGrqzdijdService.executeQzdjjd(djjd,bipId,"1");
		}
		model.addAttribute("userInfo", djjd_user);
		model.addAttribute("djjdInfo", djjd);
		return "grqz/qzdjjd_3";
	}
	
}

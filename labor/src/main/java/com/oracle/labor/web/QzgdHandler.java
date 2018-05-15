package com.oracle.labor.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.oracle.labor.service.QzgdService;
import com.oracle.labor.vo.QzgdQueryVO;
import com.oracle.labor.vo.QzgdVO;

//求职归档模块相关Controller

@Controller
@RequestMapping("/qzgd")
public class QzgdHandler {
	
	@Autowired
	QzgdService qzgdService;

	@RequestMapping("/qzgd_1")
	public String qzgd_Query(Model model,QzgdQueryVO qzgdQueryVo){
		System.out.println(qzgdQueryVo.getBipName());
		List<QzgdVO> qzgdVO = qzgdService.queryOne(qzgdQueryVo);
		System.out.println(qzgdVO);
		model.addAttribute("qzgdVO", qzgdVO);
		return "grqz/qzgd_2";
	}
	
	@RequestMapping("/qzgd_2")
	public String qzgdExecute(String qzbh){
		qzgdService.executeGd(qzbh);
		return "grqz/qzgd_1";
	}
}

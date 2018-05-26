package com.oracle.labor.web;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oracle.labor.service.QzgdService;
import com.oracle.labor.service.TjcxService;
import com.oracle.labor.vo.QzgdQueryVO;
import com.oracle.labor.vo.QzgdVO;
import com.oracle.labor.vo.TjcxQueryVO;
import com.oracle.labor.vo.TjcxVO;

@Controller
@RequestMapping("/tjcx")
public class TjcxHandler {

	
	@Autowired
	TjcxService tjcxService;


	@RequestMapping("/tjcx_1")
	public String tjcx1(Model model,TjcxQueryVO tjcxQueryVO){
		System.out.println(1);
		List<TjcxVO> tjcxVOs = tjcxService.queryTuijian(tjcxQueryVO);
//		if(tjcxVOs.size() == 0){
//			tjcxVOs = null;
//		}
		System.out.println(tjcxVOs);
		model.addAttribute("tjcxVOs", tjcxVOs);
		return "tjhz/tjxcx_2";
	}
	
}

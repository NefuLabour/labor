package com.oracle.labor.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oracle.labor.common.codetable.EducationallevelOperation;
import com.oracle.labor.common.codetable.EmploytypeOperation;
import com.oracle.labor.common.codetable.LanguageOperation;
import com.oracle.labor.common.codetable.PersonneltypeOperation;
import com.oracle.labor.common.codetable.RegtypeOperation;
import com.oracle.labor.common.codetable.RprtypeOperation;
import com.oracle.labor.common.codetable.SexOperation;
import com.oracle.labor.common.codetable.SpecialtyOperation;

@Controller
@RequestMapping("/common")
public class CommonHandler {

	//返回文本;
	@ResponseBody
	@RequestMapping(value="/language",produces="text/html;charset=UTF-8")
	public String getLanguage(String val) {
		String result=LanguageOperation.getOption(val);
		System.out.println(result);
		return result;
	}
	
	@ResponseBody
	@RequestMapping(value="/Educationallevel",produces="text/html;charset=UTF-8")
	public String getEducationallevel(String val) {
		String result=EducationallevelOperation.getOption(val);
		System.out.println(result);
		return result;
	}
	
	@ResponseBody
	@RequestMapping(value="/Sex",produces="text/html;charset=UTF-8")
	public String getSex(String val) {
		String result=SexOperation.getOption(val);
		System.out.println(result);
		return result;
	}
	
	@ResponseBody
	@RequestMapping(value="/Specialty",produces="text/html;charset=UTF-8")
	public String getSpecialty(String val) {
		String result=SpecialtyOperation.getOption(val);
		System.out.println(result);
		return result;
	}
	
	@ResponseBody
	@RequestMapping(value="/Personneltype",produces="text/html;charset=UTF-8")
	public String getPersonneltype(String val) {
		String result=PersonneltypeOperation.getOption(val);
		System.out.println(result);
		return result;
	}
	
	@ResponseBody
	@RequestMapping(value="/Employtype",produces="text/html;charset=UTF-8")
	public String getEmploytype(String val) {
		String result=EmploytypeOperation.getOption(val);
		System.out.println(result);
		return result;
	}
	
	@ResponseBody
	@RequestMapping(value="/Rprtype",produces="text/html;charset=UTF-8")
	public String getRprtype(String val) {
		String result=RprtypeOperation.getOption(val);
		System.out.println(result);
		return result;
	}
	
	@ResponseBody
	@RequestMapping(value="/Regtype",produces="text/html;charset=UTF-8")
	public String getRegtype(String val) {
		String result=RegtypeOperation.getOption(val);
		System.out.println(result);
		return result;
	}
	
}

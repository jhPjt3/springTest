package com.mvc.file.controller;

import java.io.File;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class ReportSubmissionController {

	@RequestMapping(value="/report/submission.do",method=RequestMethod.GET)
	public String form() {
		return "report/submissionForm";
	}
	
	@RequestMapping(value="/report/submitReport1.do",method=RequestMethod.POST)
	public String submitReport1(@RequestParam("studentNumber")String studentNumber,
			@RequestParam("report")MultipartFile report) throws Exception {
		
		// 오리지널 파일 이름 : 하드에 있는 파일 이름
		
		report.transferTo(new File("D:\\semi\\workspace\\springst10\\src\\main\\webapp\\resources\\img\\"
					+report.getOriginalFilename()));
			// getName()
		return "report/submissionComplete";
	}
}
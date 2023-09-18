package com.example.report_jasper.controller;

import com.example.report_jasper.respone.ResponseData;
import com.example.report_jasper.service.IReportService;
import net.sf.jasperreports.engine.JRException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequestMapping("api/document")
public class ReportController {
	
	@Autowired
	private IReportService reportService;

	@SuppressWarnings("deprecation")
	@PostMapping("/report-dynamic-template")
	public ResponseData<?> exportDynamicTemplate(@RequestBody String resquest, HttpServletResponse response) throws IOException {
		reportService.exportDynamicTemplate(resquest, response);
		return new ResponseData<>().success("Report success!");
	}

	@SuppressWarnings("deprecation")
	@PostMapping("/report-template")
	public void exportTemplate(@RequestBody String resquest) throws JRException {
		reportService.exportTemplate(resquest);
	}
}

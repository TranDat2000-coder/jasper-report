package com.example.report_jasper.service;

import java.io.IOException;

import com.example.report_jasper.exception.BusinessException;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.design.JRValidationException;
import org.xml.sax.SAXException;

import javax.servlet.http.HttpServletResponse;

public interface IReportService {
	
	void exportDynamicTemplate(String request, HttpServletResponse response) throws IOException;

	void exportTemplate(String request) throws JRException;

}

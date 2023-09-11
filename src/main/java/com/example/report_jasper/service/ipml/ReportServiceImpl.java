package com.example.report_jasper.service.ipml;

import com.example.report_jasper.InputData;
import com.example.report_jasper.entity.ReportTemplateEntity;
import com.example.report_jasper.exception.BusinessException;
import com.example.report_jasper.repository.ReportRepository;
import com.example.report_jasper.request.ReportDataRequest;
import com.example.report_jasper.service.IReportService;
import com.google.gson.Gson;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.design.JRValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xml.sax.InputSource;

import javax.annotation.processing.FilerException;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class ReportServiceImpl implements IReportService {
	
	@Autowired
	private ReportRepository jasperRepository;

	@Override
	public void exportDynamicTemplate(String request, HttpServletResponse response) throws IOException {

		Gson gson = new Gson();

		ReportDataRequest dataRequest = gson.fromJson(request, ReportDataRequest.class);
		String jsonReportData = gson.toJson(dataRequest.getReportData());

		ReportTemplateEntity getTemplate = jasperRepository.findByType(dataRequest.getType());

		Date date = new Date();
		SimpleDateFormat date_format1 = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
		String date_str = date_format1.format(date);

		String compileFile = "C:\\Users\\AH\\JaspersoftWorkspace\\MyReports\\Template_report2.jrxml";
		try {
//			InputSource compileFile = new InputSource(new ByteArrayInputStream(getTemplate.getSourceXML().getBytes(Charset.forName("UTF-8"))));
//			JasperReport jasperReport = JasperCompileManager.compileReport(compileFile.getByteStream());

			JasperReport jasperReport = JasperCompileManager.compileReport(compileFile);

			InputData inputData = new InputData();
			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, inputData.getParameters(jsonReportData), new JREmptyDataSource());
			if (jasperPrint == null) {
				throw new FilerException("File export failed");
			}
			JasperExportManager.exportReportToPdfStream(jasperPrint, response.getOutputStream());
			response.setContentType("application/pdf");
			response.addHeader("Content-Disposition", "inline; filename=jasperdemo" + date_str + ".pdf");
		} catch (JRException e) {
			throw new BusinessException("Report faile", 203);
		}
	}

	@Override
	public void exportTemplate(String request) throws JRException {
//		InputStream inputJson = new ByteArrayInputStream(request.getBytes());
//		JsonDataSource dataSources = new JsonDataSource(inputJson);
//		Map<String,Object> parameters = new ObjectMapper().readValue(json, HashMap.class);
		//		ExportRquest dataList = new Gson().fromJson(resquest, ExportRquest.class);
//		ExportInput exportInput = ExportDataAssembler.assemble(dataList);
//		String sourceFileName = "C:\\Users\\AH\\JaspersoftWorkspace\\MyReports\\template_report.jasper";
//
//		Date date = new Date();
//        SimpleDateFormat date_format1 = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
//        String date_str = date_format1.format(date);
//
//		try {
//			JRMapArrayDataSource dataSource = new JRMapArrayDataSource(new Object[] {exportInput.getDataSources()});
//			JasperPrint jasperPrint = JasperFillManager.fillReport(sourceFileName, exportInput.getParameters(dataList), dataSource);
//			if(jasperPrint != null) {
//
//				JasperExportManager.exportReportToPdfFile(jasperPrint, "D:\\example_"+date_str+".pdf");
////				JRDocxExporter exporter = new JRDocxExporter();
////				exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
////				exporter.setExporterOutput(new SimpleOutputStreamExporterOutput("D:\\example_"+date_str+".docx"));
////				exporter.exportReport();
//			}
//		}catch (JRException e) {
//			e.printStackTrace();
//		}
	}

}

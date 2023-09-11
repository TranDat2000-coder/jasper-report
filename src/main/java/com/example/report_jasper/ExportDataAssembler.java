package com.example.report_jasper;

import java.util.*;

import com.example.report_jasper.request.ReportDataRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class ExportDataAssembler {

	public static InputData assemble(ReportDataRequest exportRquest, String request) throws JsonProcessingException {
		
		InputData exportInput = new InputData();

		List<Object> exportRquests = new ArrayList<>();
		exportRquests.add(exportRquest.getReportData());
		
		JRBeanCollectionDataSource collectionDataSource = new JRBeanCollectionDataSource(exportRquests);
		exportInput.setExportDataSource(collectionDataSource);
		
		return exportInput;
	}

}

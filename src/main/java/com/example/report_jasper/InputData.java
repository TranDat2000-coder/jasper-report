package com.example.report_jasper;

import java.util.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class InputData {

	private JRBeanCollectionDataSource dataSource;

	public JRBeanCollectionDataSource getExportDataSource() {
		return dataSource;
	}

	public void setExportDataSource(JRBeanCollectionDataSource exportDataSource) {
		this.dataSource = exportDataSource;
	}

	public Map<String, Object> getParameters(String request) throws JsonProcessingException {
		Map<String, Object> parameters = new ObjectMapper().readValue(request, HashMap.class);
		return parameters;
	}

	public Map<String, Object> getDataSources() {
		Map<String, Object> dataSources = new HashMap<>();
		dataSources.put("dataSource", dataSource);
		return dataSources;
	}

}

package com.example.report_jasper;

import java.util.ArrayList;
import java.util.List;

import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class ConditionContent {

	private String content;
	
	private List<ExportSubContent> exportSubContents = new ArrayList<>();
	
	private JRBeanCollectionDataSource connectData;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public List<ExportSubContent> getExportSubContents() {
		return exportSubContents;
	}

	public void setExportSubContents(List<ExportSubContent> exportSubContents) {
		this.exportSubContents = exportSubContents;
	}

	public JRBeanCollectionDataSource getConnectData() {
		return new JRBeanCollectionDataSource(exportSubContents, false);
	}

	public void setConnectData(JRBeanCollectionDataSource connectData) {
		this.connectData = connectData;
	}
	
	
	
	
}

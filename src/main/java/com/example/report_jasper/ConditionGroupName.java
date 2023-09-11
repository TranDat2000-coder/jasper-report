package com.example.report_jasper;

import java.util.ArrayList;
import java.util.List;

import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class ConditionGroupName {

	private String groupName;
	private List<ConditionContent> conditionContents = new ArrayList<>();
	private JRBeanCollectionDataSource connectData;
	
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public List<ConditionContent> getConditionContents() {
		return conditionContents;
	}
	public void setConditionContents(List<ConditionContent> conditionContents) {
		this.conditionContents = conditionContents;
	}
	public JRBeanCollectionDataSource getConnectData() {
		return new JRBeanCollectionDataSource(conditionContents, false);
	}
	public void setConnectData(JRBeanCollectionDataSource connectData) {
		this.connectData = connectData;
	}
	
	
}

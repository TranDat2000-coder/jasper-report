package com.example.report_jasper;

import java.util.ArrayList;
import java.util.List;

import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class ConditionGroup {

	private String demandName;
	
	private List<ConditionGroupName> conditionGroupNames = new ArrayList<>();
	
	private JRBeanCollectionDataSource connectData;
	
	private List<Collateral> collaterals = new ArrayList<>();
	
	private JRBeanCollectionDataSource connectDataTSBD;
	
	public String getDemandName() {
		return demandName;
	}
	public void setDemandName(String demandName) {
		this.demandName = demandName;
	}
	public List<ConditionGroupName> getConditionGroupNames() {
		return conditionGroupNames;
	}
	public void setConditionGroupNames(List<ConditionGroupName> conditionGroupNames) {
		this.conditionGroupNames = conditionGroupNames;
	}
	public JRBeanCollectionDataSource getConnectData() {
		return new JRBeanCollectionDataSource(conditionGroupNames, false);
	}
	public void setConnectData(JRBeanCollectionDataSource connectData) {
		this.connectData = connectData;
	}
	
	public List<Collateral> getCollaterals() {
		return collaterals;
	}
	public void setCollaterals(List<Collateral> collaterals) {
		this.collaterals = collaterals;
	}
	
	public JRBeanCollectionDataSource getConnectDataTSBD() {
		return new JRBeanCollectionDataSource(collaterals, false);
	}
	public void setConnectDataTSBD(JRBeanCollectionDataSource connectDataTSBD) {
		this.connectDataTSBD = connectDataTSBD;
	}
	
}

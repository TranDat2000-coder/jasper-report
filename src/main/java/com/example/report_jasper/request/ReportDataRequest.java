package com.example.report_jasper.request;

import lombok.Data;

@Data
public class ReportDataRequest<T> {

	private String type;
	private T reportData;
}

package com.example.report_jasper.entity;


import javax.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name = "TEST_JASPER")
public class ReportTemplateEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "TYPE")
	private String type;
	
	@Lob
	@Column(name = "SOURCE_XML")
	private String sourceXML;
}

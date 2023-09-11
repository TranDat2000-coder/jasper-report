package com.example.report_jasper.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.report_jasper.entity.ReportTemplateEntity;

@Repository
public interface ReportRepository extends JpaRepository<ReportTemplateEntity, Long> {

	ReportTemplateEntity findByType(String type);
}

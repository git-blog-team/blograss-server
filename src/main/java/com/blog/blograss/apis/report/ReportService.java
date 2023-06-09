package com.blog.blograss.apis.report;

import org.springframework.http.ResponseEntity;

import com.blog.blograss.apis.report.object.ReportDto;
import com.blog.blograss.apis.report.object.ReportListParamDto;
import com.blog.blograss.commons.response.Message;

public interface ReportService {

    ResponseEntity<Message> getReportListPost(ReportListParamDto reportListParamDto);

    ResponseEntity<Message> getReportListComment(ReportListParamDto reportListParamDto);

    ResponseEntity<Message> getReportDetail(String reportId);

    ResponseEntity<Message> acceptReport(ReportDto reportDto, String adminId);

    ResponseEntity<Message> denyReport(ReportDto reportDto, String adminId);

    ResponseEntity<Message> insertReport(ReportDto reportDto);
}

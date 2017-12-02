package com.edu.linhhn.designpattern.IoC;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean(name="excelExport")
	public ExportData getExcelExportData(){
		return new ExcelExportDataImpl();
	}
	
	@Bean(name="csvExport")
	public ExportData getCSVExportData(){
		return new CSVExportDataImpl();
	}
	
	@Bean(name="viettel")
	public NotifyExport getViettel() {
		return new ViettelNotifyExportDataImpl();
	}
	
	@Bean(name="vina")
	public NotifyExport getVina() {
		return new VinaphoneNotifyExportDataImpl();
	}
	
}

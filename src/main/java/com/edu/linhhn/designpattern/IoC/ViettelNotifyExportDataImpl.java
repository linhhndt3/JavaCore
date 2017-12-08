package com.edu.linhhn.designpattern.IoC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ViettelNotifyExportDataImpl implements NotifyExport {
	
	@Autowired
	@Qualifier("excelExport")
	private ExportData exportData;

	@Override
	public void notify(String data) {
		// TODO Auto-generated method stub
		System.out.println("viettel notify export successfully");
		exportData.export(data);
	}
	
	

}

package com.edu.linhhn.designpattern.IoC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class VinaphoneNotifyExportDataImpl implements NotifyExport {
	
	@Autowired
	@Qualifier("csvExport")
	private ExportData exportData;
	
	@Override
	public void notify(String data) {
		// TODO Auto-generated method stub
		System.out.println("Vinaphone export successfully");
		exportData.export(data);
	}

}

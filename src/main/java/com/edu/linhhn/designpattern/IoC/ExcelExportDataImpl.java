package com.edu.linhhn.designpattern.IoC;

import org.springframework.stereotype.Component;

public class ExcelExportDataImpl implements ExportData {

	@Override
	public void export(String data) {
		System.out.println("excel exporting data");
	}

}

package com.edu.linhhn.designpattern.IoC;

public class CSVExportDataImpl implements ExportData {

	@Override
	public void export(String data) {
		System.out.println("CSV export data " + data);
	}

}

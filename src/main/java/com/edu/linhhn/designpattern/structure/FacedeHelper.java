package com.edu.linhhn.designpattern.structure;

public class FacedeHelper {
	public void genData(int dbType, int reportType) {
		if(dbType == 1 && reportType == 1) {
			MySqlHelper mySqlHelper = new MySqlHelper();
			mySqlHelper.genHTML(mySqlHelper.getConnection(), "");
			return;
		}
		
		if(dbType == 1 && reportType == 2) {
			MySqlHelper mySqlHelper = new MySqlHelper();
			mySqlHelper.genPDF(mySqlHelper.getConnection(), "");
			return;
		}
	}
}

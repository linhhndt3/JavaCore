package com.edu.linhhn.designpattern.structure;

import java.sql.Connection;

public class FacadeApp {
	public static void main(String[] args) {
		MySqlHelper mySqlHelper = new MySqlHelper();
		Connection connection = mySqlHelper.getConnection();
		mySqlHelper.genHTML(connection, "table");
	}
}

package com.edu.linhhn.designpattern.structure;

public class FileOperatorHelper {
	public static FileOperation createFileOperation() {
		String os = System.getProperty("os.name");
		if("Windows 11".equals(os)) {
			return new WindownFileOperationImpl();
		}
		return new UnixFileOperationImpl();
	}
	
	public static void main(String[] args) {
		String os = System.getProperty("os.name");
		if("Windows 10".equals(os)) {
			System.out.println("true");
		}
	}
}

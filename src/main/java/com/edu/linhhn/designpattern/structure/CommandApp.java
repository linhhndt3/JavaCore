package com.edu.linhhn.designpattern.structure;

public class CommandApp {
	public static void main(String[] args) {
		FileOperation fileOperation = FileOperatorHelper.createFileOperation();
		FileCommand fileCommand = new OpenFileCommand(fileOperation);
		FileInvoker fileInvoker = new FileInvoker();
		fileInvoker.invoke(fileCommand);
	}
}

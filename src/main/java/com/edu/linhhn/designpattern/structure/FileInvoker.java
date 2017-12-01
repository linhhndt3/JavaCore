package com.edu.linhhn.designpattern.structure;

public class FileInvoker {
	
	private FileCommand fileCommand;
	
	public FileInvoker() {
		
	}
	
	public FileInvoker(FileCommand fileCommand) {
		this.fileCommand = fileCommand;
	}
	
	public void invoke(FileCommand fileCommand) {
		fileCommand.excute();
	}
}

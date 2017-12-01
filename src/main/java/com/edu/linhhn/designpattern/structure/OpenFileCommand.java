package com.edu.linhhn.designpattern.structure;

public class OpenFileCommand implements FileCommand {
	
	private FileOperation fileOperation;
	
	public OpenFileCommand() {
		// TODO Auto-generated constructor stub
	}
	
	public OpenFileCommand(FileOperation fileOperation) {
		// TODO Auto-generated constructor stub
		this.fileOperation = fileOperation;
	}
	
	@Override
	public void excute() {
		// TODO Auto-generated method stub
		fileOperation.openFile();
	}

}

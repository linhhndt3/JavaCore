package com.edu.linhhn.designpattern.structure;

public class CloseFileCommand implements FileCommand {
	
	private FileOperation fileOperation;
	
	public CloseFileCommand() {
		// TODO Auto-generated constructor stub
	}
	
	public CloseFileCommand(FileOperation fileOperation) {
		// TODO Auto-generated constructor stub
		this.fileOperation = fileOperation;
	}

	@Override
	public void excute() {
		// TODO Auto-generated method stub
		fileOperation.closeFile();
	}
}

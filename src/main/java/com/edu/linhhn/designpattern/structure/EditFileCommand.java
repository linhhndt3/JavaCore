package com.edu.linhhn.designpattern.structure;

public class EditFileCommand implements FileCommand {
	private FileOperation fileOperation;
	
	public EditFileCommand() {
		// TODO Auto-generated constructor stub
	}
	
	public EditFileCommand(FileOperation fileOperation) {
		// TODO Auto-generated constructor stub
		this.fileOperation = fileOperation;
	}

	@Override
	public void excute() {
		// TODO Auto-generated method stub
		fileOperation.editFile();
	}
}

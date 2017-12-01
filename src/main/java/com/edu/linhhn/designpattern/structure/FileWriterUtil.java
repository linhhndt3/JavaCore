package com.edu.linhhn.designpattern.structure;

public class FileWriterUtil {

	private String fileName;
	
	private StringBuilder content;
	
	private Memo memo;
	
	public FileWriterUtil() {
		
	}
	
	public FileWriterUtil(String filename) {
		this.fileName = filename;
		content = new StringBuilder();
	}

	public void write(String s) {
		content.append(s + " ");
	}

	public Memo save() {
		memo =  new Memo(fileName, content);
		return memo;
	}
	
	public Memo unsave() {
		return memo;
	}
	
	public class Memo {
		private String fileName;
		
		private StringBuilder content;
		
		public Memo() {
			
		}
		
		public Memo(String filename, StringBuilder content) {
			this.fileName = filename;
			this.content = new StringBuilder(content);
		}

		public String getFileName() {
			return fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
		}

		public StringBuilder getContent() {
			return content;
		}

		public void setContent(StringBuilder content) {
			this.content = content;
		}

		@Override
		public String toString() {
			return "Memo [fileName=" + fileName + ", content="
					+ content + "]";
		}
		
	}

	@Override
	public String toString() {
		return "FileWriterUtil [fileName=" + fileName + ", content="
				+ content + "]";
	}
	
}

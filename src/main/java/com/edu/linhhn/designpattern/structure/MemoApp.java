package com.edu.linhhn.designpattern.structure;

import com.edu.linhhn.designpattern.structure.FileWriterUtil.Memo;

public class MemoApp {
	public static void main(String[] args) {
		FileWriterUtil fileWriterUtil = new FileWriterUtil("Danhsachhocsinh");
		
		fileWriterUtil.write("LeVanA");
		fileWriterUtil.write("TranVanB");
		Memo memo1 = fileWriterUtil.save();
		System.out.println(memo1);
		
		fileWriterUtil.write("NguyenThiC");
		Memo memo2 = fileWriterUtil.save();
		System.out.println(memo2);
		fileWriterUtil.write("Alex");
		
		Memo memo3 = fileWriterUtil.unsave();
		System.out.println(memo3);
	}
}

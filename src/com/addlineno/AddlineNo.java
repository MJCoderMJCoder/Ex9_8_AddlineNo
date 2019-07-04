package com.addlineno;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class AddlineNo {

	public static void main(String[] args) {
		String str = null;
		try{
			FileReader file = new FileReader(".\\src\\com\\addlineno\\AddlineNo.java");
			LineNumberReader in = new LineNumberReader(file); //跟踪行号的缓冲字符输入流
			while ((str = in.readLine()) != null) //readLine():从流中读取一行字符
				System.out.println(in.getLineNumber() + ":" + str); //加上行号后显示
			in.close();
		} catch(IOException e) {
			System.out.println("文件打不开或读文件错误");
		}	
	}

}

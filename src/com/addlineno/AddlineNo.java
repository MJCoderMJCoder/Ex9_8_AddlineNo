package com.addlineno;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class AddlineNo {

	public static void main(String[] args) {
		String str = null;
		try{
			FileReader file = new FileReader(".\\src\\com\\addlineno\\AddlineNo.java");
			LineNumberReader in = new LineNumberReader(file); //�����кŵĻ����ַ�������
			while ((str = in.readLine()) != null) //readLine():�����ж�ȡһ���ַ�
				System.out.println(in.getLineNumber() + ":" + str); //�����кź���ʾ
			in.close();
		} catch(IOException e) {
			System.out.println("�ļ��򲻿�����ļ�����");
		}	
	}

}

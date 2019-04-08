package com.yr.io.file;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		File file = new File("C:\\test\\ex1.txt");
		file = new File("c:\\test", "ex1.txt");
		file = new File("c:\\test");
		File file2 = new File(file, "ex1.txt");
		File file3 = new File("c:\\");

		System.out.println(file.exists());
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		System.out.println(file.getName());
		System.out.println(file.getParent());
		System.out.println(file.length());
		
		File[] list = file3.listFiles();
		String [] s = file3.list();
		for(int i =0; i <s.length;i++) {
			System.out.println(s[i]);
		}
		
		file = new File("c:\\test\\iu\\test");
	//	file.mkdir(); //디렉터리 만들기
	//	file.mkdirs(); // 중간에 없는 디렉토리명도 만들어줌
		
		file = new File("c:\\test\\test2");
		file.delete();
		
		
		
	}
}

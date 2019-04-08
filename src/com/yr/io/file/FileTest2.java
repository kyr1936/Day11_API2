package com.yr.io.file;

import java.io.File;

public class FileTest2 {

	public static void main(String[] args) {
		File file = new File("c:\\");
		//list
		//파일이라면 해당 파일의 크기 출력
		//디렉터리라면 폴더입니다 출력
		
		String [] s = file.list();
		for(int i =0; i <s.length;i++) {
			File file2 = new File(file, s[i]);
			if(file2.isFile()) {
				System.out.println(file2.length());
			} else if(file2.isDirectory()) {
				System.out.println("폴더입니다.");
			}
		}
		
		File[] lists = file.listFiles(); // 파일 객체로 리스트를 받아옴
		
		
	}
}

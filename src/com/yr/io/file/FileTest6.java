package com.yr.io.file;

import java.io.File;
import java.util.Calendar;


public class FileTest6 {

	public static void main(String[] args) {
		//c:\\test
		//자동으로 디렉터리 생성 단 , 중복되는 이름이 없도록
		//파일명이 해당 폴더 내에 같은 이름이 없다는 것을 보증
		//Random r = new Random();
		
		
		File file = new File("c:\\test\\");
		
		Calendar cal = Calendar.getInstance();
		long l = cal.getTimeInMillis();
		String name = Long.toString(l);
		System.out.println(name);
		
		
		File file2 = new File(file,name);
		
		file2.mkdir();
		
		
		

		
	}
}

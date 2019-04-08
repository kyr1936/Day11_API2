package com.yr.io.file;

import java.io.File;
import java.util.Scanner;

public class FileTest5 {

	public static void main(String[] args) {
		//스캐너를 이용하여 디렉터리명을 입력
		//c:\\test
		// 입력한 디렉터리가 있으면 삭제 없으면 만들기
		Scanner sc = new Scanner(System.in);
		

		System.out.println("디렉터리명 입력");
		String dir = sc.next();
		File file = new File("c:\\test", dir);
		/*
		File[] files = file.listFiles();
		

		for(int i =0; i<files.length;i++) {
			File newFile = new File(file, dir);
			if(dir.equals(files[i].getName())) {
				
				newFile.delete();
				System.out.println("디렉터리 삭제");
				break;
			} else {
				newFile.mkdir();
				System.out.println("디렉터리 생성");
			}
		}
		*/
		if(file.exists()) {
			file.delete();
		} else {
			file.mkdir();
		}



	}
}

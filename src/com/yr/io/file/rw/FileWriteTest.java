package com.yr.io.file.rw;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteTest {

	public static void main(String[] args) {
		
		File file = new File("c:\\test","writeTest.txt");
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(file, true);
			fw.write("1111Write\r\n"+"sss");		// \r\n 엔터
			fw.flush(); // 버퍼를 강제로 비움
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("파일작성 완료");
		
	}
}

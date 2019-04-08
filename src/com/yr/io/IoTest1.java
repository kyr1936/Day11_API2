package com.yr.io;

import java.io.IOException;
import java.io.InputStream;

public class IoTest1 {

	public static void main(String[] args) {
		System.out.println("입력");
		InputStream is = System.in;

		//read() : 1byte 만 읽어옴
		try {
			int num = is.read();
			System.out.println(num);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("종료");
	}
}

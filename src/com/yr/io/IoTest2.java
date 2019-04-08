package com.yr.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IoTest2 {

	public static void main(String[] args) {
		// 키보드로부터 받은 문자열을 출력
		//byte로 받아서
		//byte->문자
		//문자->문자열
		System.out.println("입력");
		InputStream is = System.in; //byte를 처리
		InputStreamReader ir = new InputStreamReader(is); // 문자를 처리
		BufferedReader br = new BufferedReader(ir);
		try {
			String str = br.readLine();
			System.out.println(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally { // 자원 해제
			try {
				br.close();
				ir.close();
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		// DDOS Distribute Denial of Service

	}

}

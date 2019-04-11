package com.yr.network.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientTest3 {

	public static void main(String[] args) {
		Socket s=null;
		OutputStream os=null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		Scanner sc = new Scanner(System.in);
		InputStream is=null;
		InputStreamReader ir=null;
		BufferedReader br = null;

		try {
			s = new Socket("211.238.142.44", 8180);
			System.out.println("서버와 접속 성공");
			
			
			System.out.println("점심 / 저녁 / 아무거나 : ");
			String str = sc.nextLine(); //점심/저녁/아무거나 선택
			os = s.getOutputStream();		
			ow = new OutputStreamWriter(os); //char 처리
			bw = new BufferedWriter(ow);
			bw.write(str);
			bw.write("\r\n");
			bw.flush();
			
			//서버가 고른 메뉴 불러옴
			is = s.getInputStream();		
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			str= br.readLine();
			
			System.out.println("메뉴: " + str);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();			
				ir.close();
				is.close();
				bw.close();
				ow.close();
				os.close();
				s.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


		}


			
			
	}
}

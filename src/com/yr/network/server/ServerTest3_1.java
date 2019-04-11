package com.yr.network.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerTest3_1 {

	public static void main(String[] args) {
		ServerSocket ss=null;
		Socket sc = null;
		InputStream is = null;
		InputStreamReader ir =null;
		BufferedReader br =null;
		Scanner scan = new Scanner(System.in);
		OutputStream os=null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		File file = new File("C:\\test");
		File lunch = new File(file, "lunch.txt");
		File dinner = new File(file, "dinner.txt");
		FileReader fr = null;
		ServerMenu sm = new ServerMenu();
		
		
		System.out.println("Server : Client 접속 받을 준비 중");
		try {
			sm.init();
			ss= new ServerSocket(8180);			
			sc = ss.accept();
			System.out.println("Server : 연결 성공");

			// 점심/저녁/아무거나 중 받아옴
			is= sc.getInputStream();
			ir=new InputStreamReader(is);
			br = new BufferedReader(ir);
			String str = br.readLine();
			System.out.println("Message : " + str);


			// 선택한 것 중 메뉴 한가지 보냄
			os = sc.getOutputStream();	//byte처리	
			ow = new OutputStreamWriter(os); //char처리
			bw = new BufferedWriter(ow); 
			
			if(str.equals("점심")) {
				str = sm.getLuch();
			} else if (str.equals("저녁")) {
				str = sm.getDinner();
				
			} else {
				
			}
		 	
			
			
			bw.write(str);
			bw.write("\r\n");
			bw.flush();
			
			
			
			
			
			
			
	
		} catch (Exception e) {
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

				sc.close();
				ss.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


		}


	}

}

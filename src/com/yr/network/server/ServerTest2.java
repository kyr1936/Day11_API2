package com.yr.network.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;
import java.util.Scanner;

public class ServerTest2 {

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


		System.out.println("Server : Client 접속 받을 준비 중");
		try {
			ss= new ServerSocket(8180);			
			sc = ss.accept();
			System.out.println("Server : 연결 성공");

			//사람이름 받아옴
			is= sc.getInputStream();
			ir=new InputStreamReader(is);
			br = new BufferedReader(ir);
			String str = br.readLine();
			System.out.println("Message : " + str);

			
			
			os = sc.getOutputStream();	//byte처리	
			ow = new OutputStreamWriter(os); //char처리
			bw = new BufferedWriter(ow); 
			

			String [] names = str.split(",");
			Random r= new Random();
			int index = r.nextInt(names.length);
			String name = names[index];
			bw.write(name);
			bw.write("\r\n");
			bw.flush();

			
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

				sc.close();
				ss.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}


	}
}

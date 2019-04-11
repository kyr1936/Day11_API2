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
import java.util.Scanner;

public class ServerTest {

	public static void main(String[] args) {
		ServerInfo si = new ServerInfo();
		ServerSocket ss=null;
		Socket sc = null;
		InputStream is=null;
		InputStreamReader ir=null;
		BufferedReader br = null;
		Scanner sc2 = new Scanner(System.in);
		OutputStream os=null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		try {
			System.out.println("Server : Client 접속 받을 준비 중");
			ss= new ServerSocket(8180);
			sc = ss.accept();
			System.out.println("Server : 연결 성공");
			
			while(true) {

				boolean check=si.receiveClient();
				if(!check) {
					break;
				}
				
				check=si.sendClient();
				if(!check ) {
					break;
				}
			} 
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
		System.out.println("서버 종료");
	}
}

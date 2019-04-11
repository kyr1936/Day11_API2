package com.yr.network.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import com.yr.network.server.ServerInfo;

public class ClientTest {
	private ClientInfo cn;
	
	public ClientTest() {
		cn = new ClientInfo();
	}

	public static void main(String[] args) {
		Socket s=null;


		try {
			s = new Socket("211.238.142.30", 8180);
			System.out.println("서버와 접속 성공");

			while(true) {
					os = s.getOutputStream(); //byte처리
					ow = new OutputStreamWriter(os); //char처리
					bw = new BufferedWriter(ow);
					System.out.println("서버로 보낼 메세지 입력 : ");
					String str = sc.nextLine();
					bw.write(str);
					bw.write("\r\n");
					bw.flush();

				String exit= "exit";
				if(str.equals(exit)) {
			//		s.close();
					break;
				}

				is = s.getInputStream(); 
				ir = new InputStreamReader(is);
				br = new BufferedReader(ir);
				str= br.readLine();
				if(str.equals(exit)) {
				//	s.close();
					break;
				}
				System.out.println("Message : " + str);



			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				ow.close();
				os.close();
				br.close();
				ir.close();
				is.close();

				s.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		System.out.println("Client 종료");
	}
}

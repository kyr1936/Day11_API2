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

public class ClientInfo {
	// sendServer()
	// receiveServer()
	private Socket s=null;
	private OutputStream os=null;
	private OutputStreamWriter ow = null;
	private BufferedWriter bw = null;
	private Scanner sc;
	private InputStream is=null;
	private InputStreamReader ir=null;
	private BufferedReader br = null;


	public void sendServer() {
		try {
			os = s.getOutputStream(); //byte처리		
			ow = new OutputStreamWriter(os); //char처리
			bw = new BufferedWriter(ow);
			System.out.println("서버로 보낼 메세지 입력 : ");
			String str = sc.nextLine();
			bw.write(str);
			bw.write("\r\n");
			bw.flush();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bw.close();			
				ow.close();
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}


	}

	public void receiveServer() {

		try {
			is = s.getInputStream();		
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			String str= br.readLine();
			System.out.println("Message : " + str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();		
				ir.close();
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}









	}
}

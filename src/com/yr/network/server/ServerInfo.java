package com.yr.network.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ServerInfo {
	//sendClient()
	//receiveClient()
	private Socket sc = null;
	private InputStream is=null;
	private InputStreamReader ir=null;
	private BufferedReader br = null;
	private Scanner sc2;
	private OutputStream os=null;
	private OutputStreamWriter ow = null;
	private BufferedWriter bw = null;


	public boolean receiveClient() throws IOException {

		is = sc.getInputStream();
		ir = new InputStreamReader(is);
		br = new BufferedReader(ir);
		String st= br.readLine();
		boolean check = true;
		if(st.equals("exit")) {
			check=!check;
		} else {
			System.out.println("Message : " + st);
		} return check;
	}	
	public boolean sendClient() throws IOException {

		os = sc.getOutputStream();	//byte처리	
		ow = new OutputStreamWriter(os); //char처리
		bw = new BufferedWriter(ow); 

		System.out.println("클라이언트에게 보낼 메세지 입력");
		String message = sc2.nextLine();
		bw.write(message);
		bw.write("\r\n");
		bw.flush();
		String exit = "exit";
		boolean check = true;
		if(message.equals(exit)) {
			check=!check;
		} else {
			System.out.println("Message : " + message);
		} 
		return check;
		}



}

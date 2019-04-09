package com.yr.io.file.rw;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MemberAdd {
	
	//backUp
	//파일 저장 경로 : 원래파일 readTest.txt 덮어쓰기
	public void backUp(ArrayList<Member> ar2) {
		File file = new File("c:\\test" , "readTest.txt");
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(file);
			fw.write("start\r\n");
			for(Member m:ar2) {
				StringBuffer sb = new StringBuffer();
				sb.append(m.getTeam());
				sb.append("-");
				sb.append(m.getName());
				sb.append("-");
				sb.append(m.getAge());
				sb.append("-");
				sb.append(m.getPosition());
				sb.append("-");
				sb.append(m.getEnt());
				sb.append("\r\n");
				
				fw.write(sb.toString());
				fw.flush();
				
				/*
				String team = m.getTeam();
				String name = m.getName();
				int age = m.getAge();
				String position = m.getPosition();
				String ent=m.getEnt();
				//형태
				
				fw.write(team+"-"+name+"-"+age+"-"+position+"-"+ent);
				fw.write("\r\n");
				*/
			}
			
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
		
		System.out.println("백업이 완료되었습니다.");
		
		
		
		
	}
	//addMember
	public void addMember(Scanner sc, ArrayList<Member> ar2) {
		Member member = new Member();
		System.out.println("그룹명을 입력하세요");
		member.setTeam(sc.next());
		System.out.println("이름을 입력하세요");
		member.setName(sc.next());
		System.out.println("나이를 입력하세요");
		member.setAge(sc.nextInt());
		System.out.println("포지션을 입력하세요");
		member.setPosition(sc.next());
		System.out.println("소속사를 입력하세요");
		member.setEnt(sc.next());
		
		ar2.add(member);
	}
}

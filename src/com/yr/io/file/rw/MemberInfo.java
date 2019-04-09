package com.yr.io.file.rw;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MemberInfo {
	private MemberView mv;
	public MemberInfo() {
		mv = new MemberView();
	}

	//searchGroup Scanner Array~~
	//1. 그룹명 2. 소속사
	private ArrayList<Member> searchEnt(Scanner sc, ArrayList<Member> ar2) {
		ArrayList<Member> se =new ArrayList<Member>();
		System.out.println("검색명을 입력하세요");
		String search = sc.next();
		for(Member m:ar2) {
			if(search.equals(m.getEnt())) {
				se.add(m);
			}
		}
		return se;
	}
	private ArrayList<Member> searchTeam(Scanner sc, ArrayList<Member>ar2) {
		ArrayList<Member> se = new ArrayList<Member>();

		System.out.println("검색명을 입력하세요");
		String search = sc.next();
		for(Member m:ar2) {
			if(search.equals(m.getTeam())) {
				se.add(m);
			}
		} return se;
	}

	public ArrayList<Member> searchGroup(Scanner sc, ArrayList<Member> ar2) {
		ArrayList<Member> se = null;
		System.out.println("무엇으로 검색");
		System.out.println("1. 그룹명   2. 소속사");
		int sel = sc.nextInt();
		if(sel==1) {
			se=this.searchTeam(sc, ar2);
		} else {
			se=this.searchEnt(sc, ar2);
		} return se;
	} 




//메서드명 searchMember / Scanner, ar2
// 이름을 입력해서 멤버를 찾기
public Member searchMember(Scanner sc, ArrayList<Member> ar2) {
	System.out.println("검색할 이름을 입력하세요");
	String name = sc.next();
	Member member = null;
	for(Member m:ar2) {
		if(name.equals(m.getName())) {
			member = m;
			break;
		}

	} return member;
}

// 메서드명 getMembers()
public ArrayList<Member> getMembers() {
	File file = new File("c:\\test", "readTest.txt");
	ArrayList<Member> ar2 = new ArrayList<Member>();
	FileReader fr = null;
	BufferedReader br =null;



	try {
		fr = new FileReader(file);
		br = new BufferedReader(fr); //보조
		// "abc \n efg" \n (개행문자) 까지 읽어들임
		String str = null;
		br.readLine();
		while(true) {
			str = br.readLine(); //한 줄 씩 read

			if(str==null) {
				break;
			}
			String [] ar = str.split("-");
			Member member = new Member();
			member.setTeam(ar[0]);
			member.setName(ar[1]);
			member.setAge(Integer.parseInt(ar[2]));
			member.setPosition(ar[3]);
			member.setEnt(ar[4]);

			ar2.add(member);
		}
		/*
				for(String s:ar) {
					System.out.println(s);
				}
		 */	

	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} finally {
		try {
			br.close();
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	return ar2;
}

}

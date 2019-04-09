package com.yr.io.file.rw;

import java.util.ArrayList;

public class MemberView {

	public void view(ArrayList<Member> ar2) {
		for(Member s:ar2) {
			//그룹명 이름 나이 역할 소속사
			System.out.print("그룹명 : " + s.getTeam() + "\t");
			System.out.print("이름 : " + s.getName() + "\t");
			System.out.print("나이 : " + s.getAge()+ "\t");
			System.out.print("포지션 : " + s.getPosition() + "\t");
			System.out.println("소속사 : " + s.getEnt() );
			
		}
	
	}
	//member 하나를 출력하는 메서드
	public void view(Member s) {
		System.out.print("그룹명 : " + s.getTeam() + "\t");
		System.out.print("이름 : " + s.getName() + "\t");
		System.out.print("나이 : " + s.getAge()+ "\t");
		System.out.print("포지션 : " + s.getPosition() + "\t");
		System.out.println("소속사 : " + s.getEnt() );
	}
	
	public void view (String s) {
		System.out.println(s);
	}
}

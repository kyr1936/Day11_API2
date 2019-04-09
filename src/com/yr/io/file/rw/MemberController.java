package com.yr.io.file.rw;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberController {
	private MemberInfo mi;
	private MemberView mv;
	private ArrayList<Member> ar2;
	private Scanner sc;
	private MemberAdd ma;
	public MemberController() {
		mi = new MemberInfo();
		mv = new MemberView();
		sc = new Scanner(System.in);
		ma = new MemberAdd();
	}
	public void start() {
		/*
		MemberInfo mi = new MemberInfo();
		ArrayList<Member> ar2=mi.getMembers();

		// 모든 이름을 출력
		MemberView mv = new MemberView();
		mv.view(ar2);
		 */

		//1.멤버정보가져오기
		//2.멤버정보출력하기
		//3.종료
		
		boolean check = true;
		while(check) {
			System.out.println("1. 멤버정보 가져오기");
			System.out.println("2. 멤버정보 출력하기");
			System.out.println("3. 멤버검색 출력하기");
			System.out.println("4. 그룹검색 출력하기");
			System.out.println("5. 멤버 추가");
			System.out.println("6. 백 업");
			System.out.println("7. 종 료");
			int select = sc.nextInt();

			switch(select) {
			case 1: 

				ar2 = mi.getMembers();
				break;
			case 2:

				mv.view(ar2);
				break;
			case 3:
				Member m = mi.searchMember(sc, ar2);
				if(m!=null) {
					mv.view(m);
				} else mv.view("멤버가 없습니다.");
				break;
			case 4:
				ArrayList<Member> se = mi.searchGroup(sc, ar2);
				if(se.size()>0) {
					mv.view(se);
				} else mv.view("해당 데이터가 없습니다");
				break;
			case 5: ma.addMember(sc, ar2);
				break;
			case 6: ma.backUp(ar2);
			
				break;
			default:
				System.out.println("종료합니다.");
				check=false;
				sc.close();
			} 
		}


	}
}

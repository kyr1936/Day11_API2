package com.yr.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest1 {

	public static void main(String[] args) {
		//Error, Exception
		//Error : 컴파일 시 에러
		//Exception : 실행 중 발생하는 에러
		//예외처리
		//목적 : 비정상적인 종료를 막고 정상적으로 프로그램을 진행
		//방법 : 
		// 1. try{ 예외가 발생할 만한 코드} 
		//		catch(발생할 Exception 타입의 매개변수) 
		//		{예외가 발생했을 때 실행되는 부분}
		//	} finally {
		//		예외가 발생 하든 안하든 무조건 실행
		//		}
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력");
		int result;
		int num =0;
		int a=10;
		try {
			num=sc.nextInt();
			result = a/num;
			//throw new ArithmeticException();
			int [] ar = new int[result];
			System.out.println(ar[100]);
		} catch (Exception e) {
			// 개발시에는 예외 메세지 확인
			e.printStackTrace();
			//배포시에는 변경
		}
		System.out.println(a+num);
		System.out.println("종료");





	}
}

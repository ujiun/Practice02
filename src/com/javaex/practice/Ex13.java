package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요");
		System.out.print("숫자: ");
		double num = sc.nextDouble();
		
		double x;
		
		if (num<=0) {
			 x = (num*num*num)-9*num+2;
		}else {
			 x = (7*num)+2;
		}
		
		System.out.println("계산결과는 " + x + "입니다.");
		
		sc.close();
	}

}

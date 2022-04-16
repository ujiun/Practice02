package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자: ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자: ");
		int num2 = sc.nextInt();
		
		int result = num1-num2;
		int share = num1/num2;
		int remainder = num1%num2;
		
		int share2 = num2/num1;
		int remainder2 = num2%num1;
		
		
		if(result>0) {
			System.out.println("목: " + share);
			System.out.println("나머지: " + remainder);
		}else {
			System.out.println("목: " + share2);
			System.out.println("나머지: " + remainder2);
		}
		
		
		sc.close();
	}
}

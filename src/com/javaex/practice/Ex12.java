package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("출력되는 내용을 입력하세요");
		System.out.print("기호: ");
		String operator = sc.nextLine();
		System.out.print("숫자1: ");
		double num1 = sc.nextDouble();
		System.out.print("숫자2: ");
		double num2 = sc.nextDouble();
		
	    double result;					
		
		if(operator.equals("+")) {			// equals
			result = num1 + num2;
			System.out.println("결과는: " + result );
		}else if(operator.equals("-")) {
			result = num1 - num2;
			System.out.println("결과는: " + result );
		}else if(operator.equals("*")) {
			result = num1 * num2;
			System.out.println("결과는: " + result );
		}else if(operator.equals("/")) {
			if(num2==0) {
				System.out.println("계산할 수 없습니다.");
			} else {
					result = num1 / num2;
					System.out.println("결과는: " + result);
			}
		}else {
			System.out.println("계산할 수 없는 기호입니다.");
		}		
	
		sc.close();

	}

}

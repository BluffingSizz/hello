package ch01;

import java.util.Scanner;

public class Scan1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x ;
		
		System.out.print("숫자를 입력하시오:");
		x = sc.nextInt();
		
		if(x % 2 == 0) {
			System.out.print(x+"는 짝수 입니다.");
		}
		else {
			System.out.print(x+"는 홀수 입니다.");
		}
		
		
		
		
		
		
		
		
		sc.close();
		
		
	}
	
	

}

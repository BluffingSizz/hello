package ch05;

import java.util.Scanner;

public class InputSum {
	public static void main(String[] args) {
		int [] num = new int[5];
		int sum =0;
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<num.length; i++) {
			System.out.print((i+1)+"번째 숫자를 입력하세요");
			//0+1번째, 즉 0번째를 첫번째로 보이게 하려고 처리
			num[i]=scan.nextInt();
			sum = sum+num[i];
		}
		System.out.println("합계 : "+sum);
		scan.close();
				
	}

}

package playground;

import java.util.Scanner;

public class ArrayScanScore {
	
	public static void main(String[] args) {
		int a;
		int total =0;
		double avg = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("성적처리할 학생수를 입력하시오 :");
		a = sc.nextInt();
		int[] score = new int[a];
		for(int i=0;i<score.length;i++) {
			System.out.println("성적을 입력하시오 :");
			score[i] = sc.nextInt();
			total += score[i];
		}
		sc.close();
		avg = (double)total/(double)a;
		System.out.println("총점은 "+total+"점 입니다.");
		System.out.println("평균 성적은 "+String.format("%4.1f", avg)+"점 입니다.");
	}

}

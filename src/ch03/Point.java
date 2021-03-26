package ch03;

import java.util.Scanner;

//성적계산 프로그램
//국어,영어,수학점수를 입력받아 총점,평균 출력
public class Point {
	
	public static void main(String[] args) {
		//변수 선언
		String name;
		int kor, eng, math, tot;
		double avg;
		
		//스캐너 입력객체 생성
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 : ");
		name = scan.next(); //문자열 입력
		System.out.print("국어점수 : ");
		kor = scan.nextInt();
		System.out.print("영어점수 : ");
		eng = scan.nextInt();
		System.out.print("수학점수 : ");
		math = scan.nextInt();
		scan.close();//스캐너 객체가 사용중인 메모리 정리
		//계산
		tot = kor + eng + math;
		avg = tot / 3.0;
		//결과 출력
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
//		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+tot+"\t"+avg);
//		
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%4.1f",name,kor,eng,math,tot,avg);
		
	}

}

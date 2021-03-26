package playground;

import java.util.Scanner;

public class ArrayPoint3 {
	public static void main(String[] args) {
		String[] name = {"홍길동","이순신","김유신"};
		int kor[] = new int[3];
		int eng[] = new int[3];
		int mat[] = new int[3];
		int tot[] = new int[3];
		double avg[] = new double[3];
		double tot_avg = 0;
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<3;i++) {
			System.out.println(name[i]+"의 국어점수를 입력하세요.");
			kor[i] = sc.nextInt();
			System.out.println(name[i]+"의 영어점수를 입력하세요.");
			eng[i] = sc.nextInt();
		    System.out.println(name[i]+"의 수학점수를 입력하세요.");
		    mat[i] = sc.nextInt();
	   tot[i]=kor[i]+eng[i]+mat[i];
	   avg[i]=tot[i]/3.0;
	}//for1
		sc.close();
		for(int i =0; i<3;i++) {
			System.out.println("이름 : "+name[i]);
			System.out.println("국어 : "+kor[i]);
			System.out.println("영어 : "+eng[i]);
			System.out.println("수학 : "+mat[i]);
			System.out.println("총점 : "+tot[i]);
			System.out.println("평균 : "+String.format("%4.1f", avg[i]));
			System.out.println("");
			tot_avg +=avg[i];
		}//for 2
		System.out.println("학급평균 : "+String.format("%4.1f",tot_avg/3.0));
}
}

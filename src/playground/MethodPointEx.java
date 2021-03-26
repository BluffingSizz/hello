package playground;

import java.util.Scanner;

public class MethodPointEx {
	
	public static int[] score(String a) {
	    int kor,eng,mat,tot;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("국어점수를 입력하세요 : ");
	    kor = sc.nextInt();
	    System.out.println("영어점수를 입력하세요 : ");
	    eng = sc.nextInt();
	    System.out.println("수학점수를 입력하세요 : ");
	    mat = sc.nextInt();
	    tot = kor+eng+mat;
	    int[] i = {kor,eng,mat,tot};
	    return i;


	    
	}
	public static double avg(int[] a) {
		
		return a[3]/3.0;
		}
	
	public static void result(int [] a) {
		System.out.println("국어 : "+a[0]);
		System.out.println("수학 : "+a[1]);
		System.out.println("영어 : "+a[2]);
		System.out.println("총점 : "+a[3]);
	}

	public static void main(String[] args) {
		System.out.println("========================================");
		Scanner sc =new Scanner(System.in);
		String name1;
		String name2;
		
		System.out.println("이름을 입력하세요 : ");
		name1 = sc.next();
		int [] a = score(name1);
		System.out.println("이름을 입력하세요 : ");
		name2 = sc.next();
		int [] b = score(name2);
		
		
		
		System.out.println("--------------------");
		System.out.println("미래학교 성적 데이터");
		System.out.println("학생수 : 2명");
		System.out.println("--------------------");
		System.out.println(name1+" 점수");
		result(a);
		System.out.println("평균 : "+avg(a));
		System.out.println("--------------------");
		System.out.println(name2+" 점수");
		result(b);
		System.out.println("평균 : "+avg(b));
		System.out.println("--------------------");
		System.out.println("전체평균 : "+((avg(a)+avg(b))/2.0));
		System.out.println("--------------------");
		
		sc.close();
		
		
	}

}

package playground;

import java.util.Scanner;

public class Point_If_Ex {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    String name,grade;
	    int kor,eng,mat,tot;
	    double avg;
	    
	    System.out.print("이름:");
	    name = sc.next();
	    System.out.print("국어:");
	    kor = sc.nextInt();
	    System.out.print("영어:");
	    eng = sc.nextInt();
	    System.out.print("수학:");
	    mat = sc.nextInt();
	    tot = kor+eng+mat;
	    avg = tot/3.0;
	    sc.close();
	    
	    if (avg >=90) {
	    	grade="수";
	    }else if (avg >=80) {
	    	grade ="우";
	    }else if (avg >=70) {
	    	grade = "미";
	    }else if (avg >=60) {
	    	grade = "양";
	    }else {
	    	grade = "가";
	    }
	    System.out.println("======================================================");
	    System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t등급");
	    System.out.printf("%s\t%d\t%d\t%d\t%d\t%4.1f\t%s\n",name,kor,eng,mat,tot,avg,grade);
	    System.out.println("======================================================");
	    
	    
	}

}

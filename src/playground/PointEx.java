package playground;

import java.util.Scanner;

public class PointEx {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name; int java,DB,HTML,JSP,tot;
		double avg;
		
		System.out.print("이름 : ");
		name = sc.next();
		System.out.print("java점수 : ");
		java = sc.nextInt();
		System.out.print("DB점수 : ");
		DB = sc.nextInt();
		System.out.print("HTML점수 : ");
		HTML = sc.nextInt();
		System.out.print("JSP점수 : ");
		JSP = sc.nextInt();
		sc.close();
		tot = java+DB+HTML+JSP;
		avg = tot/40.0;
		
		System.out.println("==========================================================");
		System.out.println("이름\tjava\tDB\tHTML\tJSP\t총점\t평균");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%4.1f\n",name,java,DB,HTML,JSP,tot,avg);
		System.out.println("==========================================================");
				
	}
}

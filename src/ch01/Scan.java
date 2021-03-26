package ch01;
import java.util.Scanner;

public class Scan {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	String name;
	long Math;
	
	System.out.print("이름?");
	name = sc.nextLine();
	System.out.print("수학?");
	Math= sc.nextInt();
	
	System.out.println(name +":" +Math);
	
	sc.close();
	}

}

package ch04;

public class Matrix {
	public static void main(String[] args) {
		for(int i =1; i<=5; i++) {//i=1
			for (int j = 1; j<=5; j++) {//j=2
				System.out.printf("[%d,%d]",i,j);
			}//inner for
			System.out.println();
		}//outer for
	}//end main

}
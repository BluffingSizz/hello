package ch04;

public class Star3Ex {
	public static void main(String[] args) {
		for(int i=0; i<4; i++) {
			for (int j=0; j<3-i; j++) {
				System.out.print(" ");
			}//inner for
			for (int j =0; j<2*i+1;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}//outer for
	}

}

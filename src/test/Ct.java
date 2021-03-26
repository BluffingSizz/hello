package test;

public class Ct {
	
	public static void main(String[] args) {
		int x = 1;
		int y = 3;
		
		System.out.println((x=y) == x);
		x = 1;
		System.out.println(x == (x=y));
	}

}

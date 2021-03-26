package ch06;

public class Gugu {
	
	public static void main(String[] args) {
		gugu(3);
		gugu(4);
	}

	public static void gugu(int dan) {
		System.out.println("===="+dan+"단====");
		for(int i=0;i<=9;i++) {
			System.out.println(dan+" x "+i+" = "+dan*i);
		}
		
	}

}

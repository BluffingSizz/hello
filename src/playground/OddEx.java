package playground;

public class OddEx {
	public static void main(String[] args) {
		
		int n =0;
		for (int i=1;i<=10;i++) {
			if (i % 2 ==1) {
			n= n+i;
			}
		}
		System.out.println("1~10까지의 홀수값의 합은? "+n);
	}

}

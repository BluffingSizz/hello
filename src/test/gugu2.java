package test;

public class gugu2 {
	public static void main(String[] args) {
		for(int i =2; i<10; i++) {
			for (int j=1; j<10; j++) {
			Calculator.print(i, j);
			System.out.println(Calculator.result(i, j));
			}
		}
	}

}

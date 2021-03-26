package ch06;

public class MethodDemo {
	
	public static void main(String[] args) {
		int sum =0;
		sum += 1;//
		
		System.out.println("합(1~10) : " + sum);
		
		sum =0;
		
		for(int i =10; i<=100; i++) {
			sum += i;
		}
		System.out.println("합(10~100) : " + sum);
		
		sum =0;
		for(int i=100; i<=1000; i++) {
			sum += i;
		}
		System.out.println("합(100~1000) : " + sum);
	}

}

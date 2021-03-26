package ch05;

public class ArrayTest4 {
	
	public static void main(String[] args) {
		int[] numbers = {10, 20, 30};
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		//문제 - 향상된 for문으로 바꾸어서 출력
		
		for(int ss : numbers) {
			System.out.println(ss);
		}
	}

}

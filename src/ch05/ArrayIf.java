package ch05;

public class ArrayIf {
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50,60,70,80,90,100};
		if(arr!=null) {//null값은 값이없다라는 의미, !=은 not(부정)의 의미
			//즉, 값이 있으면
			for(int i =0; i<9; i++) {
				System.out.print(arr[i]+",");
			}
			System.out.print(arr[9]);
			
		}
	}

}

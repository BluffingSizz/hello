package ch05;

public class ArrayTest1 {
	public static void main(String[] args) {
		int[] s = new int[10];//배열의 크기를 지정하여 배열생성
		for(int i =0; i<s.length;i++) {
			s[i] = i;
			System.out.print(s[i]+" ");
		}
	}

}

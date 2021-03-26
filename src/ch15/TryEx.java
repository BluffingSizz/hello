package ch15;

public class TryEx {
	public static void main(String[] args) {
        int[] num= {10,20,30,40,50};
		
		try {
			for(int i=0; i<=num.length; i++) {
				System.out.println(num[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			//ArrayIndexOutOfBoundsException : 배열의 인덱스 범위를
			//초과할 때 발생
			e.printStackTrace();
		}
	}

}

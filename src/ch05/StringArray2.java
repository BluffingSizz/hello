package ch05;

public class StringArray2 {
	public static void main(String[] args) {
		String[] str = {"java", "DB","JSP","Android"};
		for(int i=0; i<str.length; i++) {
			System.out.println(str[i]);
		}
		//향상된 for문 사용
		//for(개별값 저장 변수 : 집합변수)
		for(String ss : str) {
			System.out.println(ss);
		}
	}

}

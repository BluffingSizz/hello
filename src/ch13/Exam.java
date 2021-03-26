package ch13;

//import java.lang.*;가 생략되어있음

public class Exam {//extends Object가 생략
	public static void main(String[] args) {
		String a="hello";
		String b="hello";
		System.out.println(a==b);//결과:true(a와 b의 주소가가 같음)
		String c = new String("hello");//new하면 새로운 주소(100번지)
		String d = new String("hello");//new하면 새로운 주소(200번지)
		System.out.println(c==d);//결과:false(주소값이 다름)
		System.out.println(c.equals(d));//true(내용비교)
		
		
	}

}

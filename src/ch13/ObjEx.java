package ch13;

public class ObjEx {
	public static void main(String[] args) {
		ObjEx e1=new ObjEx();//객체생성 및 기본생성자 호출
		System.out.println(e1.getClass());//클래스의 정보
		System.out.println(e1);//객체의 주소값
		System.out.println(e1.toString());//Object를 문자열로 반환
	}
	

}

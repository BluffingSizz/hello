package ch14;

public class Type3<T> {
	T t;//변수도 자료형 미정
	public void setT(T t) {//메소드도 자료형 미정
		this.t = t;
	}
	public T getT() {
		return t;
	}
	
	public static void main(String[] args) {
		Type3 <String> t = new Type3<String>();
		t.setT("100");
		System.out.println(t.getT());
		
		Type3<Integer> t2 = new Type3<Integer>();
		t2.setT(100);
		System.out.println(t.getT());
		
		Type3 t3 = new Type3();//<>자료형을 주지않고 일반적인 new로 처리
		t3.setT(100.5);//Object로 처리
		t3.setT("hello");//Object로 처리
		
		System.out.println(t3.getT());
	}

}

package ch14;

public class Box2<T> {//<T>는 타입매개변수가 된다. T말고도 다른문자를 써도 된다.
	private T data;
	public void set(T data) {
		this.data = data;
	}
	public T get() {
		return data;
	}
	
	public static void main(String[] args) {
		Box2<String> b = new Box2<String>();//타입매개변수에 대입하게될 String지정
		b.set("Hello World!");//문자열 타입 저장
		String s = b.get();
		Box2<Integer> c = new Box2<Integer>();//타입매개변수에 Integer지정
		c.set(10);
		Integer i = c.get();
		
		System.out.println(s);
		System.out.println(i);
	}

}

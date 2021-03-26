package ch13;

public class Box {
	private Object data;
	public void set(Object data) {
		this.data = data;
	}
	public Object get() {
		return data;
	}
	
	public static void main(String[] args) {
		Box b = new Box();
		b.set("Hello World!");//문자열 객체를 저장
		String s = b.get();
		
	}

}
